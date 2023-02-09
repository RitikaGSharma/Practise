package Assignment3;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Answer3 {

	public static void main(String[] args) {
		
	List<Integer> l1=Arrays.asList(2,3,4,5,6,7);
	Iterator<Integer> show=l1.iterator();
	while(show.hasNext())
	{
		System.out.println(show.next());
	}
	}

}
