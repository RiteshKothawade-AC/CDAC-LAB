
public class Student {
	int roll_no;
	String name;
	String phone_no;
	String address;	

public static void main(String []args)
{
	Student objStudent= new Student();
	objStudent.roll_no=2;
	objStudent.name="John";
	objStudent.phone_no="7865784583";
	objStudent.address="PQR";
	
	Student objStudent1= new Student();
	objStudent1.roll_no=1;
	objStudent1.name="Sam";
	objStudent1.phone_no="9865784583";
	objStudent1.address="ABC";
	
	System.out.println("Student 1");
	System.out.println("Name :"+ objStudent.name);
	System.out.println("Roll_No:"+ objStudent.roll_no);
	System.out.println("Phone_no :"+ objStudent.phone_no);
	System.out.println("Address :"+ objStudent.address);
	
}	
}
