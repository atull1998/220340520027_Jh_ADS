import java.util.*;
public class main
{
 int []arr;
 int size;
 int top1,top2;
 main(int n)
 {
 size =n;
 arr = new int [n];
 top1 =n/2+1;
 top2 =n/2;
 
 }
 void push(int x)
 {
 
 if (top1>0)
 {
 top1--;
 arr[top1]=x;
 
 }
 else
 {
 System.out.println("Stack Overflow"+"By element :"+x+"\n");
 
 return;
 
 }

}

void push2(int x)
{
if (top2<size - 1)
{
top2++;
arr[top2]=x;

}
else
{
System.out.println("Stack Overflow"+"By element :"+x+"\n");
return;
}
}
int pop1()
{
if (top1 >= size /2)
{
int x =arr [top1];
top1++;
return x; 

}
else 
{
System.out.println("Stack Overflow");
System.exit(1);
}
return 0;
}

int pop2()
{
if (top2>=size /2 +1 )
{
int x = arr [top2];
top2--;
return x;

}
else 
{
System.out.println("Stack UnderFlow");
 System.exit(1);
 
}
return 1;

}



public static void main (String args[])
{
 main ts= new main(10);
 ts.push(5);
 ts.push(10);
 ts.push(15);
 ts.push(11);
 ts.push(7);
 ts.push(40);
 
 
 System.out.println("Popped element from stack1 is"+ts.pop1()+"\n");
  System.out.println("Popped element from stack2 is"+ts.pop2()+"\n");
  
  }
}
