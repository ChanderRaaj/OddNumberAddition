import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Value: ");
        int value = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= value ; i++) {
            System.out.println(i*2-1);
            sum = sum + (i*2-1);
        }
        System.out.println("sum of all numbers is : " + sum);
    }
}