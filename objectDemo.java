import java.io.BufferedReader;
import java.io.InputStreamReader;
public class objectDemo  {
 String Empid,Name,Department,Organization,ug,pg;
 float Salary;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public  void getPersonal()throws Exception
 {
	 System.out.println("Enter the Empid,Name,Department,Salary,Organization");
	 Empid=br.readLine();
	 Name=br.readLine();
	 Department=br.readLine();
	 Salary=Float.parseFloat(br.readLine());
	 Organization=br.readLine();
	
 }
public  void getQualification()throws Exception
{
	System.out.println("Enter the Education  Qualification in UG & PG");
	 ug=br.readLine();
	 pg=br.readLine();
	
}
public void DisplayQualification()
{
	 System.out.println("Education Qualification");
	 System.out.println("UG: "+ug);
	 System.out.println("PG: "+pg);
}
 public void DisplayPersonal()
 {
	 System.out.println("Personal Information");
	 System.out.println("Empid: "+Empid);
	 System.out.println("Name: "+Name);
	 System.out.println("Department: "+Department);
	 System.out.println("Salary: "+Salary);
	 System.out.println("Organization: "+Organization);
 }
 public static void main(String args[])throws Exception
 {
objectDemo s1= new objectDemo();
	s1.getPersonal();
	s1.getQualification();
	s1.DisplayPersonal();
	s1.DisplayQualification();
 }
}

