public class StringCompression {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        System.out.println(compressString(s));
    }
    public static String compressString(String s) {
        StringBuilder sb = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < s.length(); i++) {
            countConsecutive++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i));
                sb.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        if (sb.length() > s.length()) {
            return s;
        }
        return sb.toString();
    }
    

}
