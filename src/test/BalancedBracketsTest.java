package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithOneMiddleLetterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a]"));
    }

    @Test
    public void bracketsWithOneSideLetterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[]"));
    }

    @Test
    public void bracketsWithMultipleSideLettersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("aasfd[]asdfa"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void twoLeftBracketsOneRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void oneBracketWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void mismatchedBracketsWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void twoRightBracketsOneLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void blankSpaceReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void manyBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][][]"));
    }







}
