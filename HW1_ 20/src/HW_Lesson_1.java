import java.util.Arrays;
import java.util.Scanner;

public class HW_Lesson_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng tăng dần
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(array));

        // Sắp xếp mảng giảm dần
        int[] arrayDesc = new int[n];
        for (int i = 0; i < n; i++) {
            arrayDesc[i] = array[n - i - 1];
        }
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + Arrays.toString(arrayDesc));
    }
}
