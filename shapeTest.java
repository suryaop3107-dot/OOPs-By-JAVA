abstract class shape {
    abstract double area();

    void displayArea(){
        System.out.println("Area : " + area());
    }
}


class Circle extends shape {
double radius;

Circle(double radius){
    this.radius =radius;
}
double area(){
    return 3.14 * radius * radius;
}
}


class Rectangle extends shape {
    double length,breadth;

    Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double area(){
        return length*breadth;
    }
}
public class shapeTest {
    public static void main(String[] args) {
        shape[] shapes = new shape[2];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        for (shape s : shapes) {
            s.displayArea();
        }
    }
}
