public class BinaryConverter {

    public  String convertToBinary(int userInput){
        String binaryResult = "";
        while (userInput >0 ){
            if(userInput%2 == 0){
                binaryResult += "0";
            }else {
                binaryResult+= "1";
            }
            userInput = userInput/2;
        }
        char[] binaryResultArray = binaryResult.toCharArray();
        String reversedBinary = "";
        for (int i = binaryResult.length()-1; i > 0-1; i--){
            char x = binaryResultArray[i];

            reversedBinary += x;
        }
        return reversedBinary;
    }
    public String convertToBinary(String text){
        String binaryResult = "";
        char[] textArray = text.toCharArray();
        for (int i = 0; i<text.length(); i++){
            int asciiValue = (int) textArray[i];
            binaryResult += convertToBinary(asciiValue);
            binaryResult += " ";
        }
        String reversedBinary = "";
        char[] binaryResultArray = binaryResult.toCharArray();
        for (int i = text.length()-1; i > -1; i--){
            char x = binaryResultArray[i];
            reversedBinary += x;
        }
        return reversedBinary;
    }

    public int fromBinaryToInt(String binaryCode){
        System.out.println("Convert Binary to Int");
        int result = 0;
        int powerOfTwo = 0;
        char[] binaryArray = binaryCode.toCharArray();

        for (int i = binaryArray.length-1; i>0-1; i--){
            if (binaryArray[i] == '0'){
                result += 0;
            } else if (binaryArray[i] == '1') {
                result += Math.pow(2,powerOfTwo);
            }else {
                System.out.println("invalid input. Only 0 and 1 are accepted.");
                return -1;
            }
            powerOfTwo++;
        }
        return result;
    }

}
