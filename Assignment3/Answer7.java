package Assignment3;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;


public class Answer7 {



	public static void main(String[] args) {
		int count=0;
		List<String>mylist=Arrays.asList("Web Automation","API Automation","Mobile Automation");
	for(String str:mylist)
	{
		if(str.contains("Mobile"))
		count=1;
	}
	if (count==1)
		System.out.println("True");
}
}