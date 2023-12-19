package hka.info3.projekt;

import java.time.LocalDate;

public class WaldbrandEvent extends Event {
    private int ausdehnung;

    public WaldbrandEvent(String eventId, String ort, LocalDate datum, int ausdehnung, String besonderheit) {
        super(eventId, EventType.WALDBRAND, new EventDescription(ort, besonderheit), datum);
        this.ausdehnung = ausdehnung;
    }

    public int getAusdehnung() {
        return ausdehnung;
    }
    
    @Override
    public void printDetails() {
        System.out.println("Ausdehnung: " + this.getAusdehnung() + " Hektar");
    }
}
