import java.util.*;
public class OneAway {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "bb";
        if (oneAway(s1, s2)) {
            System.out.println("Yes");
        }
        else {System.out.println("no");}
    }
    public static boolean oneAway(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int difference = s1.length() - s2.length();
        if (Math.abs(difference) > 1) {
            return false;
        }
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), 1);
        }
        for (int k = 0; k < s2.length(); k++) {
            if (map.containsKey(s2.charAt(k))) {
                map.put(s2.charAt(k), 2);
            }
        }
        for (int x : map.values()) {
            if (x == 1) {
                count++;
            }
        }
        return count <= 1;
    }
}
