class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        String allowed = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String vowel = "AEIOUaeiou";
        String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (allowed.indexOf(ch) == -1) {
                return false;
            }

            if (vowel.indexOf(ch) != -1) {
                hasVowel = true;
            }

            if (consonants.indexOf(ch) != -1) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}

class Solution1 {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean vowel = false;
        boolean consonant = false;

        for (char ch : word.toCharArray()) {

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowel = true;
            } else if (Character.isLetter(ch)) {
                consonant = true;
            }
        }

        return vowel && consonant;
    }
}
