package ArrayListTest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrainMaster {

    public List<Train> getTrainList(){
        List<Train> l =new ArrayList<Train>();
        Train t= new Train();
        t.setTime(4);
        t.setTrain_name("KALKA MAIL");
        t.setSource_station("NDLS");
        t.setDestination_station("GAYA");
        l.add(t);

        Train t1= new Train();
        t1.setTime(2);
        t1.setTrain_name("GARIB RATH");
        t1.setSource_station("NDLS");
        t1.setDestination_station("RNC");
        l.add(t1);

        Train t2= new Train();
        t2.setTime(12);
        t2.setTrain_name("MAHABODHI EXPRESS");
        t2.setSource_station("NDLS");
        t2.setDestination_station("GAYA");
        l.add(t2);

        Train t3= new Train();
        t3.setTime(11);
        t3.setTrain_name("PURUSHOTAM EXPRESS");
        t3.setSource_station("NDLS");
        t3.setDestination_station("TATA");
        l.add(t3);

        Collections.sort(l);
        return l;
    }

    public static void main(String[] args) {
        TrainMaster tm =new TrainMaster();
        List<Train> tl =tm.getTrainList();
        for(Train p :tl){
            System.out.println("Time("+p.getTime()+"), Name("+p.getTrain_name()+"), Source ("+p.getSource_station()+"), Destination ("+p.getDestination_station()+") ");
        }
    }

}
