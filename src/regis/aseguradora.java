
package regis;

import SESION.LOGIN;
import java.util.Date;
import javax.swing.JOptionPane;


public class aseguradora extends javax.swing.JFrame {
//JInternalFrame
    
    public aseguradora() {
        initComponents();
    }
 public static void Salir(){
        JOptionPane.showMessageDialog(null,"Gracias por usar mi sistema " + new Date());
        System.exit(0); 
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escriAsegu = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cliente = new javax.swing.JButton();
        Agente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        cliente.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });

        Agente.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        Agente.setText("Agente");
        Agente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgenteActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        escriAsegu.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escriAsegu.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escriAsegu.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escriAsegu.setLayer(cliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escriAsegu.setLayer(Agente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escriAsegu.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escriAseguLayout = new javax.swing.GroupLayout(escriAsegu);
        escriAsegu.setLayout(escriAseguLayout);
        escriAseguLayout.setHorizontalGroup(
            escriAseguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escriAseguLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escriAseguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escriAseguLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(64, 64, 64)
                        .addGroup(escriAseguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(escriAseguLayout.createSequentialGroup()
                        .addGap(0, 222, Short.MAX_VALUE)
                        .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(escriAseguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escriAseguLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(Agente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escriAseguLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton1)))
                .addGap(234, 234, 234))
        );
        escriAseguLayout.setVerticalGroup(
            escriAseguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escriAseguLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escriAseguLayout.createSequentialGroup()
                .addGroup(escriAseguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escriAseguLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(escriAseguLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(escriAseguLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Agente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escriAsegu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escriAsegu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
LOGIN l=new LOGIN();
escriAsegu.add(l);
l.setVisible(true);

    }//GEN-LAST:event_clienteActionPerformed

    private void AgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgenteActionPerformed
      LOGIN L= new LOGIN();
        escriAsegu.add(L);
      L.setVisible(true);
    }//GEN-LAST:event_AgenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Salir();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aseguradora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agente;
    private javax.swing.JButton cliente;
    public static javax.swing.JDesktopPane escriAsegu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
