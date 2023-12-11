package hka.info3.projekt;

public class Scientist {
    private String name;
    private String fachgebiet;

    public Scientist(String name, String fachgebiet, int erfahrungsjahre) {
        this.name = name;
        this.fachgebiet = fachgebiet;
    }

    public String getName() {
        return name;
    }

    public String getFachgebiet() {
        return fachgebiet;
    }
}
