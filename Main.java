import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


//        Circle


        System.out.println("Circle : \n");



        Circle c1 = new Circle(0 , 0 , 20);
        Circle c2 = new Circle(0 , 0 , 10);
        Circle c3 = new Circle(0 , 0 , 5);

        System.out.println("First Circle : \nArea : " + c1.calculateArea() + "\nCircumference : " + c1.calculateCircumference());
        System.out.println("\nSecond Circle : \nArea : " + c2.calculateArea() + "\nCircumference : " + c2.calculateCircumference());
        System.out.println("\nThird Circle : \nArea : " + c3.calculateArea() + "\nCircumference : " + c3.calculateCircumference());




//        Rectangle


        System.out.println("\n-------------------------- \n");
        System.out.println("Rectangle : \n");



        Rectangle r1 = new Rectangle(0 , 0 , 10 , 20);
        Rectangle r2 = new Rectangle(0 , 0 , 20 , 40);
        Rectangle r3 = new Rectangle(0 , 0 , 30 , 60);


        System.out.println("First Rectangle : \nArea : " + r1.calculateArea() + "\nCircumference : " + r1.calculateCircumference());
        System.out.println("\nSecond Rectangle : \nArea : " + r2.calculateArea() + "\nCircumference : " + r2.calculateCircumference());
        System.out.println("\nThird Rectangle : \nArea : " + r3.calculateArea() + "\nCircumference : " + r3.calculateCircumference());




//        Triangle


        System.out.println("\n-------------------------- \n");
        System.out.println("Rectangle : \n");



        Triangle t1 = new Triangle(0 , 0 ,20 , 20);
        Triangle t2 = new Triangle(0 , 0 , 30 , 30 );
        Triangle t3 = new Triangle(0 , 0 , 40 , 40);


        System.out.println("First Triangle : \nArea : " + t1.calculateArea() + "\nCircumference : " + t1.calculateCircumference());
        System.out.println("\nSecond Triangle : \nArea : " + t2.calculateArea() + "\nCircumference : " + t2.calculateCircumference());
        System.out.println("\nThird Triangle : \nArea : " + t3.calculateArea() + "\nCircumference : " + t3.calculateCircumference());






    }
}