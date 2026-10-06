import java.util.ArrayList;
import java.util.Scanner;

public class StudentQueue
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> queue = new ArrayList<>();

        int choice;

        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Student");
            System.out.println("2. Submit Assignment");
            System.out.println("3. Search Student");
            System.out.println("4. Display Queue");
            System.out.println("5. Count Students");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    queue.add(id);

                    System.out.println("Student Added");
                    break;

                case 2:

                    if(queue.isEmpty())
                    {
                        System.out.println("Queue Empty");
                    }
                    else
                    {
                        int removed = queue.remove(0);

                        System.out.println(
                            "Student " + removed +
                            " submitted assignment");
                    }
                    break;

                case 3:

                    System.out.print(
                        "Enter Student ID to search: ");

                    int searchId = sc.nextInt();

                    if(queue.contains(searchId))
                    {
                        System.out.println(
                            "Student is waiting");
                    }
                    else
                    {
                        System.out.println(
                            "Student not found");
                    }
                    break;

                case 4:

                    if(queue.isEmpty())
                    {
                        System.out.println("Queue Empty");
                    }
                    else
                    {
                        System.out.println(queue);
                    }

                    break;

                case 5:

                    System.out.println(
                        "Total Students = "
                        + queue.size());

                    break;

                case 6:

                    System.out.println(
                        "Program Ended");

                    break;

                default:

                    System.out.println(
                        "Invalid Choice");
            }

        } while(choice != 6);
    }
}