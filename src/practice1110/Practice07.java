package practice1110;

public class Practice07 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}
/*
class Car
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("將車號設為" + num);
	}
	
	void setGas(double g)
	{
		gas = g;
		System.out.println("將汽油設為"+gas);
	}
}
*/