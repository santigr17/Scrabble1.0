/**
 * 
 */
package Listasinterfaces;

public interface EstructuraDatos <E> {
	/**
	 * Devuelve el tamaño de una lista
	 * @return un integer
	 */
	public int tamaño();
	
	/**
	 * Describe si la lista esta vacia 
	 * @return true or false
	 */
	public boolean vacio();
	
    /**
     * Describe los elementos de la lista. Length, head , list, tail.
     * @return la descripcion de esta.
     */
    public void describir();
	
    /**
     * Describe si el elemento se encuentra en la lista
     * @param pelemento
     * @return
     */
    public boolean existe(E pelemento);
}
