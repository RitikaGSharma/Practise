package assignment4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ques4 {

	public static void main(String[] args) {

		List<Integer>mylist=Arrays.asList(10,45,90,45,23,90,44);
for(int i =0 ;i<mylist.size();i++)
{
	if(i==1)
			System.out.println("The second element is:"+mylist.get(i));
	if(i==(mylist.size()-2))
		System.out.println("The second lat element is:"+mylist.get(i));
}
	}

}
