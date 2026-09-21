//Call parent class method super
public class Parent {
    void display() {
        System.out.println("This is parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is child class method");
        super.display();
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
