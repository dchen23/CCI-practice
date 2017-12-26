package ch01_q06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    void compress() {

        String str = "aaaaabbbbaaaabbddc";
        System.out.println(str);
        System.out.println(Question.compress(str));
    }
}