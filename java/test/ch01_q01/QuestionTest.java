package ch01_q01;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    String[] words = {"abcde", "hello", "apple", "kite", "padle"};

    @org.junit.jupiter.api.Test
    void isUnique() {
        for (String word : words) {
            boolean wordA =  QuestionA.isUnique(word);
            boolean wordB =  QuestionB.isUnique(word);
            if (wordA == wordB) {
                System.out.println(word + ": " + wordA);
            } else {
                System.out.println(word + ": " + wordA + " vs " + wordB);
            }
        }
    }
}