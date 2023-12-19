package hka.info3.projekt;

import java.util.UUID;
import java.time.LocalDate;

public class Hauptprogramm {
    public static void main(String[] args) {
        TeamManager teamManager = new TeamManager();
        EventManager eventManager = new EventManager();

        // Teamleiter und Wissenschaftler erstellen
        Scientist teamLeiter = new Scientist("Dr. Müller", "Geophysik", 15);
        Scientist mitglied1 = new Scientist("Dr. Schmidt", "Meteorologie", 10);
        Scientist mitglied2 = new Scientist("Dr. Fischer", "Hydrologie", 8);
        Scientist mitglied3 = new Scientist("Dr. Bauer", "Seismologie", 7);
        Scientist mitglied4 = new Scientist("Dr. Klein", "Geologie", 9);

        // Teams erstellen und registrieren
        Team team1 = new Team(teamLeiter);
        team1.mitgliedHinzufuegen(mitglied1);
        team1.mitgliedHinzufuegen(mitglied2);
        teamManager.teamRegistrieren(team1);

        Team team2 = new Team(teamLeiter);
        team2.mitgliedHinzufuegen(mitglied3);
        team2.mitgliedHinzufuegen(mitglied4);
        teamManager.teamRegistrieren(team2);

        // Ereignisse erstellen und registrieren
        String erdbebenId = UUID.randomUUID().toString();
        String tsunamiId = UUID.randomUUID().toString();
        String waldbrandId = UUID.randomUUID().toString();

        eventManager.ereignisRegistrieren(new ErdbebenEvent(erdbebenId, "Tokio", LocalDate.of(2021, 3, 11), 9, "Starke Erschütterungen"));        															
        eventManager.ereignisRegistrieren(new TsunamiEvent(tsunamiId, "Jakarta", LocalDate.of(2004, 12, 26), 15, 80, 300, "Hohe Wellen"));
        eventManager.ereignisRegistrieren(new WaldbrandEvent(waldbrandId, "Amazonas", LocalDate.of(2022, 7, 15), 80000, "Umfangreiche Brände im Regenwaldgebiet"));

        // Teams den Naturkatastrophen zuweisen und Registrierungen abrufen
        eventManager.benutzerRegistrieren(new EventRegistration(UUID.randomUUID().toString(), team1, eventManager.getEreignis(erdbebenId)));
        eventManager.benutzerRegistrieren(new EventRegistration(UUID.randomUUID().toString(), team2, eventManager.getEreignis(tsunamiId)));
        eventManager.benutzerRegistrieren(new EventRegistration(UUID.randomUUID().toString(), team1, eventManager.getEreignis(waldbrandId)));


        // Ausgabe der Teams
        System.out.println("\nAlle Teams:");
        System.out.println("---------------------");
        for (Team team : teamManager.getAlleTeams()) {
            System.out.println("Team ID: " + team.getTeamId());
            System.out.println("Teamleiter: " + team.getTeamLeiter().getName() + " (" + team.getTeamLeiter().getFachgebiet() + ")");
            for (Scientist mitglied : team.getTeamMitglieder()) {
                System.out.println("Mitglied: " + mitglied.getName() + " (" + mitglied.getFachgebiet() + ")");
            }
            System.out.println();
        }

        // Ausgabe der Naturkatastrophen
        System.out.println("Alle Naturkatastrophen:");
        System.out.println("---------------------");
        for (Event ereignis : eventManager.getAlleEreignisse()) {
            System.out.println("Name: " + ereignis.getEventName());
            System.out.println("Typ: " + ereignis.getEventType());
            System.out.println("Datum: " + ereignis.getDatum());
            System.out.println("Ort: " + ereignis.getDescription().getOrt());
            System.out.println("Beschreibung: " + ereignis.getDescription().getBesonderheit());
            System.out.println();
        }

        // Ausgabe der Benutzerregistrierungen
        System.out.println("Benutzer Registrierungen:");
        System.out.println("-------------------------");
        for (EventRegistration registrierung : eventManager.getAlleRegistrierungen()) {
            Event registriertesEreignis = registrierung.getEreignis();
            System.out.println("Registrierungs-ID: " + registrierung.getRegistrierungsId());
            System.out.println("Team: " + registrierung.getTeam().getTeamId());
            System.out.println("Katastrophe: " + registriertesEreignis.getEventName());
            System.out.println("Datum der Katastrophe: " + registriertesEreignis.getDatum());
            System.out.println("Beschreibung: " + registriertesEreignis.getDescription().getBesonderheit());

            // Rufen Sie die printDetails-Methode auf
            registriertesEreignis.printDetails();
            System.out.println();
        }

        }
}
