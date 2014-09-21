package ListasSimples;
public class NodoListaSimple<E> 
{
    
    protected E elem;
    protected NodoListaSimple<E> siguiente;
    
    boolean ocupado=false;
    String letra="";
    
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
    public boolean getocupado(){
        return this.ocupado;
    }
    public void setocupado(boolean estado){
        if(estado==true){
            this.ocupado=true;
        }
        else{
            this.ocupado=false;
        }
    }
    public String getLetra() {
        return letra;
    }
    public void setLetra(String Letra){
        this.letra=Letra; 
    }
    
           
}
