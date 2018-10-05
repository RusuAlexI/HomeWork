package exercise.testmorseencoder;

public class MorseEncoder {

    private String message;

    public MorseEncoder(String message) {
        this.message = message;
    }

    public static String encode(String message) {
        String encode = "";
        char[] messageToCharArray = message.toCharArray();
        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----"};

        for (int i = 0; i < messageToCharArray.length; i++) {
            for (int j = 0; j < english.length; j++) {
                if (messageToCharArray[i] == english[j]) {
                    encode += morse[j] + " ";
                }

            }
            if (messageToCharArray[i] == ' ') {
                encode += "   ";
            }
        }
        System.out.println(encode);
        return encode;
    }

    public static String decode(String message) {
        String decode = "";
        String[] stringArr = message.split("\\s{3}"); //"\\s{3}"

        for (int i = 0; i < stringArr.length; i++) {
            decode += decoderHelper(stringArr[i]) + " ";
        }
        System.out.println(decode);
        return decode;
    }

    static private String decoderHelper(String code) {
        String decode = "";
        String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----"};
        String[] stringArr = code.split("\\s+");

        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (stringArr[i].equals(morse[j])) {
                    decode += english[j];
                }
            }
        }
        return decode;
    }
}
