public class VisitaMedica {
    private String data;
    private String orario;
    private Dottore dottore;
    private Paziente paziente;
    private String stato;

    public VisitaMedica(String data, String orario, Dottore dottore, Paziente paziente, String stato) {
        this.data = data;
        this.orario = orario;
        this.dottore = dottore;
        this.paziente = paziente;
        this.stato = stato;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    public Dottore getDottore() {
        return dottore;
    }

    public void setDottore(Dottore dottore) {
        this.dottore = dottore;
    }

    public Paziente getPaziente() {
        return paziente;
    }

    public void setPaziente(Paziente paziente) {
        this.paziente = paziente;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public  String confermaVisita(){
        stato = "Effettuata";
        return stato;
    }

    public  String annullaVisita(){
        stato = "Annullata";
        return stato;
    }

    public String stampaDettagli() {
        return "VisitaMedica{" +
                "data='" + data + '\'' +
                ", orario='" + orario + '\'' +
                ", dottore=" + dottore +
                ", paziente=" + paziente +
                ", stato='" + stato + '\'' +
                '}';
    }
}
