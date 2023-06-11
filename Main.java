import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту здания: ");
        int h = scanner.nextInt();

        System.out.print("Введите количество этажей, на которое лифт поднимается: ");
        int n = scanner.nextInt();

        System.out.print("Введите количество этажей, на которое лифт спускается: ");
        int m = scanner.nextInt();

        int count = 0;
        int currentFloor = 0;

        while (currentFloor < h) {
            currentFloor += n;
            count++;

            if (currentFloor >= h) {
                break;
            }

            currentFloor -= m;
        }

        System.out.println("Количество подъемов, которые понадобятся лифту: " + count);

        scanner.close();
    }
}
