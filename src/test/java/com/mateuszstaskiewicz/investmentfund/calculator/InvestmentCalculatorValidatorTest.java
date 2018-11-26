package com.mateuszstaskiewicz.investmentfund.calculator;

import com.mateuszstaskiewicz.investmentfund.exception.FundTypeListException;
import com.mateuszstaskiewicz.investmentfund.model.investment.Investment;
import com.mateuszstaskiewicz.investmentfund.model.investment.InvestmentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvestmentCalculatorValidatorTest extends BaseInvestmentTest {

    @Test(expected = FundTypeListException.class)
    public void shouldTrowExceptionWhenListDoesntContainsPolishFunds() {
        Investment investment = new Investment(InvestmentType.SAFE, "1000");
        InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(investment, LIST_OF_0_POL_1_FOR_1_CASH_FUNDS);
    }

    @Test(expected = FundTypeListException.class)
    public void shouldTrowExceptionWhenListDoesntContainsForeignFunds() {
        Investment investment = new Investment(InvestmentType.SAFE, "1000");
        InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(investment, LIST_OF_1_POL_0_FOR_1_CASH_FUNDS);
    }

    @Test(expected = FundTypeListException.class)
    public void shouldTrowExceptionWhenListDoesntContainsCashFunds() {
        Investment investment = new Investment(InvestmentType.SAFE, "1000");
        InvestmentCalculator investmentCalculator = new InvestmentCalculatorEngine(investment, LIST_OF_1_POL_1_FOR_0_CASH_FUNDS);
    }
    
}

