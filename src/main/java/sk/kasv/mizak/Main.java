package sk.kasv.mizak;

public class Main {
    public static void main(String[] args) {
        Sun sun=Sun.getInstance();
        Plannet earth=new Plannet("Earth",149600000l);
        Plannet uran=new Plannet("Uran",2871000000l);
        Plannet saturn=new Plannet("Saturn",1434000000l);
        Plannet mars=new Plannet("Mars",227900000l);
        Plannet mercury=new Plannet("Mercury",57910000l);
        Plannet venus=new Plannet("Venus",108200000l);
        Plannet jupiter=new Plannet("Jupiter",778500000l);
        Plannet neptune=new Plannet("Neptune",4495000000l);
        sun.addToArray(jupiter);
        sun.addToArray(mercury);
        sun.addToArray(venus);
        sun.addToArray(neptune);
        sun.addToArray(uran);
        sun.addToArray(saturn);
        sun.addToArray(earth);
        sun.addToArray(mars);
        sun.getArray();
    }
}
