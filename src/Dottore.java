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

    public void aggiungiPaziente(Paziente p) {
        pazienti.add(p);
    }

    public void rimuoviPaziente(String codiceFiscale) {
        pazienti.removeIf(p -> p.getCodiceFiscale().equals(codiceFiscale));
    }

    public void modificaOrario(String nuovoOrario) {
        orariDisponibili.add(nuovoOrario);
    }

    public void stampaPazienti() {
        for (Paziente p : pazienti) {
            System.out.println(p.getNomeCompleto());
        }
    }

    public ArrayList<Paziente> trovaPazientiPerSpecializzazione(String specializzazione) {
        return this.specializzazione.equalsIgnoreCase(specializzazione) ? pazienti : new ArrayList<>();
    }

    public String getIdDottore() {
        return idDottore;
    }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }
}
