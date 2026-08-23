class Solution {
    public boolean sumGame(String num) {

        int n = num.length();
        int mid = n / 2;

        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < mid; i++) {

            char ch = num.charAt(i);

            if (ch == '?') {
                leftQ++;
            } else {
                leftSum += ch - '0';
            }
        }

        for (int i = mid; i < n; i++) {

            char ch = num.charAt(i);

            if (ch == '?') {
                rightQ++;
            } else {
                rightSum += ch - '0';
            }
        }

        // If number of '?' is odd, Alice always wins
        if ((leftQ + rightQ) % 2 == 1) {
            return true;
        }

        // Otherwise Bob can win only if this equality holds
        return 2 * (leftSum - rightSum) !=
               9 * (rightQ - leftQ);
    }
}