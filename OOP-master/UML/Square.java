public class Square extends Shape{
	double width;

	public Square(double width){
		this.width=width;
	}
	public Square(double width,int color){
		this.width=width;
		super.setColor(color);
	}

	public Square(double width, int red, int green, int blue){
		this.width=width;
		super.setColor(red,green,blue);
	}
	public double area(){
		return width * width;
	}
	public double circumference(){
	
		return 4 * width;
	}
} 