package com.mateuszstaskiewicz.investmentfund.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupFundTest extends BaseInvestmentTest{

    //Tests for example number 1
    @Test
    public void getDividedAmountTest1() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", "0.05");

        //when
        final BigDecimal dividedAmountForPolishFund = groupCalculatorForPolishFunds.getDividedAmount();
        final BigDecimal dividedAmountForForeignFund = groupCalculatorForForeignFunds.getDividedAmount();
        final BigDecimal dividedAmountForCashFund = groupCalculatorForCashFunds.getDividedAmount();

        //then
        assertEquals(new BigDecimal("1000"), dividedAmountForPolishFund);
        assertEquals(new BigDecimal("2500"), dividedAmountForForeignFund);
        assertEquals(new BigDecimal("500"), dividedAmountForCashFund);
    }

    @Test
    public void getDividedStrategyPercentTest1() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", "0.05");

        //when
        final BigDecimal dividedStrategyPercentForPolishFund = groupCalculatorForPolishFunds.getDividedStrategyPercent();
        final BigDecimal dividedStrategyPercentForForeignFund = groupCalculatorForForeignFunds.getDividedStrategyPercent();
        final BigDecimal dividedStrategyPercentForCashFund = groupCalculatorForCashFunds.getDividedStrategyPercent();

        //then
        assertEquals(new BigDecimal("0.1000"), dividedStrategyPercentForPolishFund);
        assertEquals(new BigDecimal("0.2500"), dividedStrategyPercentForForeignFund);
        assertEquals(new BigDecimal("0.0500"), dividedStrategyPercentForCashFund);
    }

    @Test
    public void getUnSeparatedAmountTest1() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", "0.05");

        //when
        final BigDecimal unSeparatedAmountForPolishFund = groupCalculatorForPolishFunds.getUnSeparatedAmount();
        final BigDecimal unSeparatedAmountForForeignFund = groupCalculatorForForeignFunds.getUnSeparatedAmount();
        final BigDecimal unSeparatedAmountForCashFund = groupCalculatorForCashFunds.getUnSeparatedAmount();

        //then
        assertEquals(new BigDecimal("0.00"), unSeparatedAmountForPolishFund);
        assertEquals(new BigDecimal("0.00"), unSeparatedAmountForForeignFund);
        assertEquals(new BigDecimal("0.00"), unSeparatedAmountForCashFund);
    }

    @Test
    public void sumOfUnSeparatedAmountTest1() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", "0.05");

        //when
        final BigDecimal sumOfUnSeparatedAmount = groupCalculatorForPolishFunds.getUnSeparatedAmount()
                .add(groupCalculatorForForeignFunds.getUnSeparatedAmount())
                .add(groupCalculatorForCashFunds.getUnSeparatedAmount());

        //then
        assertEquals(new BigDecimal("0.00"), sumOfUnSeparatedAmount);
    }


    //Tests for example number 2
    @Test
    public void getDividedAmountTest2() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", "0.05");

        //when
        final BigDecimal dividedAmountForPolishFund = groupCalculatorForPolishFunds.getDividedAmount();
        final BigDecimal dividedAmountForForeignFund = groupCalculatorForForeignFunds.getDividedAmount();
        final BigDecimal dividedAmountForCashFund = groupCalculatorForCashFunds.getDividedAmount();

        //then
        assertEquals(new BigDecimal("1000"), dividedAmountForPolishFund);
        assertEquals(new BigDecimal("2500"), dividedAmountForForeignFund);
        assertEquals(new BigDecimal("500"), dividedAmountForCashFund);
    }

    @Test
    public void getDividedStrategyPercentTest2() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", "0.05");

        //when
        final BigDecimal dividedStrategyPercentForPolishFund = groupCalculatorForPolishFunds.getDividedStrategyPercent();
        final BigDecimal dividedStrategyPercentForForeignFund = groupCalculatorForForeignFunds.getDividedStrategyPercent();
        final BigDecimal dividedStrategyPercentForCashFund = groupCalculatorForCashFunds.getDividedStrategyPercent();

        //then
        assertEquals(new BigDecimal("0.1000"), dividedStrategyPercentForPolishFund);
        assertEquals(new BigDecimal("0.2500"), dividedStrategyPercentForForeignFund);
        assertEquals(new BigDecimal("0.0500"), dividedStrategyPercentForCashFund);
    }

    @Test
    public void getUnSeparatedAmountTest2() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", "0.05");

        //when
        final BigDecimal unSeparatedAmountForPolishFund = groupCalculatorForPolishFunds.getUnSeparatedAmount();
        final BigDecimal unSeparatedAmountForForeignFund = groupCalculatorForForeignFunds.getUnSeparatedAmount();
        final BigDecimal unSeparatedAmountForCashFund = groupCalculatorForCashFunds.getUnSeparatedAmount();

        //then
        assertEquals(new BigDecimal("0.20"), unSeparatedAmountForPolishFund);
        assertEquals(new BigDecimal("0.75"), unSeparatedAmountForForeignFund);
        assertEquals(new BigDecimal("0.05"), unSeparatedAmountForCashFund);
    }

    @Test
    public void sumOfUnSeparatedAmountTest2() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", "0.05");

        //when
        final BigDecimal sumOfUnSeparatedAmount = groupCalculatorForPolishFunds.getUnSeparatedAmount()
                .add(groupCalculatorForForeignFunds.getUnSeparatedAmount())
                .add(groupCalculatorForCashFunds.getUnSeparatedAmount());

        //then
        assertEquals(new BigDecimal("1.00"), sumOfUnSeparatedAmount);
    }

    //Tests for example number 3
    @Test
    public void getDividedAmountTest3() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", "0.05");

        //when
        final BigDecimal dividedAmountForPolishFund = groupCalculatorForPolishFunds.getDividedAmount();
        final BigDecimal dividedAmountForForeignFund = groupCalculatorForForeignFunds.getDividedAmount();
        final BigDecimal dividedAmountForCashFund = groupCalculatorForCashFunds.getDividedAmount();

        //then
        assertEquals(new BigDecimal("667"), dividedAmountForPolishFund);
        assertEquals(new BigDecimal("3751"), dividedAmountForForeignFund);
        assertEquals(new BigDecimal("500"), dividedAmountForCashFund
        );
    }

    @Test
    public void getDividedStrategyPercentTest3() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", "0.05");

        //when
        final BigDecimal dividedStrategyPercentForPolishFund = groupCalculatorForPolishFunds.getDividedStrategyPercent();
        final BigDecimal dividedStrategyPercentForForeignFund = groupCalculatorForForeignFunds.getDividedStrategyPercent();
        final BigDecimal dividedStrategyPercentForCashFund = groupCalculatorForCashFunds.getDividedStrategyPercent();

        //then
        assertEquals(new BigDecimal("0.0666"), dividedStrategyPercentForPolishFund);
        assertEquals(new BigDecimal("0.3750"), dividedStrategyPercentForForeignFund);
        assertEquals(new BigDecimal("0.0500"), dividedStrategyPercentForCashFund);
    }

    @Test
    public void getUnSeparatedAmountTest3() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", "0.05");

        //when
        final BigDecimal unSeparatedAmountForPolishFund = groupCalculatorForPolishFunds.getUnSeparatedAmount();
        final BigDecimal unSeparatedAmountForForeignFund = groupCalculatorForForeignFunds.getUnSeparatedAmount();
        final BigDecimal unSeparatedAmountForCashFund = groupCalculatorForCashFunds.getUnSeparatedAmount();

        //then
        assertEquals(new BigDecimal("0.00"), unSeparatedAmountForPolishFund);
        assertEquals(new BigDecimal("1.75"), unSeparatedAmountForForeignFund);
        assertEquals(new BigDecimal("0.25"), unSeparatedAmountForCashFund);
    }

    @Test
    public void sumOfUnSeparatedAmountTest3() {
        //given
        final GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", "0.20");
        final GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", "0.75");
        final GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", "0.05");

        //when
        final BigDecimal sumOfUnSeparatedAmount = groupCalculatorForPolishFunds.getUnSeparatedAmount()
                .add(groupCalculatorForForeignFunds.getUnSeparatedAmount())
                .add(groupCalculatorForCashFunds.getUnSeparatedAmount());

        //then
        assertEquals(new BigDecimal("2.00"), sumOfUnSeparatedAmount);
    }

}
