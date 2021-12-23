package uas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Calendar;
import javax.swing.JFileChooser;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class uaspemjar extends javax.swing.JFrame implements Runnable {

    JFileChooser dialog = new JFileChooser();
    Socket client; // class socket untuk client
    ServerSocket server; // class socket untuk server
    BufferedReader server_reader, client_reader; // buffer untuk membaca pesan
    BufferedWriter server_writer, client_writer; // buffer untuk mengirim pesan 

    public uaspemjar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cboConnection = new javax.swing.JComboBox();
        btnConnect = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        listMesegge = new java.awt.List();
        btnSend = new javax.swing.JButton();
        txtMessege = new javax.swing.JTextField();
        jammm = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        vpath = new javax.swing.JLabel();
        vjam = new javax.swing.JTextField();
        vket = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alarm Sederhana");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));

        cboConnection.setBackground(new java.awt.Color(204, 204, 255));
        cboConnection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Server", "Client" }));
        cboConnection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboConnectionItemStateChanged(evt);
            }
        });
        cboConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConnectionActionPerformed(evt);
            }
        });

        btnConnect.setText("ON");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        txtUser.setBackground(new java.awt.Color(204, 204, 255));
        txtUser.setText("Username");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        listMesegge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMeseggeActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(255, 255, 204));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtMessege.setBackground(new java.awt.Color(204, 204, 255));
        txtMessege.setText("Your Messege Here..");
        txtMessege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessegeActionPerformed(evt);
            }
        });

        jammm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jammm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jammm.setText("jam");
        jammm.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jammmPropertyChange(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jCheckBox1.setText("Aktif");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Suara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vpath.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        vpath.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vpath.setText("File Url");
        vpath.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        vjam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vjam.setText("00:00:00");
        vjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vjamActionPerformed(evt);
            }
        });

        vket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vketActionPerformed(evt);
            }
        });

        jLabel1.setText("Keterangan :");

        jLabel2.setText("Set Alarm :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(vket, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vpath, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(vjam, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addComponent(jButton1))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vpath, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jCheckBox1))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listMesegge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cboConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMessege, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jammm, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jammm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(listMesegge, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtMessege)
                                .addGap(204, 204, 204))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSend)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(636, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jam() {
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String nol_bulan = "";
                String nol_hari = "";
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                Calendar dt = Calendar.getInstance();

                int nilai_jam = dt.get(Calendar.HOUR_OF_DAY);
                int nilai_menit = dt.get(Calendar.MINUTE);
                int nilai_detik = dt.get(Calendar.SECOND);

                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }

                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                jammm.setText(jam + ":" + menit + ":" + detik);

            }
        };
        new javax.swing.Timer(1000, taskPerformer).start();
    }

    void player() {
        InputStream in;
        try {
            in = new FileInputStream(new File(vpath.getText()));
            AudioStream audios = new AudioStream(in);
            AudioPlayer.player.start(audios);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        vpath.setText(filename);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jam();
    }//GEN-LAST:event_formWindowOpened

    private void jammmPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jammmPropertyChange

        if (jCheckBox1.isSelected() == true) {
            vket.setEnabled(false);
            if (vjam.getText().equals(jammm.getText())) {
                player();
                JOptionPane.showMessageDialog(rootPane, "" + vket.getText() + "");
            } else {
            }

        } else {
            vket.setEnabled(true);
        }

    }//GEN-LAST:event_jammmPropertyChange

    private void vjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vjamActionPerformed

    private void vketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vketActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void cboConnectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboConnectionItemStateChanged
        if (cboConnection.getSelectedItem().equals("Server")) {
            btnConnect.setText("ON");
            txtUser.setText("Server");
        } else {
            btnConnect.setText("Hubungkan!");
            txtUser.setText("Client");
        }
    }//GEN-LAST:event_cboConnectionItemStateChanged

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        if (btnConnect.getText().equals("Hubungkan!")) {
            btnConnect.setText("Putuskan!");
            client_connection();
            Thread thread = new Thread(this);
            thread.start();
        } else if (cboConnection.getSelectedItem().equals("Server")) {
            btnConnect.setText("OFF");
            read_connection();
            Thread thread = new Thread(this);
            thread.start();
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            server_writer.write(txtUser.getText() + ": " + txtMessege.getText());
            server_writer.newLine();
            server_writer.flush();
        } catch (IOException e) {
            Logger.getLogger(uaspemjar.class.getName()).log(Level.SEVERE, null, e);
        }
        listMesegge.add("Me: " + txtMessege.getText());
        txtMessege.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void txtMessegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessegeActionPerformed

    private void cboConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConnectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboConnectionActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void listMeseggeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMeseggeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listMeseggeActionPerformed

    private void client_connection() {
        try {
            String ip_address = JOptionPane.showInputDialog("Masuk Alamat Ip");
            client = new Socket(ip_address, 2000);
            cboConnection.setEnabled(false);
            server_reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            server_writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            btnConnect.setText("Putuskan");
        } catch (UnknownHostException e) {
            System.err.println("Akses  ke server gagal");
            System.exit(-1);
        } catch (IOException e) {
            Logger.getLogger(uaspemjar.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void read_connection() {
        try {
            try {
                try {
                    server = new ServerSocket(2000);
                    this.setTitle("Mohon Tunggu Sebenter...");
                } catch (IOException e) {
                    System.err.println("Gagal Membuat Server!");
                    System.exit(-1);
                }
                client = server.accept();
                this.setTitle("Terhubung ke " + client.getInetAddress());
            } catch (IOException e) {
                System.err.println("Akses ke server ditolak!");
                System.exit(-1);
            }
            server_reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            server_writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            System.err.println("Tidak dapat membaca pesan!");
            System.exit(-1);
        }
    }

    private void disconnected_by_connection() {
        try {
            client.close();
            server_reader.close();
            server_writer.close();
            cboConnection.setEnabled(true);
            btnConnect.setText("Hubungkan!");
        } catch (IOException e) {
            Logger.getLogger(uaspemjar.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void stopped_by_client() {
        try {
            server_reader.close();
            server_writer.close();
            btnConnect.setText("ON");
            this.setTitle("Terputus!");
        } catch (IOException e) {
            Logger.getLogger(uaspemjar.class.getName()).log(Level.SEVERE, null, e);
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
            java.util.logging.Logger.getLogger(uaspemjar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uaspemjar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uaspemjar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uaspemjar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uaspemjar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox cboConnection;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jammm;
    private java.awt.List listMesegge;
    private javax.swing.JTextField txtMessege;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField vjam;
    private javax.swing.JTextField vket;
    private javax.swing.JLabel vpath;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                listMesegge.add(server_reader.readLine());
            } catch (IOException e) {
                Logger.getLogger(uaspemjar.class.getName()).log(Level.SEVERE, null, e);
            }

        }
    }
}
