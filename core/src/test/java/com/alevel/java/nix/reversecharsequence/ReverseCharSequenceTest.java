package com.alevel.java.nix.reversecharsequence;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ReverseCharSequenceTest {
    ReverseCharSequence reverseCharSequence;
    ReverseCharSequence reverseCharSequence1;
    ReverseCharSequence reverseCharSequence2;
    ReverseCharSequence reverseCharSequence3;
    @BeforeEach
    void setUp()
    {
        reverseCharSequence = new ReverseCharSequence("abc");
        //reverseCharSequence1 = new ReverseCharSequence("");
        reverseCharSequence2 = new ReverseCharSequence("abcdefghijklmnopqrstuvwxyz");
        reverseCharSequence3 = new ReverseCharSequence("ALEVELNIXJAVAHOMEWORKFORLESSON7BEFOREMODULECHARSEQUENCE");
    }
    @Test
    void subSequence() {
        test("cba",reverseCharSequence);
        //test("",reverseCharSequence1);
        test("zyxwvutsrqponmlkjihgfedcba",reverseCharSequence2);
        test("ECNEUQESRAHCELUDOMEROFEB7NOSSELROFKROWEMOHAVAJXINLEVELA",reverseCharSequence3);
    }
    private void test(CharSequence charSequence,ReverseCharSequence reverseCharSequence)
    {
        reverseCharSequence.subSequence(0,reverseCharSequence.length());
        assertEquals(charSequence,reverseCharSequence.toString());
    }

}