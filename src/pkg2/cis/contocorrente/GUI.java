package pkg2.cis.contocorrente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pkg2.cis.contocorrente.Banca;
import pkg2.cis.contocorrente.ContoCorrente;

public class GUI extends javax.swing.JFrame {
    private Banca banca;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        banca = new Banca();
        
        txtNomeRsr.setVisible(false);
        txtCognomeRsr.setVisible(false);
        txtNumContoRsr.setVisible(false);
        txtPosizioneRsr.setVisible(false);

        lblNomeRsr.setVisible(false);
        lblCognomeRsr.setVisible(false);
        lblNumContoRsr.setVisible(false);
        lblPosizioneRsr.setVisible(false);

        btnModifica.setVisible(false);
        btnRicerca.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgErrore = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        btnConferma = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblCognome = new javax.swing.JLabel();
        lblNumConto = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCognome = new javax.swing.JTextField();
        txtNumConto = new javax.swing.JTextField();
        btnRicerca = new javax.swing.JButton();
        lblNomeRsr = new javax.swing.JLabel();
        lblCognomeRsr = new javax.swing.JLabel();
        lblNumContoRsr = new javax.swing.JLabel();
        txtNomeRsr = new javax.swing.JTextField();
        txtCognomeRsr = new javax.swing.JTextField();
        txtNumContoRsr = new javax.swing.JTextField();
        lblPosizioneRsr = new javax.swing.JLabel();
        txtPosizioneRsr = new javax.swing.JTextField();
        btnModifica = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnToggle = new javax.swing.JButton();

        javax.swing.GroupLayout dlgErroreLayout = new javax.swing.GroupLayout(dlgErrore.getContentPane());
        dlgErrore.getContentPane().setLayout(dlgErroreLayout);
        dlgErroreLayout.setHorizontalGroup(
            dlgErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dlgErroreLayout.setVerticalGroup(
            dlgErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnConferma.setBackground(new java.awt.Color(0, 204, 51));
        btnConferma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConferma.setForeground(new java.awt.Color(51, 51, 51));
        btnConferma.setText("Crea");
        btnConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfermaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConferma);
        btnConferma.setBounds(380, 210, 72, 27);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(80, 90, 41, 20);

        lblCognome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCognome.setText("Cognome");
        getContentPane().add(lblCognome);
        lblCognome.setBounds(80, 130, 65, 20);

        lblNumConto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumConto.setText("Numero Conto");
        getContentPane().add(lblNumConto);
        lblNumConto.setBounds(80, 170, 120, 20);

        txtNome.setToolTipText("Nome");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(320, 90, 187, 22);

        txtCognome.setToolTipText("Cognome");
        getContentPane().add(txtCognome);
        txtCognome.setBounds(320, 130, 187, 22);

        txtNumConto.setToolTipText("Numero Conto");
        getContentPane().add(txtNumConto);
        txtNumConto.setBounds(320, 170, 187, 22);

        btnRicerca.setBackground(new java.awt.Color(51, 51, 255));
        btnRicerca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRicerca.setForeground(new java.awt.Color(255, 255, 255));
        btnRicerca.setText("Ricerca");
        btnRicerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRicercaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRicerca);
        btnRicerca.setBounds(830, 250, 80, 27);

        lblNomeRsr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeRsr.setText("Nome");
        getContentPane().add(lblNomeRsr);
        lblNomeRsr.setBounds(530, 90, 41, 20);

        lblCognomeRsr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCognomeRsr.setText("Cognome");
        getContentPane().add(lblCognomeRsr);
        lblCognomeRsr.setBounds(530, 130, 65, 20);

        lblNumContoRsr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNumContoRsr.setText("Numero Conto");
        getContentPane().add(lblNumContoRsr);
        lblNumContoRsr.setBounds(530, 170, 110, 20);

        txtNomeRsr.setToolTipText("Nome");
        txtNomeRsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeRsrActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeRsr);
        txtNomeRsr.setBounds(720, 90, 187, 22);

        txtCognomeRsr.setToolTipText("Cognome");
        txtCognomeRsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCognomeRsrActionPerformed(evt);
            }
        });
        getContentPane().add(txtCognomeRsr);
        txtCognomeRsr.setBounds(720, 130, 187, 22);

        txtNumContoRsr.setToolTipText("Numero Conto");
        txtNumContoRsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumContoRsrActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumContoRsr);
        txtNumContoRsr.setBounds(720, 170, 187, 22);

        lblPosizioneRsr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPosizioneRsr.setText("Posizione");
        getContentPane().add(lblPosizioneRsr);
        lblPosizioneRsr.setBounds(530, 210, 80, 20);

        txtPosizioneRsr.setToolTipText("Numero Conto");
        getContentPane().add(txtPosizioneRsr);
        txtPosizioneRsr.setBounds(720, 210, 187, 22);

        btnModifica.setBackground(new java.awt.Color(255, 204, 0));
        btnModifica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModifica.setForeground(new java.awt.Color(51, 51, 51));
        btnModifica.setText("Modifica");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifica);
        btnModifica.setBounds(720, 250, 90, 27);

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(180, 30, 80, 27);

        btnToggle.setBackground(new java.awt.Color(255, 204, 0));
        btnToggle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnToggle.setForeground(new java.awt.Color(51, 51, 51));
        btnToggle.setText("Toggle");
        btnToggle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToggleActionPerformed(evt);
            }
        });
        getContentPane().add(btnToggle);
        btnToggle.setBounds(80, 30, 77, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isCreaMode = true;
    
    private void btnConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfermaActionPerformed
        String nome = txtNome.getText();
        String cognome = txtCognome.getText();
        String numContoStr = txtNumConto.getText();
        
        if (nome.isEmpty() || cognome.isEmpty() || numContoStr.isEmpty()) {
        showError("Tutti i campi devono essere compilati.");
        return;
        }

        try {
            // Conversione del numero di conto da String a int
            int numConto = Integer.parseInt(numContoStr);

            // Crea l'oggetto ContoCorrente e aggiungilo alla banca
            ContoCorrente c = new ContoCorrente(nome, cognome, numConto);
            banca.aggiungiConto(c);

            // Mostra un messaggio di successo
            showSuccess("Conto aggiunto con successo.");
            
            // Svuota i campi di testo
            txtNome.setText("");
            txtCognome.setText("");
            txtNumConto.setText("");

        } catch (NumberFormatException e) {
            showError("Errore: Il numero di conto deve essere un valore numerico valido.");
        } catch (Exception e) {
            showError("Errore: Si è verificato un problema durante l'aggiunta del conto.");
        }
    }//GEN-LAST:event_btnConfermaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnRicercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRicercaActionPerformed

    String nome = txtNomeRsr.getText();
    String cognome = txtCognomeRsr.getText();
    String numContoStr = txtNumContoRsr.getText();
    String posizione = txtPosizioneRsr.getText();
    
    // Verifica che almeno uno dei campi di ricerca sia compilato
    if (nome.isEmpty() && cognome.isEmpty() && numContoStr.isEmpty() && posizione.isEmpty()) {
         showError("Inserisci almeno uno dei criteri di ricerca.");
         return;
     }

    try {
        List<ContoCorrente> risultati = new ArrayList<>();
        
        if (!numContoStr.isEmpty()) {
            try {
                int numConto = Integer.parseInt(numContoStr);
                ContoCorrente conto = banca.ricercaPerNumero(numConto);
                if (conto != null) {
                    risultati.add(conto);
                }
            } catch (NumberFormatException e) {
                showError("Errore: Il numero di conto deve essere un valore numerico valido.");
                return;
            }
        }
        
        if (!nome.isEmpty() || !cognome.isEmpty()) {
            List<ContoCorrente> conti = banca.ricercaPerNomeECognome(nome, cognome);
            risultati.addAll(conti);
        }
        
        if (!posizione.isEmpty()) {
            List<ContoCorrente> conti = banca.ricercaPerPosizione(posizione);
            risultati.addAll(conti);
        }
        
        if (risultati.isEmpty()) {
            showInfo("Nessun conto trovato con i criteri specificati.");
        } else {
            aggiornaInterfacciaConRisultati(risultati);
        }
        
        } catch (Exception e) {
            showError("Errore: Si è verificato un problema durante la ricerca.");
        }
    }//GEN-LAST:event_btnRicercaActionPerformed

    private void txtNomeRsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeRsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeRsrActionPerformed

    private void txtNumContoRsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumContoRsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumContoRsrActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
    // Recupera i dati dalle text field di ricerca
    String nomeRsr = txtNomeRsr.getText();
    String cognomeRsr = txtCognomeRsr.getText();
    String numContoStr = txtNumContoRsr.getText();
    String posizioneRsr = txtPosizioneRsr.getText();

    // Verifica che il numero di conto sia compilato
    if (numContoStr.isEmpty()) {
        showError("Il numero di conto deve essere specificato per la modifica.");
        return;
    }

    try {
        // Converti il numero di conto da String a int
        int numConto = Integer.parseInt(numContoStr);

        // Trova il conto corrente da modificare
        ContoCorrente conto = banca.ricercaPerNumero(numConto);

        if (conto == null) {
            showError("Nessun conto trovato con il numero specificato.");
            return;
        }

        // Modifica dei dati del conto corrente
        if (!nomeRsr.isEmpty()) {
            conto.setNome(nomeRsr);
        }
        if (!cognomeRsr.isEmpty()) {
            conto.setCognome(cognomeRsr);
        }
        if (!posizioneRsr.isEmpty()) {
            conto.setPosizione(posizioneRsr);
        }

        showSuccess("Conto modificato con successo.");
        
        } catch (NumberFormatException e) {
            showError("Errore: Il numero di conto deve essere un valore numerico valido.");
        } catch (Exception e) {
            showError("Errore: Si è verificato un problema durante la modifica del conto.");
        }
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtCognome.setText("");
        txtNumConto.setText("");
        
        txtNomeRsr.setText("");
        txtCognomeRsr.setText("");
        txtNumContoRsr.setText("");
        txtPosizioneRsr.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    // ---------- FUNZIONI TOGGLE ----------//
    
    private void btnToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToggleActionPerformed
        // TODO add your handling code here:
        switchMode(isCreaMode);
        isCreaMode = !isCreaMode; // Inverte lo stato del toggle
    }//GEN-LAST:event_btnToggleActionPerformed

    private void txtCognomeRsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCognomeRsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCognomeRsrActionPerformed

    private void switchMode(boolean t) {
        btnToggle.setText("Toggle");

    // Mostra i campi e pulsanti relativi alla creazione
    txtNome.setVisible(!t);
    txtCognome.setVisible(!t);
    txtNumConto.setVisible(!t);
    
    lblNome.setVisible(!t);
    lblCognome.setVisible(!t);
    lblNumConto.setVisible(!t);
    
    btnConferma.setVisible(!t);

    // Nasconde i campi e pulsanti relativi alla ricerca
    txtNomeRsr.setVisible(t);
    txtCognomeRsr.setVisible(t);
    txtNumContoRsr.setVisible(t);
    txtPosizioneRsr.setVisible(t);
    
    lblNomeRsr.setVisible(t);
    lblCognomeRsr.setVisible(t);
    lblNumContoRsr.setVisible(t);
    lblPosizioneRsr.setVisible(t);
    
    btnRicerca.setVisible(t);
    btnModifica.setVisible(t);
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConferma;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnRicerca;
    private javax.swing.JButton btnToggle;
    private javax.swing.JDialog dlgErrore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblCognomeRsr;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeRsr;
    private javax.swing.JLabel lblNumConto;
    private javax.swing.JLabel lblNumContoRsr;
    private javax.swing.JLabel lblPosizioneRsr;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtCognomeRsr;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeRsr;
    private javax.swing.JTextField txtNumConto;
    private javax.swing.JTextField txtNumContoRsr;
    private javax.swing.JTextField txtPosizioneRsr;
    // End of variables declaration//GEN-END:variables

    // -------------------- //
    
    // Metodo per aggiornare l'interfaccia con i risultati della ricerca
    private void aggiornaInterfacciaConRisultati(List<ContoCorrente> risultati) {
    // Mostra un messaggio con il numero di conti trovati
        if (risultati.isEmpty()) {
            showInfo("Nessun conto trovato con i criteri specificati.");
        } else {
            // Crea un messaggio con i dettagli dei conti trovati
            StringBuilder msg = new StringBuilder("Conti trovati:\n");
            for (ContoCorrente conto : risultati) {
                msg.append(String.format("Nome: %s, Cognome: %s, Numero Conto: %d\n",
                                         conto.getNome(), conto.getCognome(), conto.getNumeroConto()));
            }
            // Mostra il messaggio
            showInfo(msg.toString());
            
            txtNomeRsr.setText(risultati.get(0).getNome());
            txtCognomeRsr.setText(risultati.get(0).getCognome());
            txtNumContoRsr.setText(String.valueOf(risultati.get(0).getNumeroConto()));
            txtPosizioneRsr.setText(risultati.get(0).getPosizione());
        }
    }
    
    // ---------- MESSAGE STRINGS---------- //
    
    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Errore", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccess(String message) {
        JOptionPane.showMessageDialog(this, message, "Successo", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showInfo(String message) {
        JOptionPane.showMessageDialog(this, message, "Informazione", JOptionPane.INFORMATION_MESSAGE);
    }
}
