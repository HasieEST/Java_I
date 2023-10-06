package week5OverloadedCounter;

public class CounterApplication {
    public static void main(String[] args) {
        Counter p = new Counter(25, true);

        p.decrease();
        System.out.println(p.value());

        p.increase(10);
        System.out.println(p.value());

        p.decrease(100);
        System.out.println(p.value());


        Counter f = new Counter();

        f.decrease(100);
        System.out.println(f.value());

        f.increase();
        System.out.println(f.value());

        f.increase(-100);
        System.out.println(f.value());

        f.decrease(-100);
        System.out.println(f.value());

    }
}
