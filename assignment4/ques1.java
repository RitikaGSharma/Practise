package assignment4;
import java.util.List;
import java.util.Arrays;

public class ques1 {

	public static void main(String[] args) {
		List<String>mylist=Arrays.asList("Java","Selenium","TestNG","Git","Github");
          for(int i=mylist.size()-1;i>=0;i--)
        	  System.out.println(mylist.get(i));
	}

}
