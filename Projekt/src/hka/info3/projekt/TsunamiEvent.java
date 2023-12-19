package hka.info3.projekt;

import java.time.LocalDate;

public class TsunamiEvent extends Event {
    private int hoehe;
    private int geschwindigkeit;
    private int breite;

    public TsunamiEvent(String eventId, String ort, LocalDate datum, int hoehe, int geschwindigkeit, int breite, String besonderheit) {
        super(eventId, EventType.TSUNAMI, new EventDescription(ort, besonderheit), datum);
        this.hoehe = hoehe;
        this.geschwindigkeit = geschwindigkeit;
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public int getBreite() {
        return breite;
    }

    @Override
    public void printDetails() {
        System.out.println("Höhe: " + this.getHoehe() + " Meter");
        System.out.println("Geschwindigkeit: " + this.getGeschwindigkeit() + " km/h");
        System.out.println("Breite: " + this.getBreite() + " km");
    }
}
