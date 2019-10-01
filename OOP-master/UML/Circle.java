public class Circle extends Shape{
	double radius;
	final float PI=3.14F;

	public Circle(double radius){
		this.radius=radius;
	}

	public Circle(double radius, int color){
		this.radius= radius;
		super.setColor(color);
	}
	

	public Circle(double radius,int red, int green, int blue){
		this.radius=radius;
		super.setColor(red,green,blue);
	}

	public double area(){
		return PI * radius * radius;
	
	}

	public double circumference(){
		return 2 * PI * radius;
	}
}