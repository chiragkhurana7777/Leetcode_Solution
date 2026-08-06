//8ms beats 30% only:

// without String StringBuilder
//4ms beats 92%:
class Solution1 {

    public String reverseWords(String s) {

        StringBuilder revst = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            if (s.charAt(i) != ' ') {
                int end = i;

                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                revst.append(s, i + 1, end + 1);
                revst.append(' ');

            }
        }
        return revst.toString().trim();
    }
}

// 4ms without any built in function:
class Solutionbest {

    public String reverseWords(String s) {

        StringBuilder revst = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (revst.length() > 0) {
                revst.append(' ');
            }
            revst.append(s, i + 1, end + 1);

        }

        return revst.toString();

    }
}

//6ms with split function:
class Solution {

    public String reverseWords(String s) {
        StringBuilder me = new StringBuilder();
        String[] ans = s.trim().split("\\s+");
        int n = ans.length - 1;
        for (int i = n; i > 0; i--) {
            me.append(ans[i]);
            me.append(' ');
        }
        me.append(ans[0]);
        return me.toString();
    }
}
