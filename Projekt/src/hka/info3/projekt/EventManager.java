package hka.info3.projekt;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class EventManager {
	
    // Speichert Ereignisse mit ihrer ID als Schlüssel
    private Map<String, Event> ereignisseMap;

    // Speichert Registrierungen mit ihrer ID als Schlüssel
    private Map<String, EventRegistration> registrierungenMap;

    public EventManager() {
        // Hashmaps erstellen
        this.ereignisseMap = new HashMap<>();
        this.registrierungenMap = new HashMap<>();
    }

    // Fügt ein Ereignis zur Map hinzu
    public void ereignisRegistrieren(Event event) {
        ereignisseMap.put(event.getEventId(), event);
    }

    // Fügt eine Registrierung zur Map hinzu
    public void benutzerRegistrieren(EventRegistration registrierung) {
        registrierungenMap.put(registrierung.getRegistrierungsId(), registrierung);
    }

    // Gibt ein Ereignis anhand seiner ID zurück
    public Event getEreignis(String eventId) {
        return ereignisseMap.get(eventId);
    }

    // Gibt alle Ereignisse zurück
    public Collection<Event> getAlleEreignisse() {
        return ereignisseMap.values();
    }

    // Gibt alle Registrierungen zurück
    public Collection<EventRegistration> getAlleRegistrierungen() {
        return registrierungenMap.values();
    }

}
