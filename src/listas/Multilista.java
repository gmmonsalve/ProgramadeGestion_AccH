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
public class Multilista extends Lista{
    private NodoPrincipal inicio;
    private NodoPrincipal Ultimo;
    public Multilista() {
    }
    
    public void add_nodoprincipal(Object n){
        NodoPrincipal nvo = new NodoPrincipal((String)n);
        if (inicio == null) {
            inicio = nvo;
        } else {
            NodoPrincipal aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            nvo.setAnterior(aux);
            aux.setSiguiente(nvo);
        }
        tamaño++;
    }

    public NodoPrincipal getNodo(Object o) {
        NodoPrincipal s = inicio;
        while (!s.getInfo().equals(o) && s!=null) {
            s = s.getSiguiente();
        }
        return s;
    }
    
    public NodoSegundario getSubnodo(Object a, Object b, Object c){
        NodoPrincipal aux = getNodo(a);
        return aux.getSubnodo(b, c);
    }
    
    public void add_sublista(Object p, Object info){
        NodoPrincipal aux = getNodo(p);
        NodoSegundario nvo = new NodoSegundario(info);
        aux.add_sublista(nvo);
    }
    
    public void print() {
        NodoPrincipal aux = inicio;
        while (aux != null) {
            System.out.println(": " + aux.getInfo());
            aux.print_sublist();
            aux = aux.getSiguiente();
        }
    }

    public void add_elmento_sublist(Object a, Object b, Object c) {
        NodoPrincipal aux = getNodo(a);
        aux.add_elemento_sublista(b,c); 
    }
    
    public void eliminar_sublist(Object nom){
        try{
        NodoPrincipal p = inicio;
        while (p != null && !p.getInfo().equals((String) nom)) {
            p = p.getSiguiente();
        }
        if (p == inicio) {
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
        } else {
            NodoPrincipal ultm = getult();
            if (p == ultm) {
                p.getAnterior().setSiguiente(null);
            } else {
                p.getAnterior().setSiguiente(p.getSiguiente());
                p.getSiguiente().setAnterior(p.getAnterior());
            }
        }
        p = null;
        }catch (NullPointerException e){
        }
    }
    
    public NodoPrincipal getult() {
        NodoPrincipal p = inicio;
        while (p.getSiguiente() != null) {
            p = p.getSiguiente();
        }
        return p;
    }
    
    public void eliminar_subnodo(Object nomPrinicpal, Object nomSublist, Object elemento){
        NodoPrincipal aux = getNodo(nomPrinicpal);
        aux.eliminar_elemento_sublista(nomSublist,elemento);
    }

    public NodoPrincipal getInicioMulti() {
        return inicio;
    }
    
    
    
}
