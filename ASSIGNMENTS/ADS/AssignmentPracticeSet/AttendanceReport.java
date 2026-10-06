
public class AttendanceReport {

    static int countPresent(int[] att) {
        int count = 0;

        for (int i = 0; i < att.length; i++) {
            if (att[i] == 1) {
                count++;
            }
        }

        return count;
    }

    static double percentage(int present, int total) {
        return (present * 100.0) / total;
    }

    static void longestStreak(int[] att, int value) {
        int current = 0;
        int best = 0;
        int bestEnd = -1;

        for (int i = 0; i < att.length; i++) {
            if (att[i] == value) {
                current++;

                if (current > best) {
                    best = current;
                    bestEnd = i;
                }
            } else {
                current = 0;
            }
        }

        if (best == 0) {
            System.out.println("Longest streak: 0 days");
        } else {
            int startDay = bestEnd - best + 2;
            int endDay = bestEnd + 1;

            if (value == 1) {
                System.out.println("Longest presence: " + best
                        + " days (day " + startDay
                        + " to day " + endDay + ")");
            } else {
                System.out.println("Longest absence: " + best
                        + " days (day " + startDay
                        + " to day " + endDay + ")");
            }
        }
    }

    static int daysNeeded(int present, int total) {
        int extraDays = 0;

        while ((present * 100.0) / total < 75) {
            present++;
            total++;
            extraDays++;
        }

        return extraDays;
    }

    public static void main(String[] args) {
        int[] att = {
            1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0
        };

        int total = att.length;
        int present = countPresent(att);
        double percent = percentage(present, total);

        System.out.println("Days present       : " + present
                + " of " + total);

        System.out.println("Attendance         : "
                + String.format("%.2f", percent) + " %");

        if (percent >= 75) {
            System.out.println("Eligible           : YES");
        } else {
            System.out.println("Eligible           : NO");
        }

        longestStreak(att, 1);
        longestStreak(att, 0);

        if (percent < 75) {
            System.out.println("Days needed for 75%: "
                    + daysNeeded(present, total));
        } else {
            System.out.println("Days needed for 75%: 0");
        }
    }
}
