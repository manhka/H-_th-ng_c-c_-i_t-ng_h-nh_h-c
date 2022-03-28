import jdk.swing.interop.SwingInterOpUtils;

public class Circle extends Shape {
    private double radius=1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "------Circle------"+
                "\nwhich is a subclass of"+
                super.toString()+
                "\nradius=" + radius +
                "\ncolor:"+getColor()+
                "\nfilled:"+isFilled()+
                "\nArea="+getArea()+
                "\nPrimeter="+getPerimeter();
    }
    public static void main(String[] args) {
        Circle circle=new Circle(1.2,"red",true);
        System.out.println(circle);
    }
}
