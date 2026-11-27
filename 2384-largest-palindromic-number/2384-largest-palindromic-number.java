class Solution {
    public String largestPalindromic(String num) {
        int[] freq = new int[10];

        for (int i = 0; i < num.length(); i++) {
            freq[num.charAt(i) - '0']++;
        }

        StringBuilder left = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            while (freq[i] >= 2) {
                if (i == 0 && left.length() == 0) {
                    break;
                }

                left.append(i);
                freq[i] -= 2;
            }
        }

        if (left.length() == 0) {
            for (int i = 9; i >= 0; i--) {
                if (freq[i] > 0) {
                    return String.valueOf(i);
                }
            }
        }

        String middle = "";

        for (int i = 9; i >= 0; i--) {
            if (freq[i] > 0) {
                middle = String.valueOf(i);
                break;
            }
        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle + right;
    }
}