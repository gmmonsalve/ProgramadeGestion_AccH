/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import listas.ListaSimple;
import listas.Multilista;
import listas.NodoPrincipal;
import listas.NodoSegundario;

/**
 *
 * @author LUIS POTTE
 */
public class hacer_venta extends javax.swing.JDialog {

    ListaSimple productos = new ListaSimple();
    int noVenta;
    String nomcliente;
    boolean aceptada;
    Multilista Stock;
    int precioU, precioT, TotalVenta;
    String catprod, subcatprod;

    /**
     * Creates new form hacer_venta
     */
    public hacer_venta(java.awt.Frame parent, boolean modal, int id, Multilista mt) {
        super(parent, modal);
        initComponents();
        this.noVenta = id;
        this.id.setText(String.valueOf(id));
        this.setLocationRelativeTo(parent);
        this.Stock = mt;
    }

    public hacer_venta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    public ListaSimple getProductos() {
        return productos;
    }

    public void setProductos(ListaSimple productos) {
        this.productos = productos;
    }

    public int getNoVenta() {
        return noVenta;
    }

    public void setNoVenta(int noVenta) {
        this.noVenta = noVenta;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public boolean getAceptada() {
        return aceptada;
    }

    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }

    public int getPrecioU() {
        return precioU;
    }

    public void setPrecioU(int precioU) {
        this.precioU = precioU;
    }

    public int getPrecioT() {
        return precioT;
    }

    public void setPrecioT(int precioT) {
        this.precioT = precioT;
    }

    public int getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(int TotalVenta) {
        this.TotalVenta = TotalVenta;
    }

    public String getCatprod() {
        return catprod;
    }

    public void setCatprod(String catprod) {
        this.catprod = catprod;
    }

    public String getSubcatprod() {
        return subcatprod;
    }

    public void setSubcatprod(String subcatprod) {
        this.subcatprod = subcatprod;
    }
    
    

    public void buscarprecios() {
        NodoPrincipal cats = Stock.getInicioMulti();
        while (cats != null) {
            String cat = cats.getInfo().toString();
            NodoSegundario subnodo = cats.getNodos().getInicio();
            while (subnodo != null) {
                NodoSegundario u = (NodoSegundario) subnodo.getInfo();
                String subcat = u.getInfo().toString();
                u = u.getSiguiente();
                while (u != null) {
                    Producto infoProducto = (Producto) u.getInfo();
                    if (infoProducto.getReferencia().endsWith(combo_prod.getSelectedItem().toString())) {
                        this.setCatprod(cat);
                        this.setSubcatprod(subcat);
                        this.setPrecioU(Integer.parseInt(infoProducto.getPrecio()));
                        System.out.println("jdj: " + cant.getValue());
                        int canti = (int) cant.getValue();
                        this.setPrecioT(this.getPrecioU() * canti);
                        TotalVenta = TotalVenta + precioT;
                    }
                    u = u.getSiguiente();
                }
                subnodo = subnodo.getSiguiente();
            }
            cats = cats.getSiguiente();
        }
    }

    public void add_comboclientes(javax.swing.JComboBox<String> jcbx) {
        for (int i = 0; i < jcbx.getItemCount(); i++) {
            boolean sw = true;
            for (int j = 0; j < combo_cls.getItemCount(); j++) {
                if (jcbx.getItemAt(i).equals(combo_cls.getItemAt(j))) {
                    sw = false;
                }
            }
            if (sw == true) {
                this.combo_cls.addItem(jcbx.getItemAt(i));
            }
        }
    }

    public void add_comboprodctos(javax.swing.JComboBox<String> jcbx) {
        for (int i = 0; i < jcbx.getItemCount(); i++) {
            boolean sw = true;
            for (int j = 0; j < combo_prod.getItemCount(); j++) {
                if (jcbx.getItemAt(i).equals(combo_prod.getItemAt(j))) {
                    sw = false;
                }
            }
            if (sw == true) {
                this.combo_prod.addItem(jcbx.getItemAt(i));
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInfo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_prod = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        combo_cls = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cant = new javax.swing.JSpinner();
        id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad ", "Referencia", "Valor unitario", "Valor total"
            }
        ));
        jScrollPane1.setViewportView(TablaInfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 590, 170));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- REALIZAR UNA VENTA NUEVA -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 30));

        jLabel1.setText("Nombre del cliente: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel2.setText("Cantidad de productos: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        combo_prod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecciona -" }));
        jPanel1.add(combo_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 200, -1));

        jLabel3.setText("Descripcion de la venta: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jButton2.setText("Añadir producto a la venta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 170, -1));

        jLabel5.setText("Referencia del pruducto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        combo_cls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecciona -" }));
        combo_cls.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_clsItemStateChanged(evt);
            }
        });
        jPanel1.add(combo_cls, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 200, -1));

        jLabel6.setText("Númeor de venta: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        cant.setBorder(null);
        cant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, 20));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setForeground(new java.awt.Color(255, 0, 0));
        id.setBorder(null);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 200, -1));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 200, 10));

        jButton3.setText("cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3cancelar(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, 30));

        jButton9.setText("Aceptar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9aceptar(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Total de la venta: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        total.setBorder(null);
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 200, 20));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 200, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3cancelar
        int op = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cancelar el proceso?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            this.setAceptada(false);
            this.dispose();
        }
    }//GEN-LAST:event_jButton3cancelar

    private void jButton9aceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9aceptar
        this.setAceptada(true);
        this.setNomcliente(combo_cls.getSelectedItem().toString());
        this.dispose();
    }//GEN-LAST:event_jButton9aceptar

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // añadir prouctos a la tabla
        this.buscarprecios();
        NodoSegundario producto = Stock.getSubnodo(this.getCatprod(), this.getSubcatprod(), combo_prod.getSelectedItem().toString());
        Producto prod = (Producto) producto.getInfo();
        if ((int) cant.getValue() < prod.getCantidad() && (int) cant.getValue() > 0) {
            productos.agregaralfinal(producto);
            DefaultTableModel Tabla = (DefaultTableModel) TablaInfo.getModel();
            Tabla.addRow(new Object[]{cant.getValue(), combo_prod.getSelectedItem(), this.getPrecioU(), this.getPrecioT()});
            total.setText(String.valueOf(this.TotalVenta));
            combo_prod.removeItem(combo_prod.getSelectedItem()); // controla que el producto sea elegido una sola vez
        }else{
            JOptionPane.showMessageDialog(null, "La catidad solicitada supera la cantidad en existencia en stock del producto, intente de nuevo");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_clsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_clsItemStateChanged
        combo_cls.setEnabled(false);
    }//GEN-LAST:event_combo_clsItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hacer_venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hacer_venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hacer_venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hacer_venta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hacer_venta dialog = new hacer_venta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInfo;
    private javax.swing.JSpinner cant;
    private javax.swing.JComboBox<String> combo_cls;
    private javax.swing.JComboBox<String> combo_prod;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
