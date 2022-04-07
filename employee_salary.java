
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class employee_salary {
public static void main(String args[])throws Exception {
	InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader b= new BufferedReader(isr);
   int x[],n,max=0,min=999999,sum=0,c=0;
   double avg;
   System.out.println("Enter no.of Employees");
   n=Integer.parseInt(b.readLine());
   x=new int[n];
   System.out.println("Enter Salaries of "+n+" Employees");
   for(int i=0;i<n;i++) {
	   x[i]=Integer.parseInt(b.readLine());
      if(max<x[i]) max=x[i];
      if(min>x[i]) min=x[i];
      sum+=x[i];
   }   
   avg=sum/n;
   System.out.println("maximum salary = "+max+"\n"+"minimum salary = "+min);
   System.out.println("average salary = "+avg);
   System.out.print("unique salary are \n");
   for(int j=0;j<n;j++)
   {  c=0;
   if(x[j]!=-1) 
   	{
	 for(int i=j+1;i<n;i++)
	 	{ if(x[j]==x[i]&&j!=i)
			   { c++;   
			     x[i]=-1;
			     break;
			    }
		 }
	   if(c<1) { System.out.print(x[j]+"  ");}
	 }
   }
}}

