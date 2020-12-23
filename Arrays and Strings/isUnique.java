//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
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

/*If we cannot use additional structures we can do 2 things:
1. We can go through the list with two pointers. The inner pointer compares each character in the string to each other.
This takes O(n^2) time.
2. We can sort the list. And then linearly go through the list and if check if any neighbor characters repeat.
The sorting would take O(n log(n))
*/