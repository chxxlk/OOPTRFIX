/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooptrfix;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chvr__
 */
public class AplikasiMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiMahasiswa
     */
    private DefaultTableModel model;

    public AplikasiMahasiswa() {
        initComponents();
        model = (DefaultTableModel) tabelMahasiswa.getModel();
        loadDataMahasiswa();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAngkatan = new javax.swing.JTextField();
        txtProdi = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mahasiswa"));

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Prodi");

        jLabel4.setText("Angkatan");

        txtAngkatan.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtAngkatanInputMethodTextChanged(evt);
            }
        });
        txtAngkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });
        txtAngkatan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAngkatanKeyTyped(evt);
            }
        });

        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });
        txtNim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNimKeyTyped(evt);
            }
        });

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nim", "Nama", "Prodi", "Angkatan", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelMahasiswa.setColumnSelectionAllowed(true);
        tabelMahasiswa.getTableHeader().setReorderingAllowed(false);
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMahasiswa);
        tabelMahasiswa.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelMahasiswa.getColumnModel().getColumnCount() > 0) {
            tabelMahasiswa.getColumnModel().getColumn(0).setResizable(false);
            tabelMahasiswa.getColumnModel().getColumn(1).setResizable(false);
            tabelMahasiswa.getColumnModel().getColumn(2).setResizable(false);
            tabelMahasiswa.getColumnModel().getColumn(3).setResizable(false);
            tabelMahasiswa.getColumnModel().getColumn(4).setResizable(false);
        }

        btnTambah.setBackground(new java.awt.Color(100, 185, 0));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 200, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCari.setBackground(new java.awt.Color(0, 255, 200));
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel5.setText("Alamat");

        txtAlamat.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtAlamatInputMethodTextChanged(evt);
            }
        });
        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatnone(evt);
            }
        });
        txtAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlamatKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamat)
                            .addComponent(txtAngkatan)
                            .addComponent(txtProdi)
                            .addComponent(txtNama)
                            .addComponent(txtNim))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCari, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        int selectedRow = tabelMahasiswa.getSelectedRow();
        if (selectedRow != -1) {
            txtNim.setText(tabelMahasiswa.getValueAt(selectedRow, 0).toString());
            txtNama.setText(tabelMahasiswa.getValueAt(selectedRow, 1).toString());
            txtProdi.setText(tabelMahasiswa.getValueAt(selectedRow, 2).toString());
            txtAngkatan.setText(tabelMahasiswa.getValueAt(selectedRow, 3).toString());
            txtAlamat.setText(tabelMahasiswa.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

    private void resetForm() {
        txtNim.setText("");
        txtNama.setText("");
        txtProdi.setText("");
        txtAngkatan.setText("");
        txtAlamat.setText("");
        loadDataMahasiswa();
    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        if (txtNim.getText().trim().isEmpty() ||
            txtNama.getText().trim().isEmpty() ||
            txtProdi.getText().trim().isEmpty() ||
            txtAngkatan.getText().trim().isEmpty() ||
            txtAlamat.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Mahasiswa mahasiswa = new Mahasiswa(
                txtNim.getText().trim(),
                txtNama.getText().trim(),
                txtProdi.getText().trim(),
                txtAngkatan.getText().trim(),
                txtAlamat.getText().trim()
        );
        try {
            boolean berhasil = new TambahMahasiswa().tambahMahasiswa(mahasiswa);
            if (berhasil) {
                JOptionPane.showMessageDialog(this, "Mahasiswa berhasil ditambah");
                loadDataMahasiswa();
                resetForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Mahasiswa mahasiswa = new Mahasiswa(
                txtNim.getText().trim(),
                txtNama.getText().trim(),
                txtProdi.getText().trim(),
                txtAngkatan.getText().trim(),
                txtAlamat.getText().trim()
        );

        try {
            UpdateMahasiswa updateMahasiswaOBJ = new UpdateMahasiswa();
            boolean berhasil = updateMahasiswaOBJ.updateMahasiswa(mahasiswa);
            if (berhasil) {
                JOptionPane.showMessageDialog(this, "Mahasiswa berhasil diupdate");
                loadDataMahasiswa();
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal update mahasiswa", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String nim = txtNim.getText().trim();
        if (nim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih mahasiswa yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus mahasiswa ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            try {
                DeleteMahasiswa deleteMahasiswaOBJ = new DeleteMahasiswa();
                boolean berhasil = deleteMahasiswaOBJ.deleteMahasiswa(nim);
                if (berhasil) {
                    JOptionPane.showMessageDialog(this, "Mahasiswa berhasil dihapus");
                    loadDataMahasiswa();
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus mahasiswa", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String nim = txtNim.getText().trim();

        if (nim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukan Nim Untuk Pencarian", "Peringatan", JOptionPane.WARNING_MESSAGE);
            loadDataMahasiswa();
            return;
        }

        try {
            model.setRowCount(0);

            List<Mahasiswa> hasilPencarian = CariMahasiswa.cariMahasiswa(nim);

            if (hasilPencarian.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tidak ada data mahasiswa yang ditemukan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                for (Mahasiswa mhs : hasilPencarian) {
                    model.addRow(new Object[]{
                        mhs.getNim(),
                        mhs.getNama(),
                        mhs.getProdi(),
                        mhs.getAngkatan(),
                        mhs.getAlamat()
                    });
                }
                if (hasilPencarian.size() == 1) {
                    Mahasiswa mhs = hasilPencarian.get(0);
                    txtNim.setText(mhs.getNim());
                    txtNama.setText(mhs.getNama());
                    txtProdi.setText(mhs.getProdi());
                    txtAngkatan.setText(mhs.getAngkatan());
                    txtAlamat.setText(mhs.getAlamat());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Pencarian : " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtAngkatanInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtAngkatanInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAngkatanInputMethodTextChanged

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNimActionPerformed

    private void txtNimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNimKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        // Hanya izinkan angka dan kontrol karakter
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Hapus karakter yang tidak valid

            // Opsional: Tampilkan pesan
            JOptionPane.showMessageDialog(null,
                    "Hanya angka yang diperbolehkan",
                    "Input Salah",
                    JOptionPane.WARNING_MESSAGE);
        }
        
        if (txtNim.getText().length() >= 9){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maksimal 9 angka yang diinput", "Input Salah", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNimKeyTyped

    private void txtAngkatanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAngkatanKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        // Hanya izinkan angka dan kontrol karakter
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Hapus karakter yang tidak valid

            // Opsional: Tampilkan pesan
            JOptionPane.showMessageDialog(null,
                    "Hanya angka yang diperbolehkan",
                    "Input Salah",
                    JOptionPane.WARNING_MESSAGE);
        }
        if (txtAngkatan.getText().length() >= 4){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Maksimal 4 angka yang diinput", "Input Salah", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtAngkatanKeyTyped

    private void txtAlamatInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtAlamatInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatInputMethodTextChanged

    private void txtAlamatnone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatnone
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatnone

    private void txtAlamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatKeyTyped

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
            java.util.logging.Logger.getLogger(AplikasiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAngkatan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtProdi;
    // End of variables declaration//GEN-END:variables

    private void loadDataMahasiswa() {
        try {
            model.setRowCount(0);

            List<Mahasiswa> daftarMahasiswa = new AmbilMahasiswa().ambilSemuaMahasiswa();

            for (Mahasiswa mhs : daftarMahasiswa) {
                model.addRow(new Object[]{
                    mhs.getNim(),
                    mhs.getNama(),
                    mhs.getProdi(),
                    mhs.getAngkatan(),
                    mhs.getAlamat()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}