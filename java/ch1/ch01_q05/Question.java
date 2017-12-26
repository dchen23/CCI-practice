package ch01_q05;

public class Question {

    public static boolean oneEditAway(String a, String b) {

        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        if (Math.abs(ac.length - bc.length) > 1) {
            return false;
        }

        boolean edit = false;

        if (ac.length == bc.length) {
            for (int i = 0; i < ac.length; i++) {
                if (ac[i] != bc[i]) {
                    if (edit)
                        return false;
                    edit = true;
                }
            }
        } else if (ac.length > bc.length) {
            for (int i = 0; i < ac.length; i++) {
                if (i > bc.length - 1)
                    return true;
                if (edit && ac[i] != bc[i-1])
                    return false;
                else if (ac[i] != bc[i]) {
                    edit = true;
                }
            }
        } else {
            for (int i = 0; i < bc.length; i++) {
                if (i > ac.length - 1)
                    return true;
                if (edit && ac[i-1] != bc[i])
                    return false;
                else if (ac[i] != bc[i]) {
                    edit = true;
                }
            }
        }

        return edit;
    }

    public static void main(String[] args) {
        String a = "pse";
        String b = "pale";
        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + ", " + b + ": " + isOneEdit);
    }
}
