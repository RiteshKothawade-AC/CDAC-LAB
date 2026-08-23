import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		int ans =1;
		
		while(num>=1){
			ans = ans*num;
			num--;
		}
		System.out.println(ans);
	}
}