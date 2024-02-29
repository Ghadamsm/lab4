public class Triangle extends Shape{


   private double height ;
   private double base ;



    Triangle(int x, int y , double height , double base) {
        super(x, y);

        this.base = base ;
        this.height = height ;

    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }







    @Override
    public double calculateArea() {
        return (height * base ) / 2 ;
    }

    @Override
    public double calculateCircumference() {
        return base + base + base ;
    }
}
