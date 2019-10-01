public abstract class Shape{
	protected int color;
	public abstract double area();
    public abstract double circumference();
	public void setColor(int r, int g, int b){
		color = r;
		color = (color << 8) + g;
		color = (color << 8) + b;
	}
	public void setColor(int color){
		this.color=color;
	}

	public int getColor(){
		return color;
	}
}