package package1;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LexicographicalStringArray {

	private static int lexicographical(String[] s) {
		char[] ch = new char[s.length];
		char[] ch1 = new char[s.length];
		int count=0;
		for(int i=0;i<s[0].length();i++)
		{
			for(int j=0;j<s.length;j++)
			{
				ch[j] = s[j].charAt(i);
			}
			ch1 = ch.clone();
			Arrays.sort(ch1);
			System.out.println(Arrays.toString(ch));

			System.out.println(Arrays.toString(ch1));
			if(Arrays.equals(ch,ch1))
			{
				count++;
			}
		}
		return count;
	}
	
	@Test
	public void testCase1()
	{
		String[] s = {"wbc","pfg","xyz"};
		Assert.assertEquals(lexicographical(s), 2);
	}
	
	@Test
	public void testCase2()
	{
		String[] s = {"bc","fg","yz"};
		Assert.assertEquals(lexicographical(s), 2);
	}

	
	@Test
	public void testCase3()
	{
		String[] s = {"abcd","efgh","wxyz","pqrs"};
		Assert.assertEquals(lexicographical(s), 0);
	}


}
