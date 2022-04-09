import java.io.*;
public class Student {
 String rollNo,name,branch,collegeName;
 int year;
 float marks_per;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public  void getData()throws Exception
 {
	 System.out.println("Enter the rollNo,name,branch,college,year,marks_per");
	 rollNo=br.readLine();
	 name=br.readLine();
	 branch=br.readLine();
	 collegeName=br.readLine();
	 year=Integer.parseInt(br.readLine());
	 marks_per=Float.parseFloat(br.readLine());
 }
 public void Display()
 {
	 System.out.println("Student details are:-");
	 System.out.println("RollNo: "+rollNo);
	 System.out.println("Name: "+name);
	 System.out.println("Branch: "+branch);
	 System.out.println("CollegeName:"+collegeName);
	 System.out.println("Year"+year);
	 System.out.println("Marks%: "+marks_per+"%");
	
 }
 public static void main(String args[])throws Exception
 {
	Student s1= new Student();
	s1.getData();
	s1.Display();
	Student s2= new Student();
	s2.getData();
	s2.Display();
 }
 
 
}
