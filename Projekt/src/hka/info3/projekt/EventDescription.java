package hka.info3.projekt;

public class EventDescription {
    private String ort;
    private String besonderheit;

    public EventDescription(String ort, String besonderheit) {
        this.ort = ort;
        this.besonderheit = besonderheit;
    }

    public String getOrt() {
        return ort;
    }

    public String getBesonderheit() {
        return besonderheit;
    }
}
