package com.mateuszstaskiewicz.investmentfund;

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
    public void investmentAmountForDifferentLengthFundListShouldBeCorrect() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", "0.05");

        //then
        assertEquals(new BigDecimal("1000"), groupCalculatorForPolishFunds.getAmountOfInvestmentForOneFund());
        assertEquals(new BigDecimal("2500"), groupCalculatorForForeignFunds.getAmountOfInvestmentForOneFund());
        assertEquals(new BigDecimal("500"), groupCalculatorForCashFunds.getAmountOfInvestmentForOneFund());
    }

    @Test
    public void investmentPercentForDifferentLengthFundListShouldBeCorrect() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", "0.05");

        //then
        assertEquals(new BigDecimal("0.1000"), groupCalculatorForPolishFunds.getPercentOfInvestmentForOneFund());
        assertEquals(new BigDecimal("0.2500"), groupCalculatorForForeignFunds.getPercentOfInvestmentForOneFund());
        assertEquals(new BigDecimal("0.0500"), groupCalculatorForCashFunds.getPercentOfInvestmentForOneFund());
    }

    @Test
    public void ForDifferentLengthFundListShouldBeCorrect() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", "0.05");

        //then
        assertEquals(new BigDecimal("0.00"), groupCalculatorForPolishFunds.getUnseparatedAmount());
        assertEquals(new BigDecimal("0.00"), groupCalculatorForForeignFunds.getUnseparatedAmount());
        assertEquals(new BigDecimal("0.00"), groupCalculatorForCashFunds.getUnseparatedAmount());
    }

    @Test
    public void sumForUnseparatedAmountShouldBe0() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", "0.05");

        //then
        assertEquals(new BigDecimal("0.00"), groupCalculatorForPolishFunds.getUnseparatedAmount()
                .add(groupCalculatorForForeignFunds.getUnseparatedAmount())
                .add(groupCalculatorForCashFunds.getUnseparatedAmount()));
    }


    //Tests for example number 2
    @Test
    public void investmentAmountForDifferentLengthFundListShouldBeCorrect2() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", "0.05");

        //then
        assertEquals(new BigDecimal("1000"), groupCalculatorForPolishFunds.getAmountOfInvestmentForOneFund());
        assertEquals(new BigDecimal("2500"), groupCalculatorForForeignFunds.getAmountOfInvestmentForOneFund());
        assertEquals(new BigDecimal("500"), groupCalculatorForCashFunds.getAmountOfInvestmentForOneFund());
    }

    @Test
    public void investmentPercentForDifferentLengthFundListShouldBeCorrect2() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", "0.05");

        //then
        assertEquals(new BigDecimal("0.1000"), groupCalculatorForPolishFunds.getPercentOfInvestmentForOneFund());
        assertEquals(new BigDecimal("0.2500"), groupCalculatorForForeignFunds.getPercentOfInvestmentForOneFund());
        assertEquals(new BigDecimal("0.0500"), groupCalculatorForCashFunds.getPercentOfInvestmentForOneFund());
    }

    @Test
    public void ForDifferentLengthFundListShouldBeCorrect2() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", "0.05");

        //then
        assertEquals(new BigDecimal("0.20"), groupCalculatorForPolishFunds.getUnseparatedAmount());
        assertEquals(new BigDecimal("0.75"), groupCalculatorForForeignFunds.getUnseparatedAmount());
        assertEquals(new BigDecimal("0.05"), groupCalculatorForCashFunds.getUnseparatedAmount());
    }

    @Test
    public void sumForUnseparatedAmountShouldBe1() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", "0.05");

        //then
        assertEquals(new BigDecimal("1.00"), groupCalculatorForPolishFunds.getUnseparatedAmount()
                                                    .add(groupCalculatorForForeignFunds.getUnseparatedAmount())
                                                    .add(groupCalculatorForCashFunds.getUnseparatedAmount()));
    }

    //Tests for example number 3
    @Test
    public void investmentAmountForDifferentLengthFundListShouldBeCorrect3() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", "0.05");

        //then
        assertEquals(new BigDecimal("667"), groupCalculatorForPolishFunds.getAmountOfInvestmentForOneFund());
        assertEquals(new BigDecimal("3751"), groupCalculatorForForeignFunds.getAmountOfInvestmentForOneFund());
        assertEquals(new BigDecimal("500"), groupCalculatorForCashFunds.getAmountOfInvestmentForOneFund());
    }

    @Test
    public void investmentPercentForDifferentLengthFundListShouldBeCorrect3() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", "0.05");

        //then
        assertEquals(new BigDecimal("0.0666"), groupCalculatorForPolishFunds.getPercentOfInvestmentForOneFund());
        assertEquals(new BigDecimal("0.3750"), groupCalculatorForForeignFunds.getPercentOfInvestmentForOneFund());
        assertEquals(new BigDecimal("0.0500"), groupCalculatorForCashFunds.getPercentOfInvestmentForOneFund());
    }

    @Test
    public void ForDifferentLengthFundListShouldBeCorrect3() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", "0.05");

        //then
        assertEquals(new BigDecimal("0.00"), groupCalculatorForPolishFunds.getUnseparatedAmount());
        assertEquals(new BigDecimal("1.75"), groupCalculatorForForeignFunds.getUnseparatedAmount());
        assertEquals(new BigDecimal("0.25"), groupCalculatorForCashFunds.getUnseparatedAmount());
    }

    @Test
    public void sumForUnSeparatedAmountShouldBe2() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", "0.20");
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", "0.75");
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", "0.05");

        //then
        assertEquals(new BigDecimal("2.00"), groupCalculatorForPolishFunds.getUnseparatedAmount()
                .add(groupCalculatorForForeignFunds.getUnseparatedAmount())
                .add(groupCalculatorForCashFunds.getUnseparatedAmount()));
    }

}
