package main;

import org.junit.*;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Before
    //public void createBalanceBracketsObject() {
    //    BalancedBrackets test_balance_brackets = new BalancedBrackets();
    //}
   
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(hasBalancedBrackets("["));
    }

    @Test
    public void onlyBracketsMisnested() {
        assertFalse(hasBalancedBrackets("]["));
    }

    @Test
    public void onlyBracketsReturnsEqualsTrue() {
        assertEquals(hasBalancedBrackets("[]"), true);
    }

    @Test
    public void onlyBracketsReturnsEqualsFalse() {
        assertEquals(hasBalancedBrackets("["), false);
    }

    @Test
    public void onlyBracketsReturnsNotNull() {
        assertNotNull(hasBalancedBrackets("["));
    }

    @Test
    public void onlyBracketsWithOtherCharsTrue() {
        assertTrue(hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void onlyBracketsWithOtherCharsFalse() {
        assertFalse(hasBalancedBrackets("[LaunchCode["));
    }

    @Test
    public void onlyBracketsWithNoBrackets() {
        assertFalse(hasBalancedBrackets("LaunchCode"));
    }

}
