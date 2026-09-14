public class Complex {

    int real;
    int imag;

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public void display() {
        System.out.println("Complex Number : "
                           + real + " + " + imag + "i");
    }

    public void sum(Complex c2) {

        int r = real + c2.real;
        int i = imag + c2.imag;

        System.out.println("Sum = " + r + " + " + i + "i");
    }

    public void sub(Complex c2) {

        int r = real - c2.real;
        int i = imag - c2.imag;

        System.out.println("Difference = " + r + " + " + i + "i");
    }

    public void mul(Complex c2) {

        int r = (real * c2.real) - (imag * c2.imag);
        int i = (real * c2.imag) + (imag * c2.real);

        System.out.println("Product = " + r + " + " + i + "i");
    }

    public static void main(String[] args) {

        Complex c1 = new Complex();

        System.out.println("Enter real part =");
        c1.setReal(ConsoleInput.getInt());

        System.out.println("Enter imaginary part =");
        c1.setImag(ConsoleInput.getInt());

        Complex c2 = new Complex();

        System.out.println("Enter real part =");
        c2.setReal(ConsoleInput.getInt());

        System.out.println("Enter imaginary part =");
        c2.setImag(ConsoleInput.getInt());

        c1.sum(c2);
        c1.sub(c2);
        c1.mul(c2);
    }
}