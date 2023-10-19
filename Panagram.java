import java.util.Scanner;

public class Panagram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		boolean rs=isPanagram(st);
		if(rs==true)
			System.out.println("it is a Panagram");
		else
			System.out.println("it is not Panagram");
	}

	 static boolean isPanagram(String st) 
	 {
		 if(st.length()<26)
		return false;
		 st=st.toLowerCase();
		 for(char ch='a';ch<='z';ch++)
		 {
			 if(st.indexOf(ch)==-1)
				 return false;
		 }
		return true;
	}

}
