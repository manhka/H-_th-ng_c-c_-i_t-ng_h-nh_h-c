public class Rectangle extends Shape{
    private double width=1.0;
    private double height=1.0;
    public Rectangle(){
    }
public  Rectangle(double width, double height){
        this.height=height;
        this.width=width;
}
public  Rectangle(double width,double height, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.height=height;
}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return (float) Math.round(this.height*this.width);
    }
    public double getPrimeter(){
        return (float) Math.round(2*(this.width+this.height));
    }

    @Override
    public String toString() {
        return "-----------RECTANGLE--------------"+"\nwidth="+this.width+" " +
                "\nwhich is a subclass of "+
                super.toString()+
                "\nheight="+this.height+
                "\ncolor:"+this.getColor()+
                "\nfilled:"+this.isFilled()+
                "\nArea="+this.getArea()+" cm^2"+
                "\nPerimeter="+this.getPrimeter()+" cm";
    }

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        rectangle.setColor("brown");
        rectangle.setFilled(true);
        rectangle.setWidth(6.3);
        rectangle.setHeight(6.1);
        System.out.println(rectangle);
    }
}
