import java.util.Scanner;

public class EvenNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");

		int num =sc.nextInt();
		
		for(int i=1;i<=num;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}