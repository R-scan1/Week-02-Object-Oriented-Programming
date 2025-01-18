public class Circle {
    private double radius;

    Circle(){
        this(7.0);
    }

    Circle(double radius){
        this.radius=radius;
    }

    void display(){
        System.out.println("Radius of circle is :"+radius);
    }
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.display();
    }
}
