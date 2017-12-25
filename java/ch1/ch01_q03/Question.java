package ch01_q03;

public class Question {

    public static void urlify(char[] str, int length) {
        int rindex = str.length - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                str[rindex] = str[i];
                rindex--;
            }
            else {
                str[rindex] = '0';
                str[rindex - 1] = '2';
                str[rindex - 2] = '%';
                rindex -= 3;
            }
        }

    }

    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] urls = {"hello world  ", " haha  ", "very interesting hah    "};

        for (String url : urls) {

            char[] chars = url.toCharArray();
            int length = findLastCharacter(chars) + 1;
            urlify(chars, length);
            System.out.println(new String(chars));
        }
    }
}
