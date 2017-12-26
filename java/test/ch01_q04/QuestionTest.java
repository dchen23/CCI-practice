package ch01_q04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    void isPermutationOfPalindrome() {

        String[] strings = {"Rats live on no evil star",
                "A man, a plan, a canal, panama",
                "Lleve",
                "Tacotac",
                "asda"};
        for (String s : strings) {
            boolean a = Question.isPermutationOfPalindrome(s);
            boolean b = QuestionAlter.isPermutationOfPalindrome(s);
            System.out.println(s);
            if (a == b) {
                System.out.println("Agree: " + a);
            } else {
                System.out.println("Disagree: " + a + ", " + b);
            }
            System.out.println();
        }
    }
}