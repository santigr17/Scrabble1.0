package Listasinterfaces;
/**
 * Modelo que las listas deben seguir.
 * @param <E> esto implementa generics que nos va dejar almacenar cualquier tipo
 * en la estructura.
 */
public interface InterfazLista<E> extends EstructuraDatos<E> {
	/**
	 * Añade al final de la lista
	 * @param pelemento
	 * @return
	 */
    public boolean agregar(E pelemento);
    
    /**
     * Elimina el elemento especificado en el parametro
     * @param pelemento
     * @return
     */
    public boolean eliminar(E pelemento);
    
    /**
     * Inserta en la posicion especificada
     * @param pos integer
     * @param pelemento elemento a insertar
     * @return
     */
    public boolean insertar(int pos, E pelemento);
    
    /**
     * Elimina los elementos de la lista
     * @return
     */
    public boolean limpiar();

}