import java.util.*;
class Q3
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();

String s = str.trim();
int count=0;
for(int i = 0;i<s.length();i++)
{
	
	if(s.charAt(i)!=' ')
	{
		count++;
	}
	
	else 
	{
		count=0;
	}
}
System.out.println(count);
}
}