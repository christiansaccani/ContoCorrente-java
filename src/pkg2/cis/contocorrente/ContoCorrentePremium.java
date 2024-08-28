/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.cis.contocorrente;

/**
 *
 * @author pgrec
 */
// Estensione della classe ContoCorrente
public class ContoCorrentePremium extends ContoCorrente {

    // Attributi aggiuntivi per il conto corrente premium
    private double tassoInteresse;  // Tasso di interesse annuale
    private double bonusDeposito;   // Bonus percentuale per ogni deposito

    // Costruttore 
    public ContoCorrentePremium(String nome, String cognome, int num, double ammontare, double tassoInteresse, double bonusDeposito) {
        super(nome, cognome, num, ammontare);  // Chiama il costruttore della superclasse ContoCorrente
        this.tassoInteresse = tassoInteresse;
        this.bonusDeposito = bonusDeposito;
    }
    
    // Override del metodo operazione per aggiungere il bonus deposito
    @Override
    public void operazione(double somma) {
        double bonus = 0;
        if(somma>0){
            bonus = somma * (bonusDeposito / 100);
        }   
        super.operazione(somma + bonus);
    }
    // Metodo per applicare l'interesse annuale all'ammontare del conto
    public void applicaInteresse() {
        double interesse = getAmmontare() * (tassoInteresse / 100);
        super.operazione(interesse);
    }
    // Override del metodo toString per includere i nuovi dettagli     @Override
    public String toString() {
        return super.toString()+ ", tassoInteresse=" + tassoInteresse +"%, bonusDeposito=" + bonusDeposito + "%}";
    }

    public double getBonusDeposito() {
        return bonusDeposito;
    }
    
    
 }
