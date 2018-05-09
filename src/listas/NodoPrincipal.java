/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author LUIS POTTE
 */
public class NodoPrincipal {

    private String info;
    private NodoPrincipal siguiente;
    private NodoPrincipal anterior;
    private ListaSimple nodos = new ListaSimple();
    //La lista #nodos# funciona en forma de col aquí se tendrán links de otras listas enlazadas al la lista principal

    public NodoPrincipal(String ob) {
        this.anterior = null;
        this.siguiente = null;
        this.info = ob;
    }

    public NodoPrincipal getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPrincipal siguiente) {
        this.siguiente = siguiente;
    }

    public NodoPrincipal getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPrincipal anterior) {
        this.anterior = anterior;
    }

    public void add_sublista(NodoSegundario nvo) {
        nodos.agregaralfinal(nvo);
    }

    public void print_sublist() {
        NodoSegundario subnodo = nodos.getInicio();
        while (subnodo != null) {
            NodoSegundario u = (NodoSegundario) subnodo.getInfo();
            System.out.println("  "+u.getInfo());
            u = u.getSiguiente();
            while(u!=null){
                System.out.println("    "+u.getInfo());
                u = u.getSiguiente();
            }
            subnodo = subnodo.getSiguiente();
        }
    }
    
    public void add_elemento_sublista(Object b, Object c){
        NodoSegundario aux = nodos.getInicio();
        NodoSegundario info = (NodoSegundario) aux.getInfo();
        while (aux != null && !info.getInfo().equals(b)) {
            aux = aux.getSiguiente();
            if(aux != null){
               info = (NodoSegundario) aux.getInfo(); 
            }
        }
        if (aux!= null){
            NodoSegundario aux2 = (NodoSegundario) aux.getInfo();
        while(aux2.getSiguiente() != null){
            aux2 = aux2.getSiguiente();
        }
        NodoSegundario nvo = new NodoSegundario(c);
        aux2.setSiguiente(nvo);
        }else{
            System.out.println("No existe l asublista");
        }
        
    }
    
    public void eliminar_elemento_sublista(Object nomSublist, Object elemento) {
        NodoSegundario aux = nodos.getInicio();
        NodoSegundario info = (NodoSegundario) aux.getInfo();
        Object primer_elemento = info.getSiguiente().getInfo();
        while (aux != null && !info.getInfo().equals(nomSublist)) {
            aux = aux.getSiguiente();
            info = (NodoSegundario) aux.getInfo();
        }
        NodoSegundario aux2 = (NodoSegundario) aux.getInfo();
        NodoSegundario ant = null;
        while(aux2.getSiguiente() != null && !aux2.getInfo().equals(elemento)){
            ant=aux2;
            aux2 = aux2.getSiguiente();
        }
        if (aux2.getSiguiente() == null){
            ant.setSiguiente(null);
        }else{
            if(aux2.equals(primer_elemento)){
                nodos.getInicio().setSiguiente(aux2.getSiguiente());
            }else{
                ant.setSiguiente(aux2.getSiguiente());
                aux2.setSiguiente(null);
            }
        }
        
    }

    public void setlink(int i, NodoSegundario nvo) {
        try {
            NodoSegundario aux = nodos.getInicio();
            int j = 0;
            while (aux != null && j != i) {
                aux = aux.getSiguiente();
                j++;
            }
            aux.setInfo(nvo);
        } catch (NullPointerException e) {
        }
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public NodoSegundario getSublista(Object b) {
        NodoSegundario p = nodos.getInicio();
        while(!p.getInfo().equals(b) && p!=null){
            p=p.getSiguiente();
        }
        return p;
    }

    public ListaSimple getNodos() {
        return nodos;
    }

    public NodoSegundario getSubnodo(Object b, Object c) {
        NodoSegundario aux2;
        NodoSegundario aux = nodos.getInicio();
        NodoSegundario info = (NodoSegundario) aux.getInfo();
        while (aux != null && !info.getInfo().equals(b)) {
            aux = aux.getSiguiente();
            if(aux != null){
               info = (NodoSegundario) aux.getInfo(); 
            }
        }
        if (aux!= null){
            aux2 = (NodoSegundario) aux.getInfo();
        while(aux2.getSiguiente() != null && !aux2.getInfo().equals(c)){
            aux2 = aux2.getSiguiente();
        }
        return aux2;
        }else{
            System.out.println("No existe l asublista");
            return null;
        }
    }
    
    


    

}
