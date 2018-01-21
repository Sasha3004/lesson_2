import java.util.Scanner;

public class korny {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int x;
        int x2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите а");
        a = scan.nextInt();
        System.out.println("Введите b");
        b = scan.nextInt();
        System.out.println("Введите c");
        c = scan.nextInt();
        d = discriminant(a, b, c);
        if (discriminant(a, b, c) < 0) {
            System.out.println("Дискриминант отрицательный");
        }
        if (discriminant(a, b, c) == 0) {
            x = (-b) / 2 * a;
            System.out.println("Дискриминант равен 0" + "x=" + x);

        }
        if (discriminant(a, b, c) > 0) {
            d = (int) Math.sqrt(discriminant(a, b, c));
            x = (((-b) + d) / 2 * a);
            System.out.println("При сложении" + "x1=" + x);
            x2 = (((-b) + d) / 2 * a);
            System.out.println("При вычитании" + "x2=" + x2);
        }
    }

    private static void isZero(int d) {
        if (d == 0) {
            String s = "число отрицательное";
        }
    }

    private static int discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    private static void isPositiv(int d) {
        if (d > 0) {
            String s = "число положительное";
        }
    }


}
