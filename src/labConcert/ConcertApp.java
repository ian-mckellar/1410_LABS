package labConcert;

public class ConcertApp {
    public static void main(String[] args){
        Time startTimeOfConcert = new Time(20, 30, 0);
        Time endTimeOfConcert = new Time(24, 0, 0);

        Concert concert = new Concert("phish", startTimeOfConcert, endTimeOfConcert);

        System.out.println(concert.toString());

    }
}