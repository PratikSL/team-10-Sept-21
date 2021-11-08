import java.util.*;
class Q1
{
void Search(int arr[],int max,int k,int n)
{
int count=0;
for(int i=k;i<n;i++)
{
	
if(max<arr[i])
{
	
count ++;
}
}
System.out.println(count);

}




public static void main(String args[])
{
	Arra a = new Arra();
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();

int[] arr = new int[n];

for(int i = 0;i<n;i++)
{
arr[i] = scan.nextInt();
}
int min = arr[0];

for(int i =0;i<n;i++)
{
if(min>arr[i])
{

a.Search(arr,arr[i-2],(i-1),n);
break;
}
else
{
min = arr[i];
}
}

}


}