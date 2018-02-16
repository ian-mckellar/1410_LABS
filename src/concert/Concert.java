package concert;

public class Concert {
    private String name;
    private Time startTime;
    private Time endTime;

    public Concert(String n, Time start, Time end) {
        this.name = n;
        this.startTime = start;
        this.endTime = end;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
