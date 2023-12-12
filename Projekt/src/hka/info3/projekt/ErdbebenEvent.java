package hka.info3.projekt;

import java.time.LocalDate;

public class ErdbebenEvent extends Event {
    private int staerke;

    public ErdbebenEvent(String eventId, int schweregrad, String ort, LocalDate datum, int staerke, String besonderheit) {
        super(eventId, EventType.ERDBEBEN, new EventDescription(ort, besonderheit), datum);
        this.staerke = staerke;
    }

    public int getStaerke() {
        return staerke;
    }

    @Override
    public void printDetails() {
        System.out.println("Stärke: " + this.getStaerke() + " (Richterskala)");
    }
}
