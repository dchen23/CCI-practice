package ch01_q01;

public class QuestionA {

    static boolean isUnique(String strs) {
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < strs.length(); i++) {
            int val = strs.charAt(i);
            System.out.println(val);
            if (char_set[val])
                return false;
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUnique(word));
        }
    }
}
