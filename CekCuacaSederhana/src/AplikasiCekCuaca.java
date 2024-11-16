
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class AplikasiCekCuaca extends javax.swing.JFrame {
     /**
     * Creates new form AplikasiCekCuaca
     */
    public AplikasiCekCuaca() {
        initComponents();
    }
    
    private String getWeatherData(String cityName) {
    String apiKey = "cb2bef5483dbe0a98b5cb05a6111f5eb"; 
    String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + apiKey + "&units=metric";

    try {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    } catch (Exception e) {
        return null;
    }
    
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
        txtKota = new javax.swing.JTextField();
        btnCek = new javax.swing.JButton();
        cmbFavorit = new javax.swing.JComboBox<>();
        lblHasil = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnMasuk = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 1, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Masukkan Nama Kota");

        btnCek.setText("Cek");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });

        cmbFavorit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jakarta", "Bali", "Bandung", "Banjarmasin", " " }));
        cmbFavorit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFavoritActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnMasuk.setText("Masukkan");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kota", "Suhu", "Kondisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCek, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbFavorit, 0, 184, Short.MAX_VALUE)
                    .addComponent(txtKota))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHasil)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCek, btnHapus, btnKeluar, btnMasuk, btnSimpan});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblHasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbFavorit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnCek)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnMasuk)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 238, 240));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel2.setText("APLIKASI CEK CUACA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
   String city = txtKota.getText();

    if (city.isEmpty()) {
        lblHasil.setText("Masukkan nama kota!");
        return;
    }

    // Ambil data cuaca
    String weatherData = getWeatherData(city);

    if (weatherData != null) {
        try {
            // Parsing JSON
            JSONObject json = new JSONObject(weatherData);
            JSONObject main = json.getJSONObject("main");
            JSONArray weatherArray = json.getJSONArray("weather");
            JSONObject weather = weatherArray.getJSONObject(0);

            // Ambil data cuaca
            double temp = main.getDouble("temp");
            String description = weather.getString("description");
            String descriptionID = translateDescription(description);

            // Tampilkan suhu dan deskripsi cuaca di JLabel
            lblHasil.setText("<html>Suhu: " + temp + "°C<br>Kondisi: " + descriptionID + "</html>");
           

            // Tambahkan data ke JTable
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.insertRow(0, new Object[]{city, temp, descriptionID});    

       ImageIcon icon;        
    if (description.contains("clear")) {
        icon = new ImageIcon(getClass().getResource("/images/cerah.jpeg"));
    } else if (description.contains("cloud")) {
        icon = new ImageIcon(getClass().getResource("/images/berawan.png"));
    } else if (description.contains("rain")) {
        icon = new ImageIcon(getClass().getResource("/images/hujan.jpeg"));
    } else if (description.contains("haze")) {
        icon = new ImageIcon(getClass().getResource("/images/berkabut.png"));
    } else {
        icon = new ImageIcon(getClass().getResource("/images/default.png"));
    }
    lblHasil.setIcon(icon);
    Image img = icon.getImage();
    Image scaledImg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Ukuran gambar diatur ke 100x100
    icon = new ImageIcon(scaledImg);

// Set gambar yang sudah diubah ukurannya ke JLabel
    lblHasil.setIcon(icon);
    } catch (NullPointerException e) {
    System.out.println("Gambar tidak ditemukan!");
    e.printStackTrace();
    lblHasil.setText("Gambar tidak tersedia");
    }
        
                  
    } else {
        lblHasil.setText("Gagal mengambil data cuaca!");
    }                            
    }//GEN-LAST:event_btnCekActionPerformed

    private void cmbFavoritActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFavoritActionPerformed
          // Ambil kota yang dipilih dari ComboBox
    String city = (String) cmbFavorit.getSelectedItem();

    if (city != null && !city.trim().isEmpty()) {
        // Ambil data cuaca
        String weatherData = getWeatherData(city);

        if (weatherData != null) {
            try {
                // Parsing JSON
                JSONObject json = new JSONObject(weatherData);
                JSONObject main = json.getJSONObject("main");
                JSONArray weatherArray = json.getJSONArray("weather");
                JSONObject weather = weatherArray.getJSONObject(0);

                // Ambil data cuaca
                double temp = main.getDouble("temp");
                String description = weather.getString("description");
                String descriptionID = translateDescription(description);

                // Tampilkan suhu dan deskripsi cuaca di JLabel
                lblHasil.setText("<html>Suhu: " + temp + "°C<br>Kondisi: " + description + "</html>");

                // Tambahkan data ke JTable
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.insertRow(0, new Object[]{city, temp, description});


                // Tambahkan ikon gambar sesuai deskripsi
                ImageIcon icon;
                if (description.contains("clear")) {
                    icon = new ImageIcon(getClass().getResource("/images/cerah.jpeg"));
                } else if (description.contains("cloud")) {
                    icon = new ImageIcon(getClass().getResource("/images/berawan.png"));
                } else if (description.contains("rain")) {
                    icon = new ImageIcon(getClass().getResource("/images/hujan.jpeg"));
                } else if (description.contains("haze")) {
                    icon = new ImageIcon(getClass().getResource("/images/berkabut.png"));
                } else {
                    icon = new ImageIcon(getClass().getResource("/images/default.png"));
                }

                // Ubah ukuran gambar sebelum ditampilkan
                Image img = icon.getImage();
                Image scaledImg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                icon = new ImageIcon(scaledImg);
                lblHasil.setIcon(icon);

            } catch (Exception e) {
                lblHasil.setText("Gagal memproses data cuaca!");
                e.printStackTrace();
            }
        } else {
            lblHasil.setText("Gagal mengambil data cuaca!");
        }
    } else {
        lblHasil.setText("Pilih kota dari daftar!");
    }
    }//GEN-LAST:event_cmbFavoritActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
     JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan Data Cuaca");
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave + ".csv"))) {
            // Tulis header file CSV
            writer.write("Kota,Suhu,Kondisi");
            writer.newLine();

            // Ambil data dari JTable
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                String city = (String) model.getValueAt(i, 0);
                String temp = String.valueOf(model.getValueAt(i, 1));
                String condition = (String) model.getValueAt(i, 2);

                // Simpan baris data
                writer.write(city + "," + temp + "," + condition);
                writer.newLine();
            }

            // Beri tahu pengguna bahwa data berhasil disimpan
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke file: " + fileToSave.getAbsolutePath());
        } catch (IOException e) {
            // Tampilkan pesan error jika terjadi kegagalan
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    int result = fileChooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Hapus data tabel yang ada
            model.setRowCount(0);

            // Lewati header (baris pertama)
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Lewati header
                    continue;
                }

                String[] data = line.split(","); // Pisahkan data dengan koma

                // Validasi panjang data dan pastikan data suhu tidak kosong
                if (data.length == 3 && !data[1].trim().isEmpty()) {
                    try {
                        String kota = data[0];
                        double suhu = Double.parseDouble(data[1]); // Konversi suhu
                        String kondisi = data[2];
                        model.addRow(new Object[]{kota, suhu, kondisi});
                    } catch (NumberFormatException e) {
                        // Tampilkan pesan jika suhu tidak valid
                        System.err.println("Suhu tidak valid untuk baris: " + line);
                    }
                } else {
                    // Tampilkan pesan jika data tidak lengkap
                    System.err.println("Baris data tidak valid: " + line);
                }
            }

            lblHasil.setText("Data berhasil dimuat!");
        } catch (IOException e) {
            lblHasil.setText("Gagal memuat file!");
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnMasukActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // Dapatkan baris yang dipilih
    int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) { // Jika ada baris yang dipilih
        // Konfirmasi sebelum menghapus
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah Anda yakin ingin menghapus baris ini?", 
                "Konfirmasi Hapus", 
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Hapus baris yang dipilih
            model.removeRow(selectedRow);
            lblHasil.setText("Baris berhasil dihapus!");
        }
    } else {
        // Tampilkan pesan jika tidak ada baris yang dipilih
        JOptionPane.showMessageDialog(this, 
                "Silakan pilih baris yang ingin dihapus.", 
                "Tidak Ada Baris Dipilih", 
                JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnHapusActionPerformed
    
  private String translateDescription(String description) {
        switch (description) {
            case "clear":
                return "Cerah";
            case "cloudy":
                return "Berawan";
            case "moderate rain":
                return "Hujan Sedang";
            case "light rain":
                return "Hujan Ringan";
            case "rain":
                return "Hujan";
            case "thunderstorm":
                return "Badai Petir";
            case "haze":
                return "Berkabut";
            default:
                return "Tidak Diketahui";
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiCekCuaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbFavorit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JTextField txtKota;
    // End of variables declaration//GEN-END:variables

}