public class Main {
    public static void main(String[] args) {
        /*BinaryConverter binaryConverter = new BinaryConverter();
        String myVar = binaryConverter.convertToBinary(23);
        System.out.println(myVar);
        String myStringVar = binaryConverter.convertToBinary("Hello");
        System.out.println(myStringVar);
        System.out.println(binaryConverter.fromBinaryToInt("0111"));
        System.out.println((int) Math.pow(8,1));*/
        System.out.println("*".repeat(15));
        OctalConverter octalConverter = new OctalConverter();
        //octalConverter.printOctalNumber(5);
        octalConverter.convertOctalToInt("511");


        octalConverter.convertBinaryToOctal("011011");

    }

    // TODO: 19/02/2023 HesadecimalConverter. From Hex to decimal and binary and viceversa. 
}
