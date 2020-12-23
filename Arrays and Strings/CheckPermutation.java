public class CheckPermutation {
    public static void main(String[] args) {
        String s1 = "baack";
        String s2 = "bacaa";

        if (check(s1, s2)) {
            System.out.println("yez");
        } else {
            System.out.println("no");
        }

    }

    public static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] content1 = s1.toCharArray();
        char[] content2 = s2.toCharArray();
        java.util.Arrays.sort(content1);
        java.util.Arrays.sort(content2);
        String bah = new String(content1); //this syntax can convert a char array into a string
        String baz = new String(content2);
        if (!bah.equals(baz)) {
            return false;
        }
        return true;
    }
}