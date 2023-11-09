import java.util.Scanner;

public class NestedLoop_2341760070  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] temps = new int[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            int total = 0;
            for (int temp : temps[i]) {
                System.out.print(temp + " ");
                total += temp;
            }
            double Ratarata;
            Ratarata = total/ temps[i].length;
            System.out.println("\nRata rata: " +Ratarata);
        }
    }
}