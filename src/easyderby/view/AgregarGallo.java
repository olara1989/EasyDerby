/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyderby.view;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class AgregarGallo extends javax.swing.JDialog {

    /**
     * Creates new form AgregarGallo
     */
    public String[] itemInfo;
    private int numG = 0;
    int pMin = 0;
    int pMax = 0;
    int t = 0;
    public boolean modificar = false;
    public AgregarGallo(java.awt.Frame parent, boolean modal,int numGallos,int contador,ArrayList<String[]> partidos,int pesoMin,int pesoMax,int tol){
        super(parent, modal);
        modificar = false;
        pMin = pesoMin;
        pMax = pesoMax;
        t = tol;
        System.out.println("Max:"+ pMax+" Min: "+pMin+" Tol: "+t);
        initComponents();
        jTable1.requestFocus();
        numG = numGallos;
        cboPartidos.removeAllItems();
        cboPartidos.addItem("Selecciona...");
        for (int i = 0; i < partidos.size(); i++) {
         cboPartidos.addItem(partidos.get(i)[0]+". "+partidos.get(i)[1]);
        }    
        lblContador.setText(""+contador);
        for (int i = 0; i < numGallos; i++) {
           ((DefaultTableModel) jTable1.getModel()).addRow(new String[]{"",""});    
        }
    }
    public AgregarGallo(java.awt.Frame parent, boolean modal,int numGallos,int contador,ArrayList<String[]> partidos,int pesoMin,int pesoMax,int tol,String[] datos){
        super(parent, modal);
        modificar = true;
        pMin = pesoMin;
        pMax = pesoMax;
        t = tol;
        System.out.println("Max:"+ pMax+" Min: "+pMin+" Tol: "+t);
        initComponents();
        jTable1.requestFocus();
        numG = numGallos;
        cboPartidos.removeAllItems();
        cboPartidos.addItem("Selecciona...");
        for (int i = 0; i < partidos.size(); i++) {
         cboPartidos.addItem(partidos.get(i)[0]+". "+partidos.get(i)[1]);
        }    
        lblContador.setText("#");
        for (int i = 0; i < numGallos; i++) {
           ((DefaultTableModel) jTable1.getModel()).addRow(new String[]{"",""});    
           
        }
        //Lenar las datos de la tabla
        int c = 1;
        for (int i = 0; i < numGallos; i++) {
           jTable1.setValueAt(datos[c], i, 0);
           jTable1.setValueAt(datos[c+1], i, 1);
           c+=2;
        }
        cboPartidos.setSelectedIndex(partidos.size());
       
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContador = new javax.swing.JLabel();
        cboPartidos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblContador.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblContador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContador.setText("1");

        cboPartidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboPartidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPartidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboPartidosMouseClicked(evt);
            }
        });
        cboPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPartidosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peso", "Anillo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Gallos:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyderby/img/checkmark-30.png"))); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/easyderby/img/cancel-30.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Partido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(cboPartidos, 0, 250, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            int ind = cboPartidos.getSelectedIndex();
          
        if (ind >= 1 ) {
            itemInfo = new String[(numG * 2) + 1];
            itemInfo[0] = cboPartidos.getSelectedItem().toString();
            boolean pasa = true;
            System.out.println("Pasa: "+pasa);
            int par = 0;
            for (int i = 1; i <= numG * 2; i++) {                
                itemInfo[i] = jTable1.getValueAt(par, 0).toString();
                itemInfo[++i] = jTable1.getValueAt(par, 1).toString();
               
                int val = Integer.parseInt(jTable1.getValueAt(par, 0).toString());
                System.out.println("Val: "+val+" Max: "+ pMax+" Min: "+pMin);                
                if (val < pMin || val > pMax) {
                    pasa = false;
                    break;
                }
               System.out.println("Pasa: "+pasa);                
                par++;
                if (par == numG) {
                    par = 0;                                      
                }
            }
            System.out.println("Pasa: "+pasa);
            if (!pasa) {
                itemInfo = null;                
                JOptionPane.showMessageDialog(null, "El peso NO está permitido\nMinimo: "+pMin+"g Maximo: "+pMax+"g", "ERROR", 0);
            } else {
                setVisible(false);                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un partidos", "ERROR!!!", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboPartidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboPartidosMouseClicked
       cboPartidos.requestFocus();
    }//GEN-LAST:event_cboPartidosMouseClicked

    private void cboPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPartidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPartidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboPartidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblContador;
    // End of variables declaration//GEN-END:variables
}
