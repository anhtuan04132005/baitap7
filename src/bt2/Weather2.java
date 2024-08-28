import java.util.Scanner;

public class Weather2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("how many day?");

        int days = console.nextInt();

        int[] temps = new int[days];
        int sum = 0;

        for (int i = 0; i < days; i++) {
            System.out.println("day" + (i + 1) + "a hight temp");
            temps[i] = console.nextInt();
            sum += temps[i];
        }

    }

}
