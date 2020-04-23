package pl.banaszewski.lukasz;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);
        int lastDigit = 0;
        String output = "";

        for(int i = digitCount; i > 0; i--) {
            lastDigit = reversedNumber % 10;
            reversedNumber /= 10;

            if(reversedNumber >= 0) {
                switch(lastDigit) {
                    case 1:
                        output += "One ";
                        break;
                    case 2:
                        output += "Two ";
                        break;
                    case 3:
                        output += "Three ";
                        break;
                    case 4:
                        output += "Four ";
                        break;
                    case 5:
                        output += "Five ";
                        break;
                    case 6:
                        output += "Six ";
                        break;
                    case 7:
                        output += "Seven ";
                        break;
                    case 8:
                        output += "Eight ";
                        break;
                    case 9:
                        output += "Nine ";
                        break;
                    default:
                        output += "Zero ";
                        break;
                }
            } else {
                output += "Zero ";
            }
        }

        System.out.println(output.trim());
    }

    public static int reverse(int number) {

        int initNumber = number;

        if(initNumber < 0) {
            number -= number * 2;
        }

        int reverse = 0;
        int digitCount = getDigitCount(number);

        for (int i = digitCount; i > 0; i--) {
            int lastDigit = number % 10;
            number /= 10;
            reverse += ((int) (Math.pow(10, i - 1))) * lastDigit;
        }

        if(initNumber < 0) {
            return reverse - reverse * 2;
        } else {
            return reverse;
        }
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int digitCount = 0;

        do {
            number /= 10;
            digitCount++;
        } while (number > 0);

        return digitCount;
    }
}
