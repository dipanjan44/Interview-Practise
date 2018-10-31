package HackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceParenthesisTest {


    @Test
    public void shouldbeTrue()
    {
        BalanceParenthesis bl = new BalanceParenthesis();

        assertTrue(bl.balanceParenthesis("[()]"));

    }


}