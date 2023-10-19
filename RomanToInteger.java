import java.util.*;

public class RomanToInteger 
{
	public static int romanToInt(String s)
	{
		Map<Character,Integer> m=new HashMap<>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		
		int result=m.get(s.charAt(s.length()-1));
		for(int i=s.length()-2;i>=0;i--)
		{
			if(m.get(s.charAt(i))<m.get(s.charAt(i+1)))
            {
				result -=m.get(s.charAt(i));
            }
			else
			{
				result +=m.get(s.charAt(i));
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int s2=romanToInt(s1);
		System.out.println("number is "+s2);
		
	}
}
