package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.exception.EmptyListException;
import com.mateuszstaskiewicz.investmentfund.exception.WrongValuesGroupException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupCalculatorValidatorTest extends BaseInvestmentTest{

    @Test(expected = EmptyListException.class)
    public void shouldThrowEmptyListException() {
        GroupCalculator groupCalculator = createGroupCalculator(0, "100", "0.01");
    }

    @Test(expected = WrongValuesGroupException.class)
    public void shouldWrongValuesExceptionWhenAmountIsLessThan100() {
        GroupCalculator groupCalculator = createGroupCalculator(1, "90", "0.01");
    }

}

