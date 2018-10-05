package exercise.pig.latin;

public class PigLatin {

    //String userWord;
    public PigLatin(String userWord) {
        toPigLatin(userWord);
    }

    public String toPigLatin(String userWord) {
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
            'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] userWordToArray = userWord.toCharArray();
        int placeOfFirstVowel = 0;
        int placeOfFirstConsonant = 0;
        boolean vowelFound = false;
        boolean consonantFound = false;

        System.out.println(userWord);

        for (int j = 0; j < userWordToArray.length; j++) {
            for (int i = 0; i < consonants.length; i++) {
                if (userWordToArray[j] == consonants[i]) {
                    placeOfFirstConsonant = j;
                    consonantFound = true;
                }
            }
            if (consonantFound) {
                break;
            }
        }

        for (int j = 0; j < userWordToArray.length; j++) {
            for (int i = 0; i < vowels.length; i++) {
                if (vowels[i] == userWordToArray[j]) {
                    placeOfFirstVowel = j;
                    vowelFound = true;
                }
            }
            if (vowelFound) {
                break;
            }
        }

        //System.out.println("vowel: "+placeOfFirstVowel+"  cons "+placeOfFirstConsonant);
        if (placeOfFirstConsonant == 0) {
            String firstLetters = userWord.substring(0, placeOfFirstVowel);
            String shortenedUserWord = userWord.substring(placeOfFirstVowel);
            userWord = shortenedUserWord + firstLetters + "ay";
            System.out.println(userWord);
        } else if (userWordToArray[0] == 'y') {
            String shortenedUserWord = userWord.substring(1);
            userWord = shortenedUserWord + "y" + "ay";
            System.out.println(userWord);
        } else if (placeOfFirstVowel == 0) {
            userWord = userWord + "ay";
            System.out.println(userWord);
        }

        return userWord;
    }
}
