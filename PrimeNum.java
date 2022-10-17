package Assignment1;

public class PrimeNum {

	public static void main(String[] args) {
		
		int counter=0;
		for(int i = 1; i<=1000;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(i%j==0)
				{
					counter=counter+1;
				}
				
			
		}
			if(counter<3)
			{
				System.out.println(i);
		
		}
			counter=0;
	}

}
}
