import java.util.*;
import java.util.Scanner;

public class isUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if (isUniquer(s)) {
            System.out.println("unique");
        } else {
            System.out.println("not unique");
        }
    }

    public static boolean isUniquer(String s) {
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsValue(s.charAt(i))) {
                return false;
            } else {
                map.put(i, s.charAt(i));
            }
        }
        return true;
    }
}