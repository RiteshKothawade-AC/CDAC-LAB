import java.time.LocalDate;
import java.util.function.Supplier;

public class CurrentDate
{
    public static void main(String[] args)
    {
        Supplier<LocalDate> currentDate =
                () -> LocalDate.now();

        System.out.println("Current Date = "
                + currentDate.get());
    }
}