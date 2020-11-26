
//Given two strings, write a method to decide if one is a permutation of the other.
import java.util.Scanner;
import java.util.*;

public class CheckPermutation {
    public static void main(String[] args) {
        String s1 = "q";
        String s2 = "w";

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
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        HashMap<Integer, Character> map2 = new HashMap<Integer, Character>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i) - 'a', s1.charAt(i));
            map2.put(s2.charAt(i) - 'a', s2.charAt(i));
        }
        if (!(map.equals(map2))) {
            return false;
        }
        return true;
    }
}