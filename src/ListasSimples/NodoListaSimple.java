package ListasSimples;
public class NodoListaSimple<E> 
{
    
    protected E elem;
    protected NodoListaSimple<E> siguiente;
    
    public NodoListaSimple(E elemento) {
        this.elem = elemento;
        this.siguiente = null;
    }
    public NodoListaSimple(E elemento, NodoListaSimple<E> siguiente) {
        this.elem = elemento;
        this.siguiente = siguiente;
    }
    
    public void setNext(NodoListaSimple<E> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaSimple<E> getNext() {
        return this.siguiente;
    }
    
    public void setelement(E pelemento){
        this.elem = pelemento;
    }
    public E getelem() {
        return this.elem;
    }
}
