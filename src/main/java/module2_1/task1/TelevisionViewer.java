package module2_1.task1;

public class TelevisionViewer {
    private int day;
    private Television television;

    public TelevisionViewer(Television tv) {
        this.day = 1;
        this.television = tv;
    }

    public int getDay() {
        return this.day;
    }

    public void wakeUp() {
        System.out.println("Woke up, day " + day);
    }

    public void sleep() {
        this.day++;
        System.out.println("Falling asleep");
    }

    public Television getTV() {
        return this.television;
    }
}
