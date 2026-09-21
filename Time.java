//constructor overloading by displaying time in seconds,minutes,and hours
public class Time {
    int seconds;
    int minutes;
    int hours;

    // Constructor with one parameter
    Time(int s) {
        seconds = s;
    }

    // Constructor with two parameters
    Time(int m, int s) {
        minutes = m;
        seconds = s;
    }

    // Constructor with three parameters
    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    void display() {
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }

    public static void main(String[] args) {

        Time t1 = new Time(30);
        Time t2 = new Time(10, 20);
        Time t3 = new Time(2, 30, 45);

        t1.display();
        t2.display();
        t3.display();
    }
}
