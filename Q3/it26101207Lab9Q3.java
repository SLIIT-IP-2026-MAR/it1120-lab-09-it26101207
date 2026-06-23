public class it26101207Lab9Q3 {

    
    public static int add(int a, int b) {
        return a + b;
    }

   
    public static int multiply(int a, int b) {
        return a * b;
    }


    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        // Expression i: (3 * 4 + 5 * 7)^2
        int exp1 = square(
                        add(
                            multiply(3, 4),
                            multiply(5, 7)
                        )
                    );

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int exp2 = add(
                        square(add(4, 7)),
                        square(add(8, 3))
                    );

        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + exp1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + exp2);
    }
}
