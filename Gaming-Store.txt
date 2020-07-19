import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double ballance = Double.parseDouble(scan.nextLine());

        double moneyRemain = ballance;

        while (true){
            String game = scan.nextLine();
            if ("Game Time".equals(game)){
                break;
            }
            switch (game){
                case "OutFall 4":
                    moneyRemain -= 39.99;
                    if (moneyRemain < 0){
                        System.out.println("Too Expensive");
                        moneyRemain += 39.99;
                    }else{
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "CS: OG" :
                    moneyRemain -= 15.99;
                    if (moneyRemain < 0){
                        System.out.println("Too Expensive");
                        moneyRemain += 15.99;
                    }else{
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "Zplinter Zell":
                    moneyRemain -= 19.99;
                    if (moneyRemain < 0){
                        System.out.println("Too Expensive");
                        moneyRemain += 19.99;
                    }else{
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "Honored 2":
                    moneyRemain -= 59.99;
                    if (moneyRemain < 0){
                        System.out.println("Too Expensive");
                        moneyRemain += 59.99;
                    }else{
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "RoverWatch" :
                    moneyRemain -= 29.99;
                    if (moneyRemain < 0){
                        System.out.println("Too Expensive");
                        moneyRemain += 29.99;
                    }else{
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                case "RoverWatch Origins Edition" :
                    moneyRemain -= 39.99;
                    if (moneyRemain < 0){
                        System.out.println("Too Expensive");
                        moneyRemain += 39.99;
                    }else{
                        System.out.printf("Bought %s%n", game);
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }
            if (moneyRemain == 0){
                System.out.println("Out of money!");
                break;
            }
        }
        if (moneyRemain > 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", ballance - moneyRemain, moneyRemain);
        }
    }
}
