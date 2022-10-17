package Assignment1;

public class Task3 {

	public static void main(String[] args) {
		double count=0.0;
		double []values= {10,90.78,111,8989,7876};
		for(double obj:values)
		{
			count=count+obj;
		}
		count=count/5;
		System.out.print("Average of numbers is ="+count);
	}

}
