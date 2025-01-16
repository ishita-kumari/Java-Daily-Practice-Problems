import java.util.Scanner;

public class numberToWord {

    // Arrays to store number words for basic units, tens, and hundreds
    private static final String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
        "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] thousands = {
        "", "Thousand", "Million", "Billion"
    };

    public static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String words = "";
        int i = 0; 
        
        while (num > 0) {
            if (num % 1000 != 0) {
                words = convertHundreds(num % 1000) + thousands[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();  
    }

    private static String convertHundreds(int num) {
        String words = "";
        if (num >= 100) {
            words += ones[num / 100] + " Hundred ";
            num %= 100;
        }
        if (num >= 20) {
            words += tens[num / 10] + " ";
            num %= 10;
        }
        if (num > 0) {
            words += ones[num] + " ";
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String result = convertToWords(num);
        System.out.println("Number in words: " + result);
        scanner.close();
    }
}
