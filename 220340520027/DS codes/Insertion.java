import java.util.Arrays;

public class Insertion
{
 public static void main (String args[])
 
 {
   int[] b1={1,2,4,5,3};
   int n=b1.length;
   System.out.println("Before Sort -"+Arrays.toString(b1));
   for (int i=n-1;i>=0;i--)
   {
   int key =b1[i];
   int j=i-1;
   int temp=0;
   
   while (j>=0 && b1[j]>=key)
   {
     temp=b1[j+1]=b1[j];
     b1[j]=b1[j+1];
     b1[j+1]=temp;
     j--;
	 
   }
   
   temp=b1[j+1];
   b1[j+1]=key;
   key=temp;
   System.out.println(Arrays.toString(b1)+" KEY :"+key);
   
   }
   System.out.println("After sort "+Arrays.toString(b1));  
 
 }

}