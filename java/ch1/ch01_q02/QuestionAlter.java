package ch01_q02;

public class QuestionAlter {

    public static boolean isPermutation(String src, String dst) {

        if (src == null || dst == null || src.length() != dst.length()) {
            return false;
        }

        int[] letters = new int[128]; // ASCII table.
        for (int i = 0; i < src.length(); i++) {
            letters[src.charAt(i)]++;
        }

        for (int i = 0; i < dst.length(); i++) {
            int val = letters[dst.charAt(i)]--;
            if (val == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = isPermutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}
