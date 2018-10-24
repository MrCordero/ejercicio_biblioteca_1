package main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Data;
import model.Usuario;

public class App extends javax.swing.JFrame {

    private Data d;
    

    public App() {
        try {
            initComponents();
            d = new Data();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formMenu = new javax.swing.JFrame();
        lblNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        formRegistro = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRun = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 0, 0));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jMenu1.setText("Libro");

        jMenuItem1.setText("Crear");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Listar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Buscar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Eliminar");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Actualizar");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuario");

        jMenu5.setText("Actualizar");

        jMenuItem6.setText("Nombre");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Edad");
        jMenu5.add(jMenuItem7);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Estadísticas");

        jMenu6.setText("Cantidad");

        jMenuItem8.setText("Libros");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Stock inferior a cinco libros. ");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenu3.add(jMenu6);

        jMenu7.setText("Promedio");

        jMenuItem11.setText("Precio Libros");
        jMenu7.add(jMenuItem11);

        jMenuItem10.setText("Año lanzamiento");
        jMenu7.add(jMenuItem10);

        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cerrar");
        jMenuBar1.add(jMenu4);

        formMenu.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout formMenuLayout = new javax.swing.GroupLayout(formMenu.getContentPane());
        formMenu.getContentPane().setLayout(formMenuLayout);
        formMenuLayout.setHorizontalGroup(
            formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
        );
        formMenuLayout.setVerticalGroup(
            formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        jLabel3.setText("Nombre:");

        jLabel4.setText("RUN:");

        jLabel5.setText("Edad:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formRegistroLayout = new javax.swing.GroupLayout(formRegistro.getContentPane());
        formRegistro.getContentPane().setLayout(formRegistroLayout);
        formRegistroLayout.setHorizontalGroup(
            formRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formRegistroLayout.createSequentialGroup()
                .addGroup(formRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre)
                    .addComponent(txtRut, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(txtEdad))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(formRegistroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        formRegistroLayout.setVerticalGroup(
            formRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Rut:");

        txtRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRunActionPerformed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inicio Seción");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRunActionPerformed

    }//GEN-LAST:event_txtRunActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        validacion();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            registrar();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JFrame formMenu;
    private javax.swing.JFrame formRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRun;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables

    private void validacion() {
        try {
            String run = txtRun.getText();

            Usuario us = d.existeUsuario(run);

            if (us == null) {
                if (JOptionPane.showConfirmDialog(this, "Desea registrarse?", "Opcion registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                    formRegistro.setBounds(0, 0, 300, 400);
                    formRegistro.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "OK", "Volviendo al menú", 1);
                }

            } else {
                lblNombre.setText(us.getNombre());
                formMenu.setBounds(0, 0, 300, 400);
                formMenu.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    
    private void registrar() throws SQLException{
        String nombre = txtNombre.getText();
        String run = txtRut.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        
        Usuario u = new Usuario(nombre,run,edad);
        
        d.crearUsuario(u);
        
    
    
    
    }










}
