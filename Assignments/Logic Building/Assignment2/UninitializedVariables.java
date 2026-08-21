class UninitializedVariables {
    public static void main(String[] args) {
        byte a = 1;
        short b = 1;
        int c = 3;
        long d = 1L;
        float e = 2.1f;
        double f = 1.1;
        char g = 'n';
        boolean h = false;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}