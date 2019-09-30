public class ComplexTest{
	public static void main(String[] args){
		Complex c1 = new Complex(1,2);
		Complex c2= new Complex(1,2);
		//c1.addition(c2).print();
		Complex sum=c1.addition(c2);
		Complex resultMultiply = c1.multiplication(c2);// new object has been created in the method 
		System.out.println(resultMultiply);
		System.out.println(isEqual(c1,c2));


	}

	// creating method to check the equality of the complex number
	public static boolean isEqual(Complex value1,Complex value2){
		if(value1.num1==value2.num1 && value1.num2==value2.num2){
			return true;
		}
		else{
			return false;
		}
	}
}