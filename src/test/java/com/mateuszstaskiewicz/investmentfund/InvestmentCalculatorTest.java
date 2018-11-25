package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.model.statics.*;
import com.mateuszstaskiewicz.investmentfund.model.trades.Investment;
import com.mateuszstaskiewicz.investmentfund.model.trades.InvestmentType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.TestComponent;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class InvestmentCalculatorTest extends BaseInvestmentTest {

    private static InvestmentCalculator SAFE_STRATEGY_WITH_1POL_1FOR_1CASH_FUNDS;

    @BeforeClass
    public static void setupInitialData() {
        final List<InvestmentFund> investmentFunds = createFundsList(1,1,1);
        final Investment investment = new Investment(InvestmentType.SAFE, "10000");
        SAFE_STRATEGY_WITH_1POL_1FOR_1CASH_FUNDS = new InvestmentCalculatorEngine(investment, investmentFunds);
    }

    @Test
    public void investmentTest() {
        //given - test data above

        //when

        //then
        assertEquals(new BigDecimal("0.00"), investmentCalculator.getUnseparatedAmount());
    }
}
