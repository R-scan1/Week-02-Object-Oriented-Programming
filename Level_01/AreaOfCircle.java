class Circle{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }

    double claculateAreaOfCircle(){
        return Math.PI*Math.pow(radius,2);
    }

    double calculateCircumferenceOfCircle(){
        return 2*Math.PI*radius;
    }

    void display(double area,double circumference){
        System.out.println("Area of Circle is "+area);
        System.out.println("Circumference of Circle is :"+circumference);
    }
}

public class AreaOfCircle{
    public static void main(String[] args) {
        Circle circle=new Circle(4.5);
        double area=circle.claculateAreaOfCircle();
        double circumference=circle.calculateCircumferenceOfCircle();
        circle.display(area, circumference);
        
    }
}

