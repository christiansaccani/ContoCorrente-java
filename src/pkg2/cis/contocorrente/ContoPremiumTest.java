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
public class ContoPremiumTest {
    public static void main(String[] args) {
        // Creazione di un conto premium con tasso di interesse del 4% e bonus deposito del 2%
        ContoCorrentePremium contoPremium = new ContoCorrentePremium("Giuseppe", "Verdi", 67890, 500.0, 4.0, 2.0);

        // Esegui un deposito di 1000.0, che include un bonus di 2.0
        contoPremium.operazione(1000.0);

        // Stampa le informazioni del conto
        System.out.println(contoPremium.toString()); // Output: ContoCorrente{nome='Giuseppe', cognome='Verdi', numeroConto=67890, ammontare=602.0, bonusDeposito=2.0}

        // Verifica il bonus deposito
        System.out.println("Bonus deposito attuale: " + contoPremium.getBonusDeposito()); // Output: 2.0

        ContoCorrente conto = new ContoCorrente("Mario", "Rossi", 67890, 500.0);
// Esegui un deposito di 1000.0
        conto.operazione(1000.0);

        // Stampa le informazioni del conto
        System.out.println(conto.toString()); // Output: ContoCorrente{nome='Giuseppe', cognome='Verdi', numeroConto=67890, ammontare=602.0, bonusDeposito=2.0}

    }
}
