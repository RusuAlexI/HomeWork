package exercise.testmorseencoder;

public class MorseEncoder {

    private String message;

    public final static char[] ENGLISH_ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public final static String[] MORSE_ALPHABET = {".-", "-...", "-.-.", "-..",
        ".", "..-.", "--.", "....", "..",
        ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
        "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
        "-----"};

    public MorseEncoder(String message) {
        this.message = message;
    }

    public static String encode(String message) {
        String encodedText = "";
        char[] messageToCharArray = message.toCharArray();

        for (int i = 0; i < messageToCharArray.length; i++) {
            for (int j = 0; j < ENGLISH_ALPHABET.length; j++) {
                if (messageToCharArray[i] == ENGLISH_ALPHABET[j]) {
                    encodedText += MORSE_ALPHABET[j] + " ";
                }

            }
            if (messageToCharArray[i] == ' ') {
                encodedText += "   ";
            }
        }
        System.out.println(encodedText);
        return encodedText;
    }

    public static String decode(String message) {
        String decodedText = "";
        String[] stringArr = message.split("\\s{3}"); //"\\s{3}"

        for (int i = 0; i < stringArr.length; i++) {
            decodedText += decodeWord(stringArr[i]) + " ";
        }
        System.out.println(decodedText);
        return decodedText;
    }

    static private String decodeWord(String code) {
        String decodedWord = "";

        String[] letters = code.split("\\s+");

        for (String letter : letters) {
            for (int j = 0; j < MORSE_ALPHABET.length; j++) {
                if (letter.equals(MORSE_ALPHABET[j])) {
                    decodedWord += ENGLISH_ALPHABET[j];
                }
            }
        }
        return decodedWord;
    }
}
