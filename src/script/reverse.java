package script;

import org.testng.annotations.Test;

public class reverse 
{
@Test
public void rev()
{
	String n="anu";
	String rev=" ";
	for(int i=n.length()-1;i>=0;i--)
	{
		rev =rev+n.charAt(i);
}
System.out.println(rev);
}
}
