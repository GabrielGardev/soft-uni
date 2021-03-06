import java.util.Scanner;

public class P2_Name_of_the_Last_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String letter = ConvertToLetter(number);

        System.out.println(letter);
    }

     static String ConvertToLetter(int number)
    {
        number = number % 10;
        String toWord = "";

        switch (number)
        {
            case 0: toWord = "zero"; break;
            case 1: toWord = "one"; break;
            case 2: toWord = "two"; break;
            case 3: toWord = "three"; break;
            case 4: toWord = "four"; break;
            case 5: toWord = "five"; break;
            case 6: toWord = "six"; break;
            case 7: toWord = "seven"; break;
            case 8: toWord = "eight"; break;
            case 9: toWord = "nine"; break;
        }

        return toWord;

    }
}
