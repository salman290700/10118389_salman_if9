/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Muhammad Salman A.F
 */
public class praktikum_3_2 extends javax.swing.JFrame {

    /**
     * Creates new form praktikum_3_2
     */
    public praktikum_3_2() {
        initComponents();
        txt_output.setLineWrap(true);
        GraphicsEnvironment ge = GraphicsEnvironment.
   getLocalGraphicsEnvironment();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        lbl_judul = new javax.swing.JLabel();
        lbl_huruf = new javax.swing.JLabel();
        lbl_ukuran = new javax.swing.JLabel();
        lbl_warna = new javax.swing.JLabel();
        cb_huruf = new javax.swing.JComboBox(GraphicsEnvironment.
            getLocalGraphicsEnvironment ().getAvailableFontFamilyNames ());
        cb_ukuran = new javax.swing.JComboBox();
        cb_warna = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_judul.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbl_judul.setText("Praktikum 3.2");

        lbl_huruf.setText("Jenis Huruf");

        lbl_ukuran.setText("Ukuran");

        lbl_warna.setText("Warna");

        cb_huruf.setToolTipText("");
        cb_huruf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_hurufItemStateChanged(evt);
            }
        });

        cb_ukuran.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "14", "16", "18" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cb_huruf, org.jdesktop.beansbinding.ObjectProperty.create(), cb_ukuran, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cb_ukuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ukuranActionPerformed(evt);
            }
        });

        cb_warna.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Merah", "Hijau", "Biru", " " }));
        cb_warna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_warnaActionPerformed(evt);
            }
        });

        txt_output.setColumns(20);
        txt_output.setRows(5);
        jScrollPane1.setViewportView(txt_output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_judul)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_huruf)
                            .addComponent(lbl_ukuran)
                            .addComponent(lbl_warna))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cb_warna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_ukuran, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_huruf, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_judul)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_huruf)
                            .addComponent(cb_huruf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_ukuran)
                            .addComponent(cb_ukuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_warna, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_warna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_warnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_warnaActionPerformed
        // TODO add your handling code here:
        if(cb_warna.getSelectedItem()=="Merah"){
            txt_output.setForeground(Color.red);
        }
        else if(cb_warna.getSelectedItem()=="Biru"){
           txt_output.setForeground(Color.blue); 
        }
        else if(cb_warna.getSelectedItem()=="Hijau"){
            txt_output.setForeground(Color.green);
        }
    }//GEN-LAST:event_cb_warnaActionPerformed

    private void cb_hurufItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_hurufItemStateChanged

        // TODO add your handling code here:
        
        txt_output.setFont(new Font(cb_huruf.getSelectedItem().toString(),Font.PLAIN,
        Integer.valueOf(cb_ukuran.getSelectedItem().toString())));
        
    }//GEN-LAST:event_cb_hurufItemStateChanged

    private void cb_ukuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ukuranActionPerformed
        // TODO add your handling code here:
        if(cb_ukuran.getSelectedItem()=="14"){
            txt_output.setFont(new Font("",Font.PLAIN,14));
        }
        else if(cb_ukuran.getSelectedItem()=="16"){
           txt_output.setFont(new Font("",Font.PLAIN,16));
        }
        else if(cb_ukuran.getSelectedItem()=="18"){
           txt_output.setFont(new Font("",Font.PLAIN,18));
        }
        
    }//GEN-LAST:event_cb_ukuranActionPerformed

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
            java.util.logging.Logger.getLogger(praktikum_3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(praktikum_3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(praktikum_3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(praktikum_3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new praktikum_3_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_huruf;
    private javax.swing.JComboBox cb_ukuran;
    private javax.swing.JComboBox cb_warna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_huruf;
    private javax.swing.JLabel lbl_judul;
    private javax.swing.JLabel lbl_ukuran;
    private javax.swing.JLabel lbl_warna;
    private javax.swing.JTextArea txt_output;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
