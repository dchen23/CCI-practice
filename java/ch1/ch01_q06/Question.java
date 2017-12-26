package ch01_q06;

public class Question {

    public static String compress(String str) {

        char cursor = str.charAt(0);
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(cursor == str.charAt(i)) {
                count++;
            }
            else {
                sb.append(cursor);
                sb.append(count);
                cursor = str.charAt(i);
                count = 1;
            }
        }
        sb.append(cursor);
        sb.append(count);

        if (sb.length() >= str.length())
            return str;
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aa";
        System.out.println(str);
        System.out.println(compress(str));
    }
}
