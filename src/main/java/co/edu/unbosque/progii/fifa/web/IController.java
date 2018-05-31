package co.edu.unbosque.progii.fifa.web;

public interface IController<E> {

	void guardar();
	void actualizar(E e);
	void eliminar(E e);
}
