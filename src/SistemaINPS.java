import java.util.ArrayList;

public class SistemaINPS {
    private ArrayList <Paziente> pazienti = new ArrayList<>();
    private ArrayList <Dottore> dottori = new ArrayList<>();
    private ArrayList <VisitaMedica> visite = new ArrayList<>();

    public SistemaINPS(ArrayList<Paziente> pazienti, ArrayList<Dottore> dottori, ArrayList<VisitaMedica> visite) {
        this.pazienti = pazienti;
        this.dottori = dottori;
        this.visite = visite;
    }

    public ArrayList<Paziente> getPazienti() {
        return pazienti;
    }

    public void setPazienti(ArrayList<Paziente> pazienti) {
        this.pazienti = pazienti;
    }

    public ArrayList<Dottore> getDottori() {
        return dottori;
    }

    public void setDottori(ArrayList<Dottore> dottori) {
        this.dottori = dottori;
    }

    public ArrayList<VisitaMedica> getVisite() {
        return visite;
    }

    public void setVisite(ArrayList<VisitaMedica> visite) {
        this.visite = visite;
    }

    public void aggiungiPaziente(Paziente p){
        pazienti.add(p);
    }

    public void rimuoviPaziente(String codiceFiscale){
        for (Paziente p : pazienti){
            if(p.getCodiceFiscale().equalsIgnoreCase(codiceFiscale)){
                pazienti.remove(p);
            }
        }
    }

    public void cercaPaziente(String codiceFiscale){
        for (Paziente p : pazienti){
            if(p.getCodiceFiscale().equalsIgnoreCase(codiceFiscale)){
                System.out.println("paziente: " + p.getCognome());
            }
        }
    }

    public void aggiungiDottore(Dottore d){
        dottori.add(d);
    }

    public void rimuoviDottore(String id){
        for (Dottore d : dottori){
            if(d.getIdDottore().equalsIgnoreCase(id)){
                dottori.remove(d);
            }
        }
    }

    public void cercaDottore(String id){
        for (Dottore d : dottori){
            if(d.getIdDottore().equalsIgnoreCase(id)){
                System.out.println("dottore: " + d.getCognome());
            }
        }
    }


}
