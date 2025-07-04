
package SESION;

import Clases.Registro;
import javax.swing.JOptionPane;
import login.InicioCliente;
import regis.aseguradora;


public class LOGIN extends javax.swing.JInternalFrame {

  private final String AGENTE_USER = "agente";
private final String AGENTE_PASS = "1234";

    public LOGIN() {
        initComponents();
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        String correo = JOptionPane.showInputDialog(null, "Ingresa tu correo para recuperar tu contraseña:");
        boolean encontrado = false;

        for (int i = 0; i < Registro.Datos.size(); i++) {
            if (Registro.Datos.get(i).getCorreo().equalsIgnoreCase(correo)) {
                JOptionPane.showMessageDialog(null, "Tu contraseña es: " + Registro.Datos.get(i).getContraseña());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Correo no encontrado.");
        }
    }
});

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logUsr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Iniciar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/contra1.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 60, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/User2222.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 60, 60));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        logUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logUsrActionPerformed(evt);
            }
        });
        jPanel4.add(logUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 256, 34));

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 2, 14)); // NOI18N
        jLabel6.setText("Nombre de usuario");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 2, 14)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel2.setText("Bienvenido al Sad");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 220, -1));
        jPanel4.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 50));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ciudad.png"))); // NOI18N
        logo.setText("jLabel1");
        jPanel4.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 220, 400));
        jPanel4.add(logPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 256, 34));

        jLabel7.setText("¿Restablecer tu contraseña?");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logUsrActionPerformed
       
    }//GEN-LAST:event_logUsrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String user = logUsr.getText();
    String pass = new String(logPassword.getPassword());

    if (user.isEmpty() || pass.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se aceptan campos vacíos");
        return;
    }

    
    if (user.equals(AGENTE_USER) && pass.equals(AGENTE_PASS)) {
        JOptionPane.showMessageDialog(this, "Bienvenido Agente");
        regis.agente agenteVentana = new regis.agente();
        this.getParent().add(agenteVentana);
        agenteVentana.setVisible(true);
        this.dispose();
        return;
    }

  
    boolean encontrado = false;
    for (int i = 0; i < Registro.Datos.size(); i++) {
        if (user.equals(Registro.Datos.get(i).getUsuario()) &&
            pass.equals(Registro.Datos.get(i).getContraseña())) {
            JOptionPane.showMessageDialog(this, "Bienvenido!! " + Registro.Datos.get(i).getUsuario());
            InicioCliente cliente = new InicioCliente();
            aseguradora.escriAsegu.add(cliente);
            cliente.setVisible(true);
            this.dispose();
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
    }


    }//GEN-LAST:event_jButton1ActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField logPassword;
    private javax.swing.JTextField logUsr;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    // End of variables declaration//GEN-END:variables

    private static class logUsr {

        private static Object getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public logUsr() {
        }
    }
}
