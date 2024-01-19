import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите свое слово/предложение:");
        String word = scanner.nextLine();
        String processedString = processString(word);
        if (isPalindrome(processedString)) {
            System.out.println("вы ввели слово палиндром");
        }
        else {
            System.out.println("NO");
        }
    }

    private static String processString(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase();//часть отвечающяя за за удаление пробелов и введение в нижний регистр

    }
    private static boolean isPalindrome(String letter){
        int length = letter.length();
        for (int i = 0; i < length /2; i++) { //делит введенное слово
            if (letter.charAt(i) != letter.charAt(length - 1 -i)){
                return false;
            }

        }
        return true;
    }

}