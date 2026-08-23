import java.util.Scanner;
public class DivisiblebyThree{
    static void DivbyThree(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number :");
    int num =sc.nextInt();
    for(int i=1;i<=num;i++){
        if(i%3==0){
            System.out.println(i);
        }
    }
}
    public static void main(String[]args){
        DivisiblebyThree.DivbyThree();
    }


}