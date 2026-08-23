import java.util.Scanner;

public class OddNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num=sc.nextInt();
		int ans=0;
		
		for(int i=1;i<=num;i++){
			if(i%2==1){
				ans=ans+i;
			}
		}
		System.out.println(ans);
	}
}