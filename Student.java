public class Student {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Pranathi";
        s1.age = 19;
        s1.marks = 90;

        s2.name = "Pavan";
        s2.age = 24;
        s2.marks = 94;

        s3.name = "Vani";
        s3.age = 20;
        s3.marks = 80;

        s1.display();
        s2.display();
        s3.display();

    }
}
