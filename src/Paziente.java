import java.util.ArrayList;

public class Paziente {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int eta;
    private String indirizzo;
    private String telefono;
    private String email;
    private ArrayList <Diagnosi> diagnosi = new ArrayList<>();

    public Paziente(String nome, String cognome, String codiceFiscale, int eta, String indirizzo, String telefono, String email, ArrayList<Diagnosi> diagnosi) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.eta = eta;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.email = email;
        this.diagnosi = diagnosi;
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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
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

    public ArrayList<Diagnosi> getDiagnosi() {
        return diagnosi;
    }

    public void setDiagnosi(ArrayList<Diagnosi> diagnosi) {
        this.diagnosi = diagnosi;
    }

    @Override
    public String toString() {
        return "Paziente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", eta=" + eta +
                ", indirizzo='" + indirizzo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", diagnosi=" + diagnosi +
                '}';
    }
}
