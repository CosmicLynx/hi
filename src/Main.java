public class Main {
    public static void main(String[] args) {
        /*
         * System.out.println("Hello aaa"); String name = "Lynx"; System.out.println(name); int age
         * = 22; System.out.println(age); double heightInMeters = 1.69;
         * System.out.println(heightInMeters); boolean isStudent = true;
         * System.out.println(isStudent);
         * 
         * int a = 8; int b = 3; int sum = a + b; System.out.println("Summe: " + sum); int diff = a
         * - b; System.out.println(diff); int multi = a * b; System.out.println(multi); int div = a
         * / b; System.out.println(div); int mod = a % b; System.out.println(mod);
         * 
         * boolean equals = a == b; System.out.println(equals); boolean greater = a > b;
         * System.out.println(greater); boolean less = a < b; System.out.println(less);
         * 
         * double c = 1.32; double d = 4.04;
         * 
         * double sum2 = c + d; System.out.println(sum2); double diff2 = c - d;
         * System.out.println(diff2); double mul2 = c * d; System.out.println(mul2); double div2 = c
         * / d; System.out.println(div2); double mod2 = c % d; System.out.println(mod2);
         * 
         * boolean equals2 = c == d; System.out.println(equals2); boolean greater2 = c > d;
         * System.out.println(greater2); boolean less2 = c < d; System.out.println(less2);
         * 
         * String hello = "Hello"; String world = "World"; System.out.println(hello.equals(world));
         * System.out.println(hello.compareTo(world));
         */

        /*
         * int age = 22;
         * 
         * if (age > 18) { System.out.println("You are older than 18"); }
         * 
         * String name = "Lynx";
         * 
         * if (name.length() > 10) { System.out.println("Your name is too long"); }
         * 
         * int grade = 91;
         * 
         * if (grade > 90) { System.out.println("Note A"); } else if (grade > 70) {
         * System.out.println("Note B"); } else if (grade > 50) { System.out.println("Note C"); }
         * else if (grade > 20){ System.out.println("Note D"); } else {
         * System.out.println("Note f"); }
         * 
         * int x = -81; if (x > 0) { System.out.println("x ist positiv"); } else {
         * System.out.println("x ist negativ"); }
         */

        /*
         * greeting("Lynx"); System.out.println(add(5, 8)); System.out.println(doubleAdd(4.24,
         * 75.32)); System.out.println(substract(7,2)); System.out.println(makePositive(9));
         */

        int a = 5;
        int b = 2;

        if (a > b) {
            System.out.println(substract(a, b));
        } else {
            System.out.println(add(a, b));
        }

        System.out.println(evenNumber(a));

        String string = "Anna";
        System.out.println(isPalindrome(string));
    }

    public static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double doubleAdd(double a, double b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int makePositive(int a) {
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }

    public static int evenNumber(int a) {
        if (a % 2 == 0) {
            return a;
        } else {
            return a * 2;
        }
    }

    public static boolean isPalindrome(String a) {
        return a.toLowerCase().contentEquals(new StringBuilder(a.toLowerCase()).reverse());
    }
}
