package sk.kasv.mizak;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public ArrayList<Plannet> findByPattern(){
        String regex="^.*Mer.*$";
        Pattern p = Pattern.compile(regex);
        for (Plannet plannet:plannets) {
            Matcher m=p.matcher(plannet.getName());
            if (m.matches()) {
          //    plannets.add(plannet);
                System.out.println(plannet.getName());

            }
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
