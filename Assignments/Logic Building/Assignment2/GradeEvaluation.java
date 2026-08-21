class GradeEvaluation {
    public static void main(String[] args) {
        int math = 70;
        int sci = 88;
        int hist = 95;

        int avg = (math + sci + hist) / 3;

        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 70 && avg <= 89) {
            System.out.println("Grade: B");
        } else if (avg >= 50 && avg <= 69) {
            System.out.println("Grade: C");
        } else if (avg >= 30 && avg <= 49) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }
}