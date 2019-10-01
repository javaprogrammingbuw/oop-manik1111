import java.text.DecimalFormat;

public class Main{
	public static void main(String[] args){
		Circle c = new Circle(3.5,75) ;
		Triangle t = new Triangle(7,2,56,92,100);
		Square s= new Square(5.0,85);
		//System.out.println("Area: " + t.area());
		DecimalFormat df = new DecimalFormat("####0.00");
		//System.out.println("Value: " + df.format(t.circumference()));
		//System.out.println("Circumference: " + Math.round(t.circumference()));
		//System.out.println("Color: " + t.getColor());
		// Creating array to avoid multiple print statements
		Shape[] shapes = new Shape[3];
		shapes[0] = c;
		shapes[1] = t;
		shapes[2] = s;
		for(Shape shape : shapes){
			System.out.println("Area");
			System.out.println(df.format(shape.area()));
			System.out.println("Circumference");
			System.out.println(df.format(shape.circumference()));
			System.out.println("Color");
			System.out.println(shape.getColor());
		}
	}
}