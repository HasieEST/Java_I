package week4;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        value += 1;
        if (value > upperLimit) {
            value = 0;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) throws Exception {
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(0);
        minutes.setValue(26);
        hours.setValue(19);

        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }
    }
}
