package hka.info3.projekt;

public class EventRegistration {
    private String registrierungsId;
    private Team team;
    private Event ereignis;

    public EventRegistration(String registrierungsId, Team team, Event ereignis) {
        this.setRegistrierungsId(registrierungsId);
        this.team = team;
        this.ereignis = ereignis;
    }

    public Team getTeam() {
        return team;
    }

    public Event getEreignis() {
        return ereignis;
    }

	public String getRegistrierungsId() {
		return registrierungsId;
	}

	public void setRegistrierungsId(String registrierungsId) {
		this.registrierungsId = registrierungsId;
	}
}
