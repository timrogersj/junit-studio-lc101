package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void characterOnlyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void onlyLeftOneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightOneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringSurroundingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringBeforeBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void stringBehindBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringMixBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]."));
    }

    @Test
    public void stringMixTwoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("L[aunch]C[ode]."));
    }

    @Test
    public void stringOutOfOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void Test1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("L]aunch[Code"));
    }


}
