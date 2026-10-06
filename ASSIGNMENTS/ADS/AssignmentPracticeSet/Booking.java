public class Booking {
    private boolean[] booked;
    private int n;

    public Booking(int n) {
        this.n = n;
        booked = new boolean[n + 1];
    }

    static String berthType(int seatNo) {
        int r = seatNo % 8;
        if (r == 1 || r == 4)
            return "LB";
        else if (r == 2 || r == 5)
            return "MB";
        else if (r == 3 || r == 6)
            return "UB";
        else if (r == 7)
            return "SL";
        else
            return "SU";
    }

    public int book(String preferred) {
        preferred = preferred.toUpperCase();

        for (int s = 1; s <= n; s++) {
            if (!booked[s] && berthType(s).equals(preferred)) {
                booked[s] = true;
                return s;
            }
        }

        for (int s = 1; s <= n; s++) {
            if (!booked[s]) {
                booked[s] = true;
                return s;
            }
        }

        return -1;
    }

    public boolean cancel(int seatNo) {
        if (seatNo < 1 || seatNo > n || !booked[seatNo]) {
            System.out.println("Invalid cancellation");
            return false;
        }
        booked[seatNo] = false;
        System.out.println("Berth " + seatNo + " cancelled");
        return true;
    }

    public int available() {
        int count = 0;
        for (int s = 1; s <= n; s++) {
            if (!booked[s])
                count++;
        }
        return count;
    }

    public void printChart() {
        for (int s = 1; s <= n; s++) {
            System.out.print(s + ":" + berthType(s) + ":");
            if (booked[s])
                System.out.print("X ");
            else
                System.out.print("_ ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Booking coach = new Booking(16);
        coach.booked[1] = true;
        coach.booked[2] = true;
        coach.booked[4] = true;
        coach.booked[7] = true;

        int seat = coach.book("LB");
        System.out.println("book(\"LB\") -> Berth " + seat + " (" + berthType(seat) + ")");

        seat = coach.book("SL");
        System.out.println("book(\"SL\") -> Berth " + seat + " (" + berthType(seat) + ")");

        seat = coach.book("SL");
        if (seat == -1)
            System.out.println("Waiting List");
        else
            System.out.println("book(\"SL\") -> Berth " + seat + " (" + berthType(seat) + ")");

        coach.cancel(4);

        seat = coach.book("LB");
        System.out.println("book(\"LB\") -> Berth " + seat + " (" + berthType(seat) + ")");

        System.out.println("available() -> " + coach.available() + " berths free");
    }
}