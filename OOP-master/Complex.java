public class Complex{
	public double num1;
	public double num2;

    // Creating constructor with two parameters
    public Complex(double num1,double num2){
    	this.num1=num1;
    	this.num2=num2;
    }

    // Creating method for adding two complex number with single parameter (OR)
    //two parameters(Complex number1,Complex number2)=[number1.num1+number2.num1]
	public Complex addition(Complex number){
		Complex sum = new Complex(this.num1+number.num1,this.num2+number.num2);
		return sum;
	}
	// Creating multiplication method 
	public Complex multiplication(Complex number){
		Complex mult= new Complex((this.num1*number.num1)-(this.num2*number.num2)
			,(this.num1+number.num2)-(this.num2+number.num1));
		return mult;
	}
	/*public void print(){
		System.out.println(this.num1+"  "+this.num2);
	}*/
	// Creating printing method to print the value instead of reference address.(So printing the input variable)
	public String toString(){
		return num1+"  "+num2;
	}
}

