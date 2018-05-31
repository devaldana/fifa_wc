package co.edu.unbosque.progii.fifa;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import static co.edu.unbosque.progii.fifa.util.Global.*;

@EnableWebMvc
@Configuration
@EnableTransactionManagement
@PropertySource( CONFIG_FILE_LOCATION )
@EnableJpaRepositories(JPA_REPOSITORY_PACKAGE)
@ComponentScan(basePackages= { SERVICES_PACKAGE, CONTROLLERS_PACKAGE })
public class WebConfig extends WebMvcConfigurerAdapter implements WebApplicationInitializer {
	
	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
			
			final DriverManagerDataSource dataSource = new DriverManagerDataSource();

			dataSource.setUrl(env.getProperty(DB_URL_PROPERTY));
			dataSource.setUsername(env.getProperty(DB_USERNAME_PROPERTY));
			dataSource.setPassword(env.getProperty(DB_PASSWORD_PROPERTY));
			dataSource.setDriverClassName(env.getProperty(DB_DRIVERCLASS_PROPERTY));

			return dataSource;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		
		return new JpaTransactionManager(emf);
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		
		jpaVendorAdapter.setDatabase( Database.values()[ Integer.parseInt( env.getProperty(DB_BRAND_PROPERTY) ) ] );
		jpaVendorAdapter.setGenerateDdl(false);
		
		return jpaVendorAdapter;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean lemfb = new LocalContainerEntityManagerFactoryBean();
		
		lemfb.setDataSource( dataSource() );
		lemfb.setJpaVendorAdapter( jpaVendorAdapter() );
		lemfb.setPackagesToScan( ENTITIES_PACKAGE );
		
		return lemfb;
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(WebConfig.class);

		servletContext.addListener(new ContextLoaderListener(rootContext));

		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(rootContext));
		
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
}
