package hka.info3.projekt;

import java.time.LocalDate;

public class WaldbrandEvent extends Event {
    private int ausdehnung;  // in Hektar

    public WaldbrandEvent(String eventId, int schweregrad, String ort, LocalDate datum, int ausdehnung, String besonderheit) {
        super(eventId, EventType.WALDBRAND, new EventDescription(ort, besonderheit), datum);
        this.ausdehnung = ausdehnung;
    }

    public int getAusdehnung() {
        return ausdehnung;
    }
}
