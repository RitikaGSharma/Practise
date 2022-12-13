package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ques3 {

	public static void main(String[] args) {
		
		List<String>mylist=Arrays.asList("Java","TestNG","Maven","Java");
		List<String>list1=new ArrayList<>();
		for(String str:mylist)
		{
		if(!list1.contains(str))
			list1.add(str);
		}
		System.out.println(list1);

	}

}
