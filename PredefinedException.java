import java.util.Scanner;

public class PredefinedException {

    public static void main(String args[]) {

        try {
            int[] arr = {1, 2, 3, 4};

            int i, b;

            Scanner sc = new Scanner(System.in);

            i = sc.nextInt();
            b = sc.nextInt();

            System.out.println(arr[i]);
            System.out.println(arr[i] / b);

            sc.close();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}