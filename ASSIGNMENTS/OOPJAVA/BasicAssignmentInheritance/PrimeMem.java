class Member {

	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber2) {
		this.phoneNumber = phoneNumber2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println("Salary: " + salary);
	}
}


class PrimeMember extends Member {

	private int joiningYear;
	private double joiningFees;
	private boolean isActive;

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public double getJoiningFees() {
		return joiningFees;
	}

	public void setJoiningFees(double joiningFees) {
		this.joiningFees = joiningFees;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void display() {

		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Phone Number: " + getPhoneNumber());
		System.out.println("Address: " + getAddress());
		System.out.println("Salary: " + getSalary());
		System.out.println("Joining Year: " + joiningYear);
		System.out.println("Joining Fees: " + joiningFees);
		System.out.println("Is Active: " + isActive);
	}
}


public class PrimeMem {

	public static void main(String[] args) {

		PrimeMember primeMemberObj = new PrimeMember();

		System.out.println("Enter Name:");
		String name = ConsoleInput.getString();

		System.out.println("Enter Age:");
		int age = ConsoleInput.getInt();

		System.out.println("Enter Phone Number:");
		String phoneNumber = ConsoleInput.getString();

		System.out.println("Enter Address:");
		String address = ConsoleInput.getString();

		System.out.println("Enter Salary:");
		double salary = ConsoleInput.getFloat();

		System.out.println("Enter Joining Year:");
		int joiningYear = ConsoleInput.getInt();

		System.out.println("Enter Joining Fees:");
		double joiningFees = ConsoleInput.getFloat();
		boolean isActive = true;

		primeMemberObj.setName(name);
		primeMemberObj.setAge(age);
		primeMemberObj.setPhoneNumber(phoneNumber);
		primeMemberObj.setAddress(address);
		primeMemberObj.setSalary(salary);

		primeMemberObj.setJoiningYear(joiningYear);
		primeMemberObj.setJoiningFees(joiningFees);
		primeMemberObj.setIsActive(isActive);

		primeMemberObj.display();

		primeMemberObj.printSalary();
	}
}