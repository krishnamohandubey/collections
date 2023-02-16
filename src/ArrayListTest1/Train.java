package ArrayListTest1;

public class Train implements Comparable<Train>{
    int time;
    String train_name;
    String source_station;
    String destination_station;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getSource_station() {
        return source_station;
    }

    public void setSource_station(String source_station) {
        this.source_station = source_station;
    }

    public String getDestination_station() {
        return destination_station;
    }

    public void setDestination_station(String destination_station) {
        this.destination_station = destination_station;
    }

    @Override
    public int compareTo(Train t) {
        /*  By time
        if(time == t.getTime())
            return 0;
        else if(time > t.getTime())
            return 1;
        return -1;*/

        // sorting By Train name
        return train_name.compareTo(t.getTrain_name());
    }
}
