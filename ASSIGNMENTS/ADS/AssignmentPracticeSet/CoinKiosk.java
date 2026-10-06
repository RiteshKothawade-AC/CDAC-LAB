
public class CoinKiosk {
    static long calls = 0;

    static void printWays(int amount, String coinsSoFar) {
        if (amount == 0) {
            System.out.println(coinsSoFar);
            return;
        }

        if (amount >= 1)
            printWays(amount - 1, coinsSoFar + "1 ");

        if (amount >= 2)
            printWays(amount - 2, coinsSoFar + "2 ");
    }

    static long countWays(int amount) {
        calls++;

        if (amount == 0)
            return 1;
        if (amount == 1)
            return 1;

        return countWays(amount - 1) + countWays(amount - 2);
    }

    public static void main(String[] args) {
        System.out.println("Coin combinations for amount 4:");
        printWays(4, "");

        calls = 0;
        System.out.println("Total ways for 4: " + countWays(4));

        calls = 0;
        System.out.println("Total ways for 5: " + countWays(5));

        calls = 0;
        System.out.println("Total ways for 10: " + countWays(10));

        System.out.println("Calls for amount 10: " + calls);
    }
}
