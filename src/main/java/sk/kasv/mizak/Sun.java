package sk.kasv.mizak;

import java.util.ArrayList;
import java.util.List;

public class Sun {
    private static Sun sun=new Sun();
    Plannet plannet;
    private List<Plannet> plannets;


    private Sun(){
       plannets = new ArrayList<>();
    }
    public ArrayList<Plannet> getArray() {
        for(Plannet plannet:plannets){
            System.out.println(plannet.getName());
        }
        return (ArrayList<Plannet>) plannets;
    }

    public void addToArray(Plannet name) {
        plannets.add(name);
    }

    static Sun getInstance(){
        System.out.println("Sun was created.");
        return sun;
    }
}
