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
public class ListaSimple extends Lista{

    public ListaSimple() {
        super();
    }

     public void agregar_alprincipio(Object n){
          NodoSegundario nvo = new NodoSegundario(n);
        if (inicio == null) {
            inicio = nvo;
        } else {
          NodoSegundario aux = inicio;
          nvo.setSiguiente(aux);
          inicio = nvo;
        }
        tamaño++;
    }
    
    public void agregaralfinal(Object n) {
        NodoSegundario nvo = new NodoSegundario(n);
        if (inicio == null) {
            inicio = nvo;
        } else {
            NodoSegundario aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = (NodoSegundario) aux.getSiguiente();
            }
            aux.setSiguiente(nvo);
        }
        tamaño++;
    }

    public void eliminar(Object y) {
        NodoSegundario p = inicio;
        NodoSegundario ant = null;
        if (inicio.getInfo() == y) {
            inicio = p.getSiguiente();
        } else {
            try {
                while (p.getInfo() != y && p != null) {
                    ant = p;
                    p = p.getSiguiente();
                }
                if (p.getSiguiente() == null) {
                    ant.setSiguiente(null);
                } else {
                    ant.setSiguiente(p.getSiguiente());
                    p.setSiguiente(null);
                }
            } catch (NullPointerException e) {
                // controla que cuando p apunte a nulo no se detenga
                System.out.println("El elemento no existe en la lista");
            }
        }
    }

    /**
     *
     */
    @Override
    public void ordenar() {
            for (int i = 0; i < tamaño; i++) {
                NodoSegundario ant = null;
                NodoSegundario q = inicio;
                NodoSegundario sgte = q.getSiguiente();
                while (sgte != null) {
                    if (sgte.getInfo().toString().compareTo(q.getInfo().toString()) < 0) {
                        if (ant == null) {
                            q.setSiguiente(sgte.getSiguiente());
                            sgte.setSiguiente(q);
                            inicio = sgte;
                        } else {
                            ant.setSiguiente(q.getSiguiente());
                            q.setSiguiente(sgte.getSiguiente());
                            sgte.setSiguiente(q);
                        }
                        ant = sgte;
                        sgte = q.getSiguiente();
                    } else {
                        ant = q;
                        q = sgte;
                        sgte = sgte.getSiguiente();
                    }
                }
            }
    }
}
