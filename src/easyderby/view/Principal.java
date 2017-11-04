/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyderby.view;

import easyderby.Funciones;
import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Principal extends javax.swing.JFrame {
   private Partido partido;
   private Torneo torneo;
   private Reportes rep;
   private ListaTorneos lTorneos;
   Funciones f;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        f = new Funciones();

                
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
        buttonTask4 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask2 = new org.edisoncor.gui.button.ButtonTask();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        buttonTask4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyderby/img/bookmark-40.png"))); // NOI18N
        buttonTask4.setText("Reportes");
        buttonTask4.setDescription("Informes");
        buttonTask4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask4ActionPerformed(evt);
            }
        });

        buttonTask2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyderby/img/racism-40.png"))); // NOI18N
        buttonTask2.setText("Partidos");
        buttonTask2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask2ActionPerformed(evt);
            }
        });

        buttonTask1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyderby/img/trophy-40.png"))); // NOI18N
        buttonTask1.setText("Tornes");
        buttonTask1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTask1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonTask2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonTask4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTask2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTask4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyderby/img/door_opened-16.png"))); // NOI18N
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de..");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyderby/view/about-16.png"))); // NOI18N
        jMenuItem2.setText(" Iformación");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTask1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask1ActionPerformed
        ArrayList<String[]> torneos = f.getTorneosActivos();
        torneo = new Torneo(this,true,false);
        System.out.println(torneos.size());
        //Modificar torneos
        //if(torneos.size() == 0 ){
            if(true){
            torneo.setLocationRelativeTo(this);
            torneo.setVisible(true);
        }
        else{
           lTorneos = new ListaTorneos(this,true);  
           lTorneos.setLocationRelativeTo(this);
           lTorneos.setVisible(true);           
            if(lTorneos.idTorneo==0){
                torneo.setLocationRelativeTo(this);
                torneo.setVisible(true);
            }else if(lTorneos.idTorneo==-1){
                
            }else{
                torneo.idTorneo = lTorneos.idTorneo;
                torneo.guardarT=false;
                torneo.setLocationRelativeTo(this);
                torneo.setVisible(true);
                
            }           
        }
    }//GEN-LAST:event_buttonTask1ActionPerformed

    private void buttonTask2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask2ActionPerformed
       partido = new Partido(this,true);
       partido.setLocationRelativeTo(this);
       partido.setVisible(true);
    }//GEN-LAST:event_buttonTask2ActionPerformed

    private void buttonTask4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTask4ActionPerformed
      rep = new Reportes(this,true);
       rep.setLocationRelativeTo(this);
       rep.setVisible(true);
    }//GEN-LAST:event_buttonTask4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private org.edisoncor.gui.button.ButtonTask buttonTask2;
    private org.edisoncor.gui.button.ButtonTask buttonTask4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}