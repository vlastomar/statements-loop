import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scan.nextLine());
        int offset = 0;

        for (int i = 1; i <= inputNumber ; i++) { 
            String number = scan.nextLine();
            int numberDigits =  number.length();
            int mainDigit = Integer.parseInt(String.valueOf(number.charAt(0)));
            if (mainDigit == 8 || mainDigit == 9){
                offset = (mainDigit - 2) * 3 + 1;
            }else {
                offset = (mainDigit - 2) * 3;
            }
            char letter = (char)(97 + (offset + number.length() - 1));
            if ("0".equals(number)){
                letter = (char)32;
            }
            System.out.print(letter);
        }
    }
}
