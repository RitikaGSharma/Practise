package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ques2 {

	public static void main(String[] args) {
		
		List<String>list1=new ArrayList<>();
		List<String>mylist=Arrays.asList("Git","Github","GitLab","GitBash","Selenium","Java","Maven");
		for(String str:mylist)
		{
			if(str.contains("Git"))
				list1.add(str);
		}
	System.out.println(list1);
	}
	

}
