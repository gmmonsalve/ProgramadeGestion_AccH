/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUIS POTTE
 */
public class Encargo extends javax.swing.JPanel {
    private Menú_principal Menú;
    /**
     * Creates new form Encargo
     */
    public Encargo() {
        initComponents();
    }

    public Encargo(Menú_principal men) {
        initComponents();
        this.Menú = men;
        añadir.setBackground(new java.awt.Color(153, 153, 255));
        ver.setBackground(new java.awt.Color(153, 153, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        añadir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ver = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("X");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13Salir(evt);
            }
        });
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 30, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText(" E   N   C   A   R   G   O   S");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 300, 30));

        añadir.setBackground(new java.awt.Color(204, 204, 255));
        añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                añadirMouseMoved(evt);
            }
        });
        añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Realizar_encargo(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                añadirMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Encargo");

        javax.swing.GroupLayout añadirLayout = new javax.swing.GroupLayout(añadir);
        añadir.setLayout(añadirLayout);
        añadirLayout.setHorizontalGroup(
            añadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, añadirLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(44, 44, 44))
        );
        añadirLayout.setVerticalGroup(
            añadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(añadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 220, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/32306402.png"))); // NOI18N
        jLabel16.setToolTipText("");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, -180, -1, -1));

        ver.setBackground(new java.awt.Color(204, 204, 255));
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verMouseMoved(evt);
            }
        });
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ver_encargos(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ver Encargos pendientes");

        javax.swing.GroupLayout verLayout = new javax.swing.GroupLayout(ver);
        ver.setLayout(verLayout);
        verLayout.setHorizontalGroup(
            verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        verLayout.setVerticalGroup(
            verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13Salir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13Salir
        Menú.eliminar_de_tabbed(this);
    }//GEN-LAST:event_jLabel13Salir

    private void añadirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirMouseMoved
        añadir.setBackground(new java.awt.Color(204, 204, 255));
    }//GEN-LAST:event_añadirMouseMoved

    private void Realizar_encargo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Realizar_encargo

    }//GEN-LAST:event_Realizar_encargo

    private void añadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirMouseExited
        añadir.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_añadirMouseExited

    private void verMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseMoved
        ver.setBackground(new java.awt.Color(204, 204, 255));
    }//GEN-LAST:event_verMouseMoved

    private void Ver_encargos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ver_encargos
        // TODO add your handling code here:
    }//GEN-LAST:event_Ver_encargos

    private void verMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseExited
        ver.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_verMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel añadir;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}
