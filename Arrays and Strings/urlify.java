public class urlify {
    //write a method to replace all spaces in a string with '%20'.
    //You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true"
    //length of the string.
    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        char[] str = new char[17];
        int trueLength = 13;
        for (int i = 0; i < str.length; i++) {
            str[i] = s.charAt(i);
        }
        urlify_string(str, trueLength);
    }
    public static void urlify_string(char[] s, int true_length) {
        // find number of spaces
        int space_count = 0;
        for (int i = 0; i < true_length; ++i) {
          if (s[i] == ' ') {
            ++space_count;
          }
        }
      
        // second counter
        //points at total string length with the %20
        int final_index = true_length + 2 * space_count; //2 * spaces because there will be 2 extra characters for each space
        //final index = 17;
        // i is the first counter
        for (int m = true_length - 1; m >= 0; --m) {
          if (s[m] == ' ') {
            s[final_index - 1] = '0';
            s[final_index - 2] = '2';
            s[final_index - 3] = '%';
            final_index -= 3;
          } else {
            s[final_index - 1] = s[m];
            --final_index;
          }
        }
        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k]);
        }
        System.out.println();
    }
}