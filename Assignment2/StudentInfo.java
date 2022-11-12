package Assignment2;
import java.util.Scanner;

public class StudentInfo {
	int number;
	public static void main(String[] args) {
		
					
				StudentInfo obj1=new StudentInfo();
				obj1.info();
				
	}
	
	public void info()
	
	{
		Scanner obj = new Scanner(System.in);
	System.out.println("Please enter the number of students");
	number = obj.nextInt();
Object[][] info=new Object[number][2];
		for(int i = 0;i<number;i++)
		{
			
			System.out.println("Please enter your name");
			info[i][0]=obj.next();
			System.out.println("Please enter your email");
			info[i][1]=obj.next();
	
		}
		
	System.out.println("Please enter which student details are you looking for:");
	int checkentry=obj.nextInt();
	System.out.println("The details for index "+checkentry+ " is below:");
for(int k=0;k<2;k++)
{
	System.out.println(info[checkentry][k]);
}
	obj.close();	
	

}
}
