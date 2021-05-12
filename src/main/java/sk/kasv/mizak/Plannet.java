package sk.kasv.mizak;

public class Plannet {
    private String name;
    private Long distance;
    Sun sun=Sun.getInstance();

    public Plannet(String name, Long distance) {
        this.name = name;
        this.distance = distance;
        System.out.println("Plannet "+name+" is " +distance+" away from Sun.");
    }

    public String getName() {
        return name;
    }

    public Long getDistance() {
        return distance;
    }
}
