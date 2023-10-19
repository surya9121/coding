import java.util.ArrayList;
import java.util.Collections;

public class ShuffleNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>(); 
		for(int i=1;i<=7;i++)
		{
			ar.add(i);
		}
		System.out.print("before shuffle array elements are : "+ar);
		Collections.shuffle(ar);
		System.out.println();
		System.out.print("after shuffle array elements are : "+ar);

	}
}
