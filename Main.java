import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Print Hexadecimal to Decimal
        System.out.println("Enter the hexadecimal number:");
        String hexNum = scanner.next();
        System.out.println("the value of the decimal is " + ProgrammerConvertor.convertHex2Decimal(hexNum));


        //Print Decimal to Hex, Octal, and Binary
        System.out.println("Enter decimal:");
        String decimalNum = scanner.next();
        System.out.println("the hexadecimal value is " + ProgrammerConvertor.convertDecimal2Hex(decimalNum));

        System.out.println("Enter decimal:");
        String decimalNum1 = scanner.next();
        System.out.println("the octal value is " + ProgrammerConvertor.convertDecimal2Octal(decimalNum1));

        System.out.println("Enter decimal:");
        int decimalNum2 = scanner.nextInt();
        System.out.println("the Binary value is " + ProgrammerConvertor.convertDecimal2Binary(decimalNum2));

        //Print Octal to Hex, Decimal, and Binary
        System.out.println("Enter octal:");
        String octNum = scanner.next();
        System.out.println("the value of the hexadecimal is " + ProgrammerConvertor.convertOctal2Hex(octNum));

        System.out.println("Enter octal:");
        String octNum1 = scanner.next();
        System.out.println("the value of the decimal is " + ProgrammerConvertor.convertOctal2Decimal(octNum1));

        System.out.println("Enter octal number:");
        int octNum2 = scanner.nextInt();
        System.out.println("the Binary value is " + ProgrammerConvertor.convertOctal2Binary(octNum2));

        //Print Binary to Hex,Decimal, and Octal
        System.out.println("Enter binary:");
        String binNum = scanner.next();
        System.out.println("the value of the hexadecimal is " + ProgrammerConvertor.convertBinary2Hex(binNum));

        System.out.println("Enter binary:");
        String binNum1 = scanner.next();
        System.out.println("the value of the decimal is " + ProgrammerConvertor.convertBinary2Decimal(binNum1));

        System.out.println("Enter binary:");
        String binNum2 = scanner.next();
        System.out.println("the value of the octal is " + ProgrammerConvertor.convertBinary2Octal(binNum2));
    }
}

