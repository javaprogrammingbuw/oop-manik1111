public class Triangle extends Shape{
	int a;
	int b; 

	public Triangle(int a, int b){
		this.a=a;
		this.b=b;
	}

	public Triangle(int a, int b, int color){
		this.a=a;
		this.b=b;
		super.setColor(color);
	}

	public Triangle(int a, int b, int red, int green, int blue){
		this.a=a;
		this.b=b;
		super.setColor(red,green,blue);
	}

	public double pythagoras(){
		return Math.sqrt(a*a + b*b);
		
	}
	public double area(){
		return 0.5 * a * b;
	}
	public double circumference(){
		return (Math.sqrt(a*a + b*b))+a+b;
	}
}