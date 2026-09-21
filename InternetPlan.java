//create a InternetPlan class with multiple constructors 
public class InternetPlan {
    String planName;
    int validity;
    double price;

    // Default constructor
    InternetPlan() {
        this("Basic", 28, 199);
    }

    // Constructor with one parameter
    InternetPlan(String planName) {
        this(planName, 28, 199);
    }

    // Constructor with three parameters
    InternetPlan(String planName, int validity, double price) {
        this.planName = planName;
        this.validity = validity;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Validity: " + validity + " days");
        System.out.println("Price: Rs " + price);
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Premium");
        InternetPlan p3 = new InternetPlan("Unlimited", 56, 499);

        p1.display();
        System.out.println();

        p2.display();
        System.out.println();

        p3.display();
    }
}
