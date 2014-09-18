package ListasSimples;
import Listasinterfaces.InterfazLista;
public class ListaSimple<E> implements InterfazLista<E>
{
    
    protected int length;
    protected NodoListaSimple<E> head;
    protected NodoListaSimple<E> tail;

    public ListaSimple() 
    {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    
    @Override
    public boolean vacio() 
    {
        return this.length == 0;
    }

    @Override
    public boolean agregar(E pelemento) 
    {
        NodoListaSimple<E> nodo = new NodoListaSimple<E>(pelemento);

        if(vacio()) 
        {
            this.head = nodo;
        } 
        else 
        {
            this.tail.setNext(nodo);
        }
        this.tail = nodo;
        this.length += 1;
        return true;
    }

    @Override
    public boolean eliminar(E pelemento) 
    {
        if(vacio()) 
        {
            return false;
        }
        NodoListaSimple<E> nodoanterior = null;
        NodoListaSimple<E> nodoactual = this.head;
        while(nodoactual != null) 
        {
            if(nodoactual.getElem().equals(pelemento)) 
            {
                break;
            }
            nodoanterior = nodoactual;
            nodoanterior = nodoactual.getNext();
        }

        if(nodoactual == null) 
        {
            return false;
        }
        
        if(nodoactual == this.head) 
        {
            this.head = nodoactual.getNext();
        }

        if(nodoactual == this.tail) 
        {
            this.tail = nodoanterior;
        }

        if(nodoanterior != null) 
        {
            nodoanterior.setNext(nodoactual.getNext());
        }
        nodoactual.setNext(null);
        nodoactual = null;
        this.length -= 1;
        return true;
    }

    @Override
    public int tamaño() 
    {
        return this.length;
    }

    @Override
    public boolean existe(E pelemento) 
    {
        NodoListaSimple<E> nodoactual = this.head;
        while (nodoactual.getNext() != null)
            if (nodoactual.getElem() == pelemento)
            {
                return true;
            }
            else
            {
                nodoactual = nodoactual.getNext();
            }
        return false;
    }

    @Override
    public boolean insertar(int pos, E pelemento) {

        NodoListaSimple<E> nodo = new NodoListaSimple<E>(pelemento);

        if((pos < 0) || (pos > this.length)) {
            return false;
        }

        NodoListaSimple<E> nodoanterior = null;
        NodoListaSimple<E> nodoactual = this.head;
        for(int i = 0; i != pos; i++) {
            nodoanterior = nodoactual;
            nodoactual = nodoactual.getNext();
        }

        nodo.setNext(nodoactual);
        if(nodoanterior != null) 
        {
            nodoanterior.setNext(nodo);
        }

        if(nodoactual == this.head) 
        {
            this.head = nodo;
        }
        if(nodoanterior == this.tail) 
        {
            this.tail = nodo;
        }

        this.length += 1;
        return true;
    }

    @Override
    public boolean limpiar() 
    {
        NodoListaSimple<E> temp = null;
        while(this.head != null) 
        {
            temp = this.head.getNext(); 
            this.head.setNext(null);
            this.head = temp;
        }
        this.tail = null;
        this.length = 0;
        return true;
    }
    @Override
    public void describir()
    {
        NodoListaSimple<E> nodoactual = this.head;
        while(nodoactual.getNext()!= null)
        {
            System.out.print(nodoactual.getElem());
            System.out.print(" ");
            nodoactual = nodoactual.getNext();
        }
        System.out.println(nodoactual.getElem());
        System.out.print("Cabeza: ");
        System.out.println(this.head.getElem());
        System.out.print("Cola: ");
        System.out.println(this.tail.getElem());
        System.out.print("Tamaño: ");
        System.out.println(this.length); 
    }
    
    public E cortar ()
    {
        if (this.length == 1)
        {
            E temporal = this.head.getElem();
            this.head = null;
            this.length-= 1;
            return temporal;
        }
        else
        {
            NodoListaSimple<E> nodoactual = this.head;
            while (nodoactual.getNext() != this.tail)
            {
                nodoactual = nodoactual.getNext();
            }
            this.tail = nodoactual;
            nodoactual.setNext(null);
            this.length -= 1;
            return nodoactual.getElem();
        }
    }
    public E cola()
    {
        return this.tail.getElem();
    }

}