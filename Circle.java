//create a circle and calculate area of circle and circumference of the circle
public class Circle {
    double radius;

    void CalculateArea(){
        double area = 3.14*radius*radius;
        System.out.println("Area of circle = "+area);
    }
    void CalculateCircumference(){
        double circumference = 2*3.14*radius;
        System.out.println("Circumference of circle: "+circumference);
    }
    public static void main(String[] args){
        Circle c = new Circle();
        c.radius =5;
        c.CalculateArea();
        c.CalculateCircumference();
    }
}
