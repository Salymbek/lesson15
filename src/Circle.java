public class Circle {
    private double PI;
    private int radius;

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(double PI, int radius) {
        this.PI = PI;
        this.radius = radius;
    }

   public double area(double PI, int radius){
        return PI * (radius * radius);
   }

   public double circumference(double PI, int radius){
        return PI * 2 * radius;
   }

}
