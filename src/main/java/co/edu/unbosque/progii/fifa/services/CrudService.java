package co.edu.unbosque.progii.fifa.services;

import java.io.Serializable;
import java.util.List;

/**
 * Interfaz base para operaciones CRUD.<p>
 *
 * @param E tipo de entidad (<code>@Entity</code>) a persistir y administrar.
 * @param ID tipo del identificador de la entidad (alguna clase de ID).
 * 
 * @author David Aldana
 * @author Douglas Solano
 * @author Alejandra López
 *
 * @since 2018.05
 * 
 */
public interface CrudService<E, ID extends Serializable> {
 
	/**
	 * Guarda la entidad pasada por parámetro; si la entidad existe (<code> id != null </code>) actualiza la entidad correspondiente.
	 * 
	 * @param entity la entidad a ser guardada.
	 * @return la entidad guardada ó actualizada.
	 */
	E guardar(E entity);
	
	/**
	 * Busca la entidad con el <code>id</code> indicado. 
	 * 
	 * @param id de la entidad a buscar.
	 * @return la entidad encontrada ó <code>null</code> si no fue encontrada una entidad con el <code>id</code> indicado.
	 */
	E buscar(ID id);
	
	/**
	 * Elimina la entidad con el <code>id</code> indicado.
	 * 
	 * @param id de la entidad a eliminar.
	 * @return <code>true</code> si la entidad fue eliminada, <code>false</code> en caso contrario.
	 */
	void eliminar(ID id);
	
	
	/**
	 * Retorna una lista con todos los elementos persistidos.
	 * 
	 * @return lista con los elementos existentes ó una lista vacía si no hay elementos persistidos.
	 */
	List<E> listarTodo();

}