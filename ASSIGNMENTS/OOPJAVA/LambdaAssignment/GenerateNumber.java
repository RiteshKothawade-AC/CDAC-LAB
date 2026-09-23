import java.util.Random;
import java.util.function.Supplier;

public class GenerateNumber
{
    public static void main(String[] args)
    {
        // predefined for No input but return output 
        Supplier<Integer> randomNumber =
                () -> new Random().nextInt(900) + 100;

        System.out.println("Random Number = " + randomNumber.get());
    }
}