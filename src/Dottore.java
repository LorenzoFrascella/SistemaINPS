import java.util.ArrayList;

public class Dottore {
    private String idDottore;
    private String nome;
    private String cognome;
    private String specializzazione;
    private String telefono;
    private String email;
    private ArrayList<String> orariDisponibili = new ArrayList<>();
    private ArrayList<Paziente> pazienti = new ArrayList<>();

    public Dottore(String idDottore, String nome, String cognome, String specializzazione, String telefono, String email) {
        this.idDottore = idDottore;
        this.nome = nome;
        this.cognome = cognome;
        this.specializzazione = specializzazione;
        this.telefono = telefono;
        this.email = email;
    }

    public void setIdDottore(String idDottore) {
        this.idDottore = idDottore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getOrariDisponibili() {
        return orariDisponibili;
    }

    public void setOrariDisponibili(ArrayList<String> orariDisponibili) {
        this.orariDisponibili = orariDisponibili;
    }

    public ArrayList<Paziente> getPazienti() {
        return pazienti;
    }

    public void setPazienti(ArrayList<Paziente> pazienti) {
        this.pazienti = pazienti;
    }

    public void aggiungiPaziente(Paziente p) {
        pazienti.add(p);
    }

    public void rimuoviPaziente(String codiceFiscale) {
        for (Paziente p : pazienti){
            if(p.getCodiceFiscale().equalsIgnoreCase((codiceFiscale))){
                pazienti.remove(p);
            }
        }
    }

    public void modificaOrario(String nuovoOrario) {
        orariDisponibili.add(nuovoOrario);
    }

    public void stampaPazienti() {
        for (Paziente p : pazienti) {
            System.out.println(p.nome + " " + p.cognome);
        }
    }

    public String getIdDottore() {
        return idDottore;
    }
}
