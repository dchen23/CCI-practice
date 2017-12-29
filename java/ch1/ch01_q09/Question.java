package ch01_q09;

public class Question {

    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isRotation(String src, String dst) {

        StringBuilder sb = new StringBuilder();
        boolean found = false;
        int index = 1;

        if (src.length() != dst.length())
            return false;

        for (int i = 0; i < dst.length(); i++) {
            if (found) {
                sb.insert(index, dst.charAt(i));
                index++;
            }
            else {

                sb.append(dst.charAt(i));
                if (!isSubstring(src, sb.toString())) {
                    found = true;
                    sb.deleteCharAt(i);
                    sb.insert(0, dst.charAt(i));
                }
            }
        }

        if (src.equals(sb.toString()))
            return true;

        return false;
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = isRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }
}
