//optimal and good for interview both below:

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq=new int[26];

        for(int i=0;i<sentence.length();i++){

            freq[sentence.charAt(i)-'a']++;

        }

        for(int i=0;i<26;i++){
            if(freq[i]==0) return false;
        }
        return true;
    }
}

class Solution1 {
    public boolean checkIfPangram(String sentence) {
        int mask = 0;

        for (char c : sentence.toCharArray()) {
            mask |= 1 << (c - 'a');
        }

        return mask == (1 << 26) - 1;
    }
}



//0ms on leetcode but not good for interview as when a a bigger string is there with much larger length it will have to run to complete length 26 times so not a good solution:
class Solution2 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
        for(int ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)<0)
            {
                return false;
            }
        }
        return true;
    }
}