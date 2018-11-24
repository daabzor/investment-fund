package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.model.statics.*;
import com.mateuszstaskiewicz.investmentfund.model.trades.GroupFund;
import com.mateuszstaskiewicz.investmentfund.model.trades.Investment;
import com.mateuszstaskiewicz.investmentfund.model.trades.InvestmentType;
import org.junit.Test;
import org.springframework.boot.test.context.TestComponent;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@TestComponent
public class FunctionalTest {
    private PolishFund polishFund1 = new PolishFund("Fundusz polski");
    private PolishFund polishFund2 = new PolishFund("Fundusz polski");
    private PolishFund polishFund3 = new PolishFund("Fundusz polski");

    private ForeignFund foreignFund1 = new ForeignFund("Fundusz zagraniczny");
    private ForeignFund foreignFund2 = new ForeignFund("Fundusz zagraniczny");
    private ForeignFund foreignFund3 = new ForeignFund("Fundusz zagraniczny");

    private CashFund cashFund1 = new CashFund("Fundusz pieniężny");
    private CashFund cashFund2 = new CashFund("Fundusz pieniężny");
    private CashFund cashFund3 = new CashFund("Fundusz pieniężny");

    @Test
    public void intestmentTest() {
        //given
        List<InvestmentFund> investmentFunds = Arrays.asList(polishFund1, polishFund2, polishFund3,
                foreignFund1, foreignFund2, foreignFund3, cashFund1, cashFund2, cashFund3);

        List<InvestmentFund> polishList = investmentFunds.stream()
                .filter(a -> a.getFundType().equals(FundType.POLISH))
                .collect(Collectors.toList());

        Long numberOfPolishFunds = polishList.stream().count();

        //when
        Investment investment = new Investment(InvestmentType.SAFE, new BigDecimal(10005));

//        InvestmentAmountsCalculator investmentCalculator = new InvestmentCalculatorEngine(investment, investmentFunds);
//
//        investmentCalculator.get

        //then
        //List<BigDecimal> investmentCalculator.getPolishFundGroup
    }
}
