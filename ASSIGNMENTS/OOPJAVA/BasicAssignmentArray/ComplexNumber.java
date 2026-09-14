public class ComplexNumber {

    private int number1;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int computeComplexNumber() {
        return number1 * number2;
    }

    public static void main(String[] args) {

        ComplexNumber[] arr = new ComplexNumber[3];

        for(int i = 0; i < arr.length; i++) {

            arr[i] = new ComplexNumber();

            System.out.println("Enter Number 1 :");
            arr[i].setNumber1(ConsoleInput.getInt());

            System.out.println("Enter Number 2 :");
            arr[i].setNumber2(ConsoleInput.getInt());
        }

        System.out.println("Results");

        for(int i = 0; i < arr.length; i++) {

            int result = arr[i].computeComplexNumber();

            System.out.print(result+" ");
        }
    }
}