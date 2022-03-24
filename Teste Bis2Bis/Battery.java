import java.util.Scanner;

public class Battery {
    public static void main(String[] args) {

        int tam = 0;
        Scanner scanner = new Scanner(System.in);
        tam = scanner.nextInt();
        int[] eventos = new int[tam];
        eventos[0] = 50;
        int total = eventos[0];
        int i = 1;
        while (total <= 100) {
            if (i <= tam) {
                for (int j = 0; j < tam; j++)
                    System.out.println("bateria: " + eventos[j]);
                System.out.println("Bota o numero da bateria: ");
                eventos[i] = scanner.nextInt();
                total += eventos[i];
                System.out.println(total);
                i++;
            }
        }
    }
}
