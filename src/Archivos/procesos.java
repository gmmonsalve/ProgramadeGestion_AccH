/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Ventanas.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import listas.*;

/**
 *
 * @author labcienciascomputacion6
 */
public class procesos {

    public void add_registro(String nombre_archivo, String registro) throws IOException {
        // agrega un registro dentro de un archivo
        File v = new File(nombre_archivo + ".txt");
        FileWriter w = new FileWriter(v, true);
        BufferedWriter x = new BufferedWriter(w);
        PrintWriter y = new PrintWriter(x);
        y.println(registro);
        y.close();
        x.close();
        w.close();
    }

    public Multilista cargar_stocklist(String archivo) throws FileNotFoundException, IOException {
        Multilista mt = new Multilista();
        File v = new File(archivo + ".txt");
        FileReader fr = new FileReader(v);
        BufferedReader br = new BufferedReader(fr);
        String line, nm = "";
        String cat = "", subcat = "";
        while (br.ready()) {
            line = br.readLine();
            boolean bo = true;
            int j = 0;
            nm = "";
            while (bo == true) {
                if (line.substring(j, j + 1).equals("-")) {
                    nm = nm + line.substring(j, j + 1);
                    j++;
                }
                if (!line.substring(j, j + 1).equals("-")) {
                    bo = false;
                }
            }
            switch (nm) {
                case "-":
                    cat = line.substring(1);
                    mt.add_nodoprincipal(cat);
                    break;
                case "--":
                    subcat = line.substring(2);
                    mt.add_sublista(cat, subcat);
                    break;
                case "---":
                    Producto prod = crear_producto(line.substring(3));
                    mt.add_elmento_sublist(cat, subcat, prod);
                    break;
            }
        }
        br.close();
        fr.close();
//        System.out.println("despues de cargar lista");
//        mt.print();
        return mt;
    }

    public void actualiza_archivo_Stock(String Nombre_archivo, Multilista list) throws IOException {
        File viejo = new File(Nombre_archivo + ".txt");
        File nuevo = new File(viejo.getAbsolutePath() + ".txt");
        FileWriter w = new FileWriter(nuevo, true);
        BufferedWriter x = new BufferedWriter(w);
        PrintWriter y = new PrintWriter(x);
        NodoPrincipal aux = list.getInicioMulti();
        while (aux != null) {
            //this.add_registro(Nombre_archivo, "-" + (String) aux.getInfo());
            y.println("-" + (String) aux.getInfo());
            NodoSegundario subaux = aux.getNodos().getInicio();
            while (subaux != null) {
                NodoSegundario no = (NodoSegundario) subaux.getInfo();
                y.println("--" + (no.getInfo()));
                no = no.getSiguiente();
                while (no != null) {
                    String carac_prod = generar_linea((Producto) no.getInfo());
                    y.println("---" + carac_prod);
                    no = no.getSiguiente();
                }
                subaux = subaux.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
        y.close();
        x.close();
        w.close();
        viejo.delete();
        nuevo.renameTo(viejo);
    }

    private Producto crear_producto(String s) {
        Producto p = new Producto();
        String aux = "";
        int cont = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(",")) {
                switch (cont) {
                    case 1:
                        p.setReferencia(aux);
                        break;
                    case 2:
                        p.setSubcategoria(aux);
                        break;
                    case 3:
                        p.setCategoria(aux);
                        break;
                    case 4:
                        p.setPrecio(aux);
                        break;
                    case 5:
                        p.setCantidad(Integer.parseInt(aux));
                        break;
                }
                cont++;
                aux = "";
            } else {
                aux = aux + s.substring(i, i + 1);
            }
        }
        return p;
    }

    private String generar_linea(Producto info) {
        String s = info.getReferencia()
                + "," + info.getSubcategoria()
                + "," + info.getCategoria()
                + "," + info.getPrecio()
                + "," + info.getCantidad()
                + ",";
        return s;
    }

    public ListaSimple cargar_clientelist(String archivo) throws FileNotFoundException, IOException {
        ListaSimple lis = new ListaSimple();
        File v = new File(archivo + ".txt");
        FileReader fr = new FileReader(v);
        BufferedReader br = new BufferedReader(fr);
        String line, nm = "";
        while (br.ready()) {
            line = br.readLine();
            boolean bo = true;
            int cont = 1;
            nm = "";
            Add_cliente add = new Add_cliente();
            for (int j = 0; j < line.length(); j++) {
                if (!line.substring(j, j + 1).equals(";")) {
                    nm = nm + line.substring(j, j + 1);
                } else {
                    switch (cont) {
                        case 1:
                            add.setNom(nm);
                            System.out.println(" :"+ nm);
                            break;
                        case 2:
                            System.out.println(" :"+ nm);
                            add.setTelefono(nm);
                            break;
                        case 3:
                            System.out.println(" :"+ nm);
                            add.setCorreo(nm);
                            break;
                    }
                    nm = "";
                    cont++;
                }
            }
            lis.agregaralfinal(add);
        }

        br.close();
        fr.close();
        return lis;
    }

    public ListaSimple cargar_proveedorlist(String archivo) throws FileNotFoundException, IOException {
        ListaSimple lis = new ListaSimple();
        File v = new File(archivo + ".txt");
        FileReader fr = new FileReader(v);
        BufferedReader br = new BufferedReader(fr);
        String line, nm = "";
        while (br.ready()) {
            line = br.readLine();
            boolean bo = true;
            int cont = 1;
            add_proveedor add = new add_proveedor();
            for (int j = 0; j < line.length(); j++) {
                if (!line.substring(j, j + 1).equals(";")) {
                    nm = nm + line.substring(j, j + 1);
                } else {
                    switch (cont) {
                        case 1:
                            add.setNom(nm);
                            break;
                        case 2:
                            add.setTelefono(nm);
                            break;
                        case 3:
                            add.setCorreo(nm);
                            break;
                    }
                    nm = "";
                    cont++;
                }
            }
            lis.agregaralfinal(add);
        }

        br.close();
        fr.close();
        return lis;
    }
    
    
    public ListaSimple cargar_encargoslist(String archivo) throws FileNotFoundException, IOException {
        ListaSimple lis = new ListaSimple();
        File v = new File(archivo + ".txt");
        FileReader fr = new FileReader(v);
        BufferedReader br = new BufferedReader(fr);
        String line, nm = "";
        while (br.ready()) {
            line = br.readLine();
            boolean bo = true;
            int cont = 1;
            realizar_encargo add = new realizar_encargo();
            for (int j = 0; j < line.length(); j++) {
                if (!line.substring(j, j + 1).equals(";")) {
                    nm = nm + line.substring(j, j + 1);
                } else {
                    switch (cont) {
                        case 1:
                            add.setCliente(nm);
                            break;
                        case 2:
                            add.setProductos(nm);
                            break;
                    }
                    nm = "";
                    cont++;
                }
            }
            lis.agregaralfinal(add);
        }

        br.close();
        fr.close();
        return lis;
    }
}
