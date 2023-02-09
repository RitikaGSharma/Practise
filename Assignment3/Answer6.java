package Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer6 {

	public static void main(String[] args) {
		
		List<Integer>l1=new ArrayList<>(Arrays.asList(33,44,55,66,77,88));
		l1.remove(1);
		l1.remove(Integer.valueOf(55));
		l1.add(3, 90);
		System.out.println("Length of list is : "+l1.size());
		for(int i = 0 ;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		int[] arr = new int[l1.size()];
		l1.toArray();
		System.out.println(arr[2]);
	}

}
