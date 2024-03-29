/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.tonywijaya.stmik;

import javax.swing.JOptionPane;

/**
 *
 * @author tonyw
 */
public class NilaiInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form NilaiInternalFrame
     */
    public NilaiInternalFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        presensiText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tugasTerstrukturText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        utsText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        uasText = new javax.swing.JTextField();
        hitungButton = new javax.swing.JButton();
        totalNilaiText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nilaiHurufLabel = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Nilai");

        jLabel1.setDisplayedMnemonic('P');
        jLabel1.setText("Presensi");

        presensiText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        presensiText.setText("0");

        jLabel2.setDisplayedMnemonic('T');
        jLabel2.setText("Tugas Terstruktur");

        tugasTerstrukturText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tugasTerstrukturText.setText("0");

        jLabel3.setDisplayedMnemonic('S');
        jLabel3.setText("Ujian Tengah Semester");

        utsText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        utsText.setText("0");

        jLabel4.setDisplayedMnemonic('A');
        jLabel4.setText("Ujian Akhir Semester");

        uasText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        uasText.setText("0");

        hitungButton.setMnemonic('H');
        hitungButton.setText("Hitung");
        hitungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungButtonActionPerformed(evt);
            }
        });

        totalNilaiText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalNilaiText.setText("0");

        jLabel5.setText("Total Nilai");

        nilaiHurufLabel.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        nilaiHurufLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nilaiHurufLabel.setText("E");
        nilaiHurufLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nilaiHurufLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hitungButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uasText)
                                    .addComponent(utsText)
                                    .addComponent(presensiText)
                                    .addComponent(tugasTerstrukturText, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalNilaiText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presensiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tugasTerstrukturText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hitungButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalNilaiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nilaiHurufLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungButtonActionPerformed
        // TODO add your handling code here:
        
        Nilai n = new Nilai();
       
        double presensi = 0;
        
        try
        {
            presensi = Double.valueOf(presensiText.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Presensi harus menggunakan angka", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        n.setPresensi(presensi);
        
        if (!n.validasiPresensi())
        {
            JOptionPane.showMessageDialog(rootPane, "Presensi harus bernilai 0 - 10", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double tugasTerstruktur = 0;
        
        try
        {
            tugasTerstruktur = Double.valueOf(tugasTerstrukturText.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Tugas Terstruktur harus menggunakan angka", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        n.setTugasTerstruktur(tugasTerstruktur);
        
        if (!n.validasiTugasTerstruktur())
        {
            JOptionPane.showMessageDialog(rootPane, "Tugas Terstruktur harus bernilai 0 - 20", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double uts = 0;
        
        try
        {
            uts = Double.valueOf(utsText.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, "UTS harus menggunakan angka", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        n.setUts(uts);
        
        if (!n.validasiUts())
        {
            JOptionPane.showMessageDialog(rootPane, "UTS harus bernilai 0 - 30", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double uas = 0;
        
        try
        {
            uas = Double.valueOf(uasText.getText());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, "UAS harus menggunakan angka", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        n.setUas(uas);
        
        if (!n.validasiUas())
        {
            JOptionPane.showMessageDialog(rootPane, "UAS harus bernilai 0 - 40", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        n.hitungNilai();
        
        double totalNilai = n.getTotalNilai();
        String nilaiHuruf = n.getNilaiHuruf();
        
        totalNilaiText.setText(String.valueOf(totalNilai));
        nilaiHurufLabel.setText(nilaiHuruf);
    }//GEN-LAST:event_hitungButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hitungButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nilaiHurufLabel;
    private javax.swing.JTextField presensiText;
    private javax.swing.JTextField totalNilaiText;
    private javax.swing.JTextField tugasTerstrukturText;
    private javax.swing.JTextField uasText;
    private javax.swing.JTextField utsText;
    // End of variables declaration//GEN-END:variables
}
