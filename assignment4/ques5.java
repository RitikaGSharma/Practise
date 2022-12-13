package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ques5 {

	public static void main(String[] args) {
	
		List<Integer>list1=Arrays.asList(11,22,33);
		List<Integer>list2=Arrays.asList(9,19,29);
		List<Integer>list3=Arrays.asList( 7,17,27);
		List<Integer>mylist=new ArrayList<>();
		mylist.addAll(list1);
		mylist.addAll(list2);
		mylist.addAll(list3);
		System.out.println(mylist);
		

		

	}

}
