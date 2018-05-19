

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LUIS POTTE
 */
import Ventanas.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Archivos.procesos;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Archivos.procesos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;

public class Menú_principal extends javax.swing.JFrame {

    procesos archivos = new procesos();
    Stock stock = new Stock(this);

    static String Password;

    public Menú_principal() throws IOException {
        initComponents();
        stock.setStocklist(archivos.cargar_stocklist("Stock"));

    }

    public String getContrasena() throws FileNotFoundException, IOException {
        String password = null;
        File v = new File("pass.txt");
        FileReader fr = new FileReader(v);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while (br.ready()) {
            line = br.readLine();
            password = line;
        }
        br.close();
        fr.close();
        return password;
    }

    public void setContrasena(String ncontra, File archivo) throws IOException {    
        
        File nuevo = new File(archivo.getAbsolutePath()+".txt");
        
        FileWriter w = new FileWriter(nuevo, true);
        BufferedWriter x = new BufferedWriter(w);
        PrintWriter y = new PrintWriter(x);
        y.println(ncontra);
        y.close();
        x.close();
        w.close();
       archivo.delete();
       nuevo.renameTo(archivo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        ventas = new javax.swing.JPanel();
        clientes = new javax.swing.JPanel();
        encargos = new javax.swing.JPanel();
        provedores = new javax.swing.JPanel();
        config = new javax.swing.JPanel();
        act = new javax.swing.JPasswordField();
        nueva = new javax.swing.JPasswordField();
        cambcontra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        n2 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        as1 = new javax.swing.JLabel();
        as2 = new javax.swing.JLabel();
        as3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pop = new javax.swing.JPopupMenu();
        lab = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tabbed = new javax.swing.JTabbedPane();
        Panel_principal = new javax.swing.JPanel();
        botonstock = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botonventa = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        clientesboton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        encargosbot = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        provedoresbot = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ajustesbot = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cerrar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        op5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton5.setText("jButton1");

        ventas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ventasLayout = new javax.swing.GroupLayout(ventas);
        ventas.setLayout(ventasLayout);
        ventasLayout.setHorizontalGroup(
            ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ventasLayout.setVerticalGroup(
            ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        clientes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout clientesLayout = new javax.swing.GroupLayout(clientes);
        clientes.setLayout(clientesLayout);
        clientesLayout.setHorizontalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        clientesLayout.setVerticalGroup(
            clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        encargos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout encargosLayout = new javax.swing.GroupLayout(encargos);
        encargos.setLayout(encargosLayout);
        encargosLayout.setHorizontalGroup(
            encargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        encargosLayout.setVerticalGroup(
            encargosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        provedores.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout provedoresLayout = new javax.swing.GroupLayout(provedores);
        provedores.setLayout(provedoresLayout);
        provedoresLayout.setHorizontalGroup(
            provedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        provedoresLayout.setVerticalGroup(
            provedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        config.setBackground(new java.awt.Color(255, 255, 255));
        config.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        config.add(act, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 197, -1));
        config.add(nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 197, -1));

        cambcontra.setBackground(new java.awt.Color(204, 204, 255));
        cambcontra.setText("Cambiar contraseña");
        cambcontra.setBorder(null);
        cambcontra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cambcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambcontraActionPerformed(evt);
            }
        });
        config.add(cambcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Contraseña actual:");
        config.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nueva contraseña: ");
        config.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 100, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("C O N F I G U R A C I Ó N");
        config.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Confirme contraseña:");
        config.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 110, 20));
        config.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 200, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cambiar tu contraseña a menudo te permetirá mantener tu información más segura. ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 30));

        config.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 500, 50));
        config.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 200, 40));
        config.add(as1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, 20));
        config.add(as2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 244, 50, 20));
        config.add(as3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 40, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        config.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        lab.setText("Stock");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 516, 176, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbed.setBackground(new java.awt.Color(255, 255, 255));

        Panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        Panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonstock.setBackground(new java.awt.Color(232, 190, 168));
        botonstock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonstock.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonstockMouseMoved(evt);
            }
        });
        botonstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonstockMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonstockMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STOCK");

        javax.swing.GroupLayout botonstockLayout = new javax.swing.GroupLayout(botonstock);
        botonstock.setLayout(botonstockLayout);
        botonstockLayout.setHorizontalGroup(
            botonstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonstockLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(68, 68, 68))
        );
        botonstockLayout.setVerticalGroup(
            botonstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonstockLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33))
        );

        Panel_principal.add(botonstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 200, 90));

        botonventa.setBackground(new java.awt.Color(232, 190, 168));
        botonventa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonventa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonventaMouseMoved(evt);
            }
        });
        botonventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonventaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonventaMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VENTAS");

        javax.swing.GroupLayout botonventaLayout = new javax.swing.GroupLayout(botonventa);
        botonventa.setLayout(botonventaLayout);
        botonventaLayout.setHorizontalGroup(
            botonventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonventaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel7)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        botonventaLayout.setVerticalGroup(
            botonventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonventaLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(33, 33, 33))
        );

        Panel_principal.add(botonventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 190, 90));

        clientesboton.setBackground(new java.awt.Color(232, 190, 168));
        clientesboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientesboton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                clientesbotonMouseMoved(evt);
            }
        });
        clientesboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesbotonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientesbotonMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CLIENTES");

        javax.swing.GroupLayout clientesbotonLayout = new javax.swing.GroupLayout(clientesboton);
        clientesboton.setLayout(clientesbotonLayout);
        clientesbotonLayout.setHorizontalGroup(
            clientesbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientesbotonLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(49, 49, 49))
        );
        clientesbotonLayout.setVerticalGroup(
            clientesbotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesbotonLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Panel_principal.add(clientesboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 190, 90));

        encargosbot.setBackground(new java.awt.Color(232, 190, 168));
        encargosbot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        encargosbot.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                encargosbotMouseMoved(evt);
            }
        });
        encargosbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encargosbotMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                encargosbotMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ENCARGOS");

        javax.swing.GroupLayout encargosbotLayout = new javax.swing.GroupLayout(encargosbot);
        encargosbot.setLayout(encargosbotLayout);
        encargosbotLayout.setHorizontalGroup(
            encargosbotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encargosbotLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(49, 49, 49))
        );
        encargosbotLayout.setVerticalGroup(
            encargosbotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encargosbotLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(32, 32, 32))
        );

        Panel_principal.add(encargosbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, -1));

        provedoresbot.setBackground(new java.awt.Color(232, 190, 168));
        provedoresbot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        provedoresbot.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                provedoresbotMouseMoved(evt);
            }
        });
        provedoresbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provedoresbotMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                provedoresbotMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PROVEEDORES");

        javax.swing.GroupLayout provedoresbotLayout = new javax.swing.GroupLayout(provedoresbot);
        provedoresbot.setLayout(provedoresbotLayout);
        provedoresbotLayout.setHorizontalGroup(
            provedoresbotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, provedoresbotLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(22, 22, 22))
        );
        provedoresbotLayout.setVerticalGroup(
            provedoresbotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, provedoresbotLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(32, 32, 32))
        );

        Panel_principal.add(provedoresbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 190, 90));

        ajustesbot.setBackground(new java.awt.Color(232, 190, 168));
        ajustesbot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajustesbot.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ajustesbotMouseMoved(evt);
            }
        });
        ajustesbot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajustesbotMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajustesbotMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("AJUSTES");

        javax.swing.GroupLayout ajustesbotLayout = new javax.swing.GroupLayout(ajustesbot);
        ajustesbot.setLayout(ajustesbotLayout);
        ajustesbotLayout.setHorizontalGroup(
            ajustesbotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajustesbotLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(52, 52, 52))
        );
        ajustesbotLayout.setVerticalGroup(
            ajustesbotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ajustesbotLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(33, 33, 33))
        );

        Panel_principal.add(ajustesbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 190, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acua.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        Panel_principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        tabbed.addTab("Menú", Panel_principal);

        jPanel2.add(tabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 510));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 153));
        jMenuBar1.setForeground(new java.awt.Color(255, 204, 153));

        Cerrar.setText("Inicio");

        jMenuItem1.setText("Configuración");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Cerrar.add(jMenuItem1);

        op5.setText("Cerrar sesión");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });
        Cerrar.add(op5);

        jMenuBar1.add(Cerrar);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambcontraActionPerformed
        String cact, cnueva, cnueva2;
        cact = act.getText();
        cnueva = nueva.getText();
        cnueva2 = n2.getText();
        if (!cact.isEmpty() & !cnueva.isEmpty() & !cnueva2.isEmpty()) {
            try {
                if (cnueva.equals(cnueva2)) {
                    if (cact.equals(getContrasena())) {
                        File archivo = new File("pass.txt");
                        setContrasena(cnueva,archivo); 
                        JOptionPane.showMessageDialog(null, "La contraseña ha sido cambiada exitosamente");
                    } else {
                         JOptionPane.showMessageDialog(null,"*La contraseña es incorrecta.");
                        
                        as1.setText("*");
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"*La nueva contraseña no coincide");
                   
                    as2.setText("*");
                    as3.setText("*");
                }
            } catch (IOException ex) {
                Logger.getLogger(Menú_principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene los campos correspondientes por favor");
        }
        act.setText(null);
        nueva.setText(null);
        n2.setText(null);
        as1.setText(null);
        as2.setText(null);
        as3.setText(null);

    }//GEN-LAST:event_cambcontraActionPerformed

    private void botonstockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonstockMouseExited
        botonstock.setBackground(new java.awt.Color(232, 190, 168));
        pop.show();// TODO add your handling code here:
    }//GEN-LAST:event_botonstockMouseExited

    private void botonstockMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonstockMouseMoved
        botonstock.setBackground(new java.awt.Color(214, 177, 161));      // TODO add your handling code here:
    }//GEN-LAST:event_botonstockMouseMoved

    private void botonstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonstockMouseClicked
        abrir_panel(stock, "Stock");        // TODO add your handling code here:
    }//GEN-LAST:event_botonstockMouseClicked

    private void botonventaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonventaMouseExited
        botonventa.setBackground(new java.awt.Color(232, 190, 168));        // TODO add your handling code here:
    }//GEN-LAST:event_botonventaMouseExited

    private void botonventaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonventaMouseMoved
        botonventa.setBackground(new java.awt.Color(214, 177, 161));        // TODO add your handling code here:
    }//GEN-LAST:event_botonventaMouseMoved

    private void botonventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonventaMouseClicked
        Venta V = new Venta(this);
        abrir_panel(V, "Ventas");
    }//GEN-LAST:event_botonventaMouseClicked

    private void clientesbotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesbotonMouseClicked
        abrir_panel(clientes, "Clientes");        // TODO add your handling code here:
    }//GEN-LAST:event_clientesbotonMouseClicked

    private void clientesbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesbotonMouseExited
        clientesboton.setBackground(new java.awt.Color(232, 190, 168));
    }//GEN-LAST:event_clientesbotonMouseExited

    private void clientesbotonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesbotonMouseMoved
        clientesboton.setBackground(new java.awt.Color(214, 177, 161));   // TODO add your handling code here:
    }//GEN-LAST:event_clientesbotonMouseMoved

    private void encargosbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encargosbotMouseClicked
        abrir_panel(encargos, "Encargos");        // TODO add your handling code here:
    }//GEN-LAST:event_encargosbotMouseClicked

    private void encargosbotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encargosbotMouseExited
        encargosbot.setBackground(new java.awt.Color(232, 190, 168));    // TODO add your handling code here:
    }//GEN-LAST:event_encargosbotMouseExited

    private void encargosbotMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encargosbotMouseMoved
        encargosbot.setBackground(new java.awt.Color(214, 177, 161));  // TODO add your handling code here:
    }//GEN-LAST:event_encargosbotMouseMoved

    private void provedoresbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provedoresbotMouseClicked
        abrir_panel(provedores, "Proveedores");        // TODO add your handling code here:
    }//GEN-LAST:event_provedoresbotMouseClicked

    private void ajustesbotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustesbotMouseClicked
        abrir_panel(config, "Configuración");        // TODO add your handling code here:
    }//GEN-LAST:event_ajustesbotMouseClicked

    private void ajustesbotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustesbotMouseExited
        ajustesbot.setBackground(new java.awt.Color(232, 190, 168)); // TODO add your handling code here:
    }//GEN-LAST:event_ajustesbotMouseExited

    private void ajustesbotMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajustesbotMouseMoved
        ajustesbot.setBackground(new java.awt.Color(214, 177, 161));// TODO add your handling code here:
    }//GEN-LAST:event_ajustesbotMouseMoved

    private void provedoresbotMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provedoresbotMouseMoved
        provedoresbot.setBackground(new java.awt.Color(214, 177, 161));
        // TODO add your handling code here:
    }//GEN-LAST:event_provedoresbotMouseMoved

    private void provedoresbotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provedoresbotMouseExited
        provedoresbot.setBackground(new java.awt.Color(232, 190, 168));  // TODO add your handling code here:
    }//GEN-LAST:event_provedoresbotMouseExited

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        try {
            cerrar_sesion();
        } catch (IOException ex) {
            Logger.getLogger(Menú_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_op5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        tabbed.add("Configuración", config);
        tabbed.setSelectedComponent(config);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
tabbed.remove(config);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void eliminar_de_tabbed(javax.swing.JPanel p) {
        tabbed.remove(p);
    }

    public void abrir_panel(JPanel p, String titulo) {
        tabbed.add(titulo, p);
        tabbed.setSelectedComponent(p);
    }

    public int cerrar_sesion() throws IOException {
        procesos pr = new procesos();
        pr.actualiza_archivo_Stock("Stock", stock.Stocklist);
        this.dispose();
        Login k = new Login();
        k.setVisible(true);
        return 1;
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menú_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menú_principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Menú_principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cerrar;
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JPasswordField act;
    private javax.swing.JPanel ajustesbot;
    private javax.swing.JLabel as1;
    private javax.swing.JLabel as2;
    private javax.swing.JLabel as3;
    private javax.swing.JPanel botonstock;
    private javax.swing.JPanel botonventa;
    private javax.swing.JButton cambcontra;
    private javax.swing.JPanel clientes;
    private javax.swing.JPanel clientesboton;
    private javax.swing.JPanel config;
    private javax.swing.JPanel encargos;
    private javax.swing.JPanel encargosbot;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lab;
    private javax.swing.JPasswordField n2;
    private javax.swing.JPasswordField nueva;
    private javax.swing.JMenuItem op5;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JPanel provedores;
    private javax.swing.JPanel provedoresbot;
    private javax.swing.JTabbedPane tabbed;
    private javax.swing.JPanel ventas;
    // End of variables declaration//GEN-END:variables

}
