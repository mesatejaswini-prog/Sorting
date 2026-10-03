import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted array in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}
OUTPUT:
Enter the number of elements: 5
Enter 5 numbers:
45
12
78
23
9
Sorted array in ascending order:
9 12 23 45 78

