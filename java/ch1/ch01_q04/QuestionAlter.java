package ch01_q04;

public class QuestionAlter {

    public static int toggle(int bitVector, int index) {
        if (index < 0) {
            return bitVector;
        }
        int mask = 1 << index;
        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= ~mask;
        }
        return bitVector;
    }

    public static int createBitVector(String phrase) {

        int bitVector = 0;
        for (char c : phrase.toCharArray()) {
            int x = Question.getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    public static boolean checkOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    public static boolean isPermutationOfPalindrome(String phrase) {
        int bitVector = createBitVector(phrase);
        return bitVector == 0 || checkOneBitSet(bitVector);
    }

    public static void main(String[] args) {
        String pali = "Rats live on no evil star";
        System.out.println(isPermutationOfPalindrome(pali));
    }
}
