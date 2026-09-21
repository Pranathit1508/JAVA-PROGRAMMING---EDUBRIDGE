//program of polymorphism
public  class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer writes code");
    }
}

class Tester extends Employee {
    @Override
    void work() {
        System.out.println("Tester tests software");
    }
    public static void main(String[] args) {

        Employee e1 = new Developer();
        Employee e2 = new Tester();

        e1.work();
        e2.work();
    }

}
