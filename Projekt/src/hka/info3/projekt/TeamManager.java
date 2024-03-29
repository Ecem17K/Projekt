package hka.info3.projekt;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.UUID;

public class TeamManager {
    private Map<String, Team> teams;

    public TeamManager() {
        this.teams = new HashMap<>();
    }

    public void teamRegistrieren(Team team) {
        String teamId = UUID.randomUUID().toString();
        team.setTeamId(teamId);
        teams.put(teamId, team);
    }

    public Collection<Team> getAlleTeams() {
        return teams.values();
    }
}
