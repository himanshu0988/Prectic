import java.util.*;
public class Plandrom {

	public static void main(String[] args) {
		String s="nin";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		System.out.println();
		
		if(s.equals(s1))
		{
			System.out.println(" STring is plandrom");
		}else
		{
			System.out.println(" STring is not plandrom");
		}
	}
}
