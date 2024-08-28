/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.cis.contocorrente;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banca {
    private List<ContoCorrente> banca;

    public Banca() {
        this.banca = new ArrayList<>();
    }

    public void aggiungiConto(ContoCorrente c) {
        banca.add(c);
    }

    public ContoCorrente getConto(int posizione) {
        if (posizione >= 0 && posizione < banca.size()) {
            return banca.get(posizione);
        }
        return null;
    }

    public ContoCorrente ricercaPerNumero(int numeroConto) {
        for (ContoCorrente conto : banca) {
            if (conto.getNumeroConto() == numeroConto) {
                return conto;
            }
        }
        return null;
    }

    public List<ContoCorrente> ricercaPerNomeECognome(String nome, String cognome) {
        return banca.stream()
                .filter(c -> (nome.isEmpty() || c.getNome().equalsIgnoreCase(nome)) &&
                             (cognome.isEmpty() || c.getCognome().equalsIgnoreCase(cognome)))
                .collect(Collectors.toList());
    }

    public List<ContoCorrente> ricercaPerPosizione(String posizione) {
        return banca.stream()
                .filter(c -> posizione.isEmpty() || c.getPosizione().equalsIgnoreCase(posizione))
                .collect(Collectors.toList());
    }
}