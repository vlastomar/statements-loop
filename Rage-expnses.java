import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGame = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double sumLost = 0.00;

        for (int i = 1; i <=lostGame ; i++) {
            if (i % 2 == 0){
                sumLost += headsetPrice;
            }
            if (i % 3 == 0){
                sumLost += mousePrice;
            }
            if (i % 6 == 0){
                sumLost += keyboardPrice;
            }
            if (i % 12 == 0){
                sumLost += displayPrice;
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", sumLost);

    }
}
