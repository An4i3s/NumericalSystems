import java.security.InvalidParameterException;
import java.util.Arrays;

public class OctalConverter {

    public void printOctalNumber(int maxPower) {
        System.out.println("List of Octal numbers till power of " + maxPower);
        for (int i = 0; i <= maxPower; i++) {
            //int x = Math.pow(8,1)
            System.out.println((int) Math.pow(8, i));
        }
    }

    public void convertOctalToInt(String octalString) {//15
        try {
            if ((octalString.contains("8")) || (octalString.contains("9"))) {
                throw new InvalidParameterException();
            } else {
                int octalNumb = Integer.parseInt(octalString);
                int result = 0;
                int basePower = 0;

                int octalVar = octalNumb;

                while (octalVar > 0) {
                    int digit = octalVar % 10;//0//1
                    result += Math.pow(8, basePower) * digit;//(8*0)*0

                    octalVar = octalVar / 10;//1
                    basePower++;
                }
                System.out.println(octalNumb + " converted to decimal is " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. No 8 and 9 allowed");
        }
    }

    // TODO: 24/02/2023 what if the binary number is a 16.bits numb?
    // TODO: 24/02/2023 implemnt convert BinarytoOctal --> divide the bits into groups of three;
    // TODO: 24/02/2023 --> convert the group of 3 bits to octal

    // TODO: 24/02/2023 accept only 0 and 1

    public void convertBinaryToOctal(String binaryString) {
        int bnum = Integer.parseInt(binaryString, 2);
        String ostr = Integer.toOctalString(bnum);
        System.out.println("Octal Value after conversion is: "+ostr);
    }
}