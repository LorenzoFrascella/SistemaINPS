import java.time.LocalDate;

public class Diagnosi {
    private String descrizione;
    private String terapia;
    private LocalDate data;
    private LocalDate dataScadenza;
    private Dottore dottore;

    public Diagnosi(String descrizione, String terapia, LocalDate data, LocalDate dataScadenza, Dottore dottore) {
        this.descrizione = descrizione;
        this.terapia = terapia;
        this.data = data;
        this.dataScadenza = dataScadenza;
        this.dottore = dottore;
    }

    public boolean isScaduta() {
        return LocalDate.now().isAfter(dataScadenza);
    }

    public void stampaDettagli() {
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Terapia: " + terapia);
        System.out.println("Data: " + data);
        System.out.println("Scadenza: " + dataScadenza);
        System.out.println("Dottore: " + dottore.getNomeCompleto());
    }
}
