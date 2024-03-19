package testNG;

import org.testng.annotations.Test;

public class ReverseString {
	@Test
	public void reverseString() 
	{
		String s1="TEstYantra";
		String s=s1.toLowerCase();
		for(int i=s.length()-1;i>=0;i--) 
		{
			System.out.print(s.charAt(i));
			
		}
		System.out.println();
	}

}
