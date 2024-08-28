package pkg2.cis.contocorrente;

public class ContoCorrente {

    private String nome;
    private String cognome;
    private int numeroConto;
    private double ammontare;
    private String posizione;

    private static double massimoScoperto = 1000.0;
    private static int contatorePosizione = 1;

    public ContoCorrente(String nome, String cognome, int num) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroConto = num;
        this.ammontare = 0.0;
        this.posizione = String.valueOf(contatorePosizione++);
    }

    public ContoCorrente(String nome, String cognome, int num, double ammontare) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroConto = num;
        this.ammontare = ammontare;
        this.posizione = String.valueOf(contatorePosizione++);
    }

    public void operazione(double valore) {
        this.ammontare += valore;
    }

    public boolean isScoperto() {
        return this.ammontare < 0 && this.ammontare < -massimoScoperto;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public double getAmmontare() {
        return ammontare;
    }

    public static double getMassimoScoperto() {
        return massimoScoperto;
    }

    public static void setMassimoScoperto(double valore) {
        massimoScoperto = valore;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "ContoCorrente{" +
                "Nome='" + nome + '\'' +
                ", Cognome='" + cognome + '\'' +
                ", Numero Conto=" + numeroConto +
                ", Ammontare=" + ammontare +
                ", Posizione=" + posizione +
                '}';
    }
}