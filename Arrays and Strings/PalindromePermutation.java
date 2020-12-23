public class PalindromePermutation {
    public static void main(String[] args) {
        String sis = "racecae";
        if (isPalindromic(sis)) {
            System.out.println("It is a palindrome permuation");
        } else {
            System.out.println("Not one");
        }
    }

    public static boolean isPalindromic(String s) {
        int[] charCounts = new int[128];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i)]++;
            
        }
        for (int i = 0; i < charCounts.length; i++) {
            // System.out.println(charCounts[i]);
        }
        int count = 0;
        for (int i = 0; i < 128; i++) {
            if (charCounts[i] % 2 != 0) {
                count++;
            }
            //count will only had how many odds we have
            //if there is more than one 1 we get, then we return false
        }
        return count <= 1;
    }

}