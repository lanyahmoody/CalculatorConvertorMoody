import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class ProgrammerConvertor {
    public static int convertHex2Decimal(String hexNum){
        return Integer.parseInt(hexNum,16);
    }

    //Convert Decimal to Hex, Octal, and Binary
    public static int convertDecimal2Hex(String decNum){
        return Integer.parseInt(decNum,10);
    }
    public static int convertDecimal2Octal(String decNum1){
        return Integer.parseInt(decNum1,8);
    }
    public static String convertDecimal2Binary(int decNum2){
        return Integer.toBinaryString(decNum2);
    }

    //Convert Octal to Hex, Decimal, and Binary
    public static int convertOctal2Hex(String octNum){
        return Integer.parseInt(octNum,16);
    }
    public static int convertOctal2Decimal(String octNum1){
        return Integer.parseInt(octNum1,8);
    }
    public static String convertOctal2Binary(int octNum2){
        return Integer.toBinaryString(octNum2);
    }
    //Convert Binary to Hex,Decimal, and Octal
    public static int convertBinary2Hex(String binNum){
        return Integer.parseInt(binNum,16);
    }
    public static int convertBinary2Decimal(String binNum1){
        return Integer.parseInt(binNum1,10);
    }
    public static int convertBinary2Octal(String binNum2){
        return Integer.parseInt(binNum2,8);
    }

}
