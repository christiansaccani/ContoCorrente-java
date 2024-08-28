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
public class ContoCorrenteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creazione di un conto corrente con intestatario e numero di conto
        ContoCorrente conto1 = new ContoCorrente("Mario", "Rossi", 12345);

        // Creazione di un conto corrente con intestatario, numero di conto e ammontare iniziale
        ContoCorrente conto2 = new ContoCorrente("Luigi", "Bianchi", 67890, 500.0);

        // Aggiunta di denaro al conto1
        conto1.operazione(200.0);
        System.out.println(conto1.toString()); // Output: ContoCorrente{Nome='Mario', Cognome='Rossi', Numero Conto=12345, Ammontare=200.0}

        // Prelievo di denaro dal conto2
        conto2.operazione(-600.0);
        System.out.println(conto2.toString()); // Output: ContoCorrente{Nome='Luigi', Cognome='Bianchi', Numero Conto=67890, Ammontare=-100.0}

        // Verifica se il conto2 è scoperto
        System.out.println("il conto "+conto2.getNumeroConto() + " ha un saldo di " + conto2.getAmmontare() + " e un massimo scoperto di " + ContoCorrente.getMassimoScoperto());
        System.out.println("Conto2 è scoperto? " + conto2.isScoperto()); // Output: Conto2 è scoperto? false

        // Modifica del massimo scoperto
        ContoCorrente.setMassimoScoperto(50.0);

        // Verifica se il conto2 è scoperto dopo la modifica del massimo scoperto
        System.out.println("il conto "+conto2.getNumeroConto() + " ha un saldo di " + conto2.getAmmontare() + " e un massimo scoperto di " + ContoCorrente.getMassimoScoperto());
        System.out.println("Conto2 è scoperto? " + conto2.isScoperto()); // Output: Conto2 è scoperto? true

        // Verifica del conto1
        System.out.println("il conto "+conto1.getNumeroConto() + " ha un saldo di " + conto1.getAmmontare() + " e un massimo scoperto di " + ContoCorrente.getMassimoScoperto());
        System.out.println("Conto1 è scoperto? " + conto1.isScoperto()); // Output: Conto1 è scoperto? false
 
        
        // TODO code application logic here
    }
    
}
