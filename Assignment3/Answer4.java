package Assignment3;
import java.util.*;
public class Answer4 {
	static int sum=0;
	public static void main(String[] args) {
		List<Integer> count=Arrays.asList(2,3,4,5,6);
		for(int i :count)
		{
			sum=sum+i;
		}
		System.out.println("Sum of number"+sum);
		
	}

}
