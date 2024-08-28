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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgErrore = new javax.swing.JDialog();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConferma.setBackground(new java.awt.Color(0, 204, 51));
        btnConferma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConferma.setForeground(new java.awt.Color(51, 51, 51));
        btnConferma.setText("Crea");
        btnConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfermaActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        lblCognome.setText("Cognome");

        lblNumConto.setText("Numero Conto");

        txtNome.setToolTipText("Nome");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCognome.setToolTipText("Cognome");

        txtNumConto.setToolTipText("Numero Conto");

        btnRicerca.setBackground(new java.awt.Color(51, 51, 255));
        btnRicerca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRicerca.setForeground(new java.awt.Color(255, 255, 255));
        btnRicerca.setText("Ricerca");
        btnRicerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRicercaActionPerformed(evt);
            }
        });

        lblNomeRsr.setText("Nome");

        lblCognomeRsr.setText("Cognome");

        lblNumContoRsr.setText("Numero Conto");

        txtNomeRsr.setToolTipText("Nome");
        txtNomeRsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeRsrActionPerformed(evt);
            }
        });

        txtCognomeRsr.setToolTipText("Cognome");

        txtNumContoRsr.setToolTipText("Numero Conto");
        txtNumContoRsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumContoRsrActionPerformed(evt);
            }
        });

        lblPosizioneRsr.setText("Posizione");

        txtPosizioneRsr.setToolTipText("Numero Conto");

        btnModifica.setBackground(new java.awt.Color(255, 204, 0));
        btnModifica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModifica.setForeground(new java.awt.Color(51, 51, 51));
        btnModifica.setText("Modifica");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCognome)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumConto)
                            .addComponent(lblNomeRsr, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCognomeRsr)
                            .addComponent(lblNumContoRsr)
                            .addComponent(lblPosizioneRsr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumConto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeRsr, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCognomeRsr, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumContoRsr, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPosizioneRsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConferma, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifica)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRicerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCognome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumConto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumConto))
                .addGap(18, 18, 18)
                .addComponent(btnConferma)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeRsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeRsr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCognomeRsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCognomeRsr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumContoRsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumContoRsr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPosizioneRsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPosizioneRsr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRicerca)
                    .addComponent(btnModifica))
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JDialog dlgErrore;
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
