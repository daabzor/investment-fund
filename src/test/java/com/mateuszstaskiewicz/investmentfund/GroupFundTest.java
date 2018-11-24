package com.mateuszstaskiewicz.investmentfund;

import com.mateuszstaskiewicz.investmentfund.model.statics.InvestmentFund;
import com.mateuszstaskiewicz.investmentfund.model.statics.PolishFund;
import com.mateuszstaskiewicz.investmentfund.model.trades.GroupCalculator;
import com.mateuszstaskiewicz.investmentfund.model.trades.GroupFund;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupFundTest {

    static BigDecimal getNumberWithoutDecimalPlaces(String number) {
        return new BigDecimal(number);
    }

    static BigDecimal getNumberWithPrecision2(double number) {
        return new BigDecimal(number).setScale(2, BigDecimal.ROUND_DOWN);
    }

    static BigDecimal getNumberWithPrecision4(double number) {
        return new BigDecimal(number).setScale(4, BigDecimal.ROUND_DOWN);
    }

    private GroupCalculator createGroupCalculator(int elements, String invesmtentAmount, double percentStrategy) {
        List<InvestmentFund> fundList = new ArrayList<>();
        for(int i = 0; i < elements; i++) {
            fundList.add(new PolishFund("Test fund"));
        }
         return new GroupFund(fundList, getNumberWithoutDecimalPlaces(invesmtentAmount), getNumberWithPrecision2(percentStrategy));
    }

    //Tests for example number 1
    @Test
    public void investmentAmountForDifferentLengthFundListShouldBeCorrect() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", 0.05);

        //then
        assertEquals(getNumberWithoutDecimalPlaces("1000"), groupCalculatorForPolishFunds.getAmountOfInvestmentForOneFund());
        assertEquals(getNumberWithoutDecimalPlaces("2500"), groupCalculatorForForeignFunds.getAmountOfInvestmentForOneFund());
        assertEquals(getNumberWithoutDecimalPlaces("500"), groupCalculatorForCashFunds.getAmountOfInvestmentForOneFund());
    }

    @Test
    public void investmentPercentForDifferentLengthFundListShouldBeCorrect() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", 0.05);

        //then
        assertEquals(getNumberWithPrecision4(0.1000), groupCalculatorForPolishFunds.getPercentOfInvestmentForOneFund());
        assertEquals(getNumberWithPrecision4(0.2500), groupCalculatorForForeignFunds.getPercentOfInvestmentForOneFund());
        assertEquals(getNumberWithPrecision4(0.0500), groupCalculatorForCashFunds.getPercentOfInvestmentForOneFund());
    }

    @Test
    public void ForDifferentLengthFundListShouldBeCorrect() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", 0.05);

        //then
        assertEquals(getNumberWithPrecision2(0), groupCalculatorForPolishFunds.getUnseparatedAmount());
        assertEquals(getNumberWithPrecision2(0), groupCalculatorForForeignFunds.getUnseparatedAmount());
        assertEquals(getNumberWithPrecision2(0), groupCalculatorForCashFunds.getUnseparatedAmount());
    }

    @Test
    public void sumForUnseparatedAmountShouldBe0() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10000", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10000", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10000", 0.05);

        //then
        assertEquals(getNumberWithPrecision2(0.00), groupCalculatorForPolishFunds.getUnseparatedAmount()
                .add(groupCalculatorForForeignFunds.getUnseparatedAmount())
                .add(groupCalculatorForCashFunds.getUnseparatedAmount()));
    }


    //Tests for example number 2
    @Test
    public void investmentAmountForDifferentLengthFundListShouldBeCorrect2() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", 0.05);

        //then
        assertEquals(getNumberWithoutDecimalPlaces("1000"), groupCalculatorForPolishFunds.getAmountOfInvestmentForOneFund());
        assertEquals(getNumberWithoutDecimalPlaces("2500"), groupCalculatorForForeignFunds.getAmountOfInvestmentForOneFund());
        assertEquals(getNumberWithoutDecimalPlaces("500"), groupCalculatorForCashFunds.getAmountOfInvestmentForOneFund());
    }

    @Test
    public void investmentPercentForDifferentLengthFundListShouldBeCorrect2() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", 0.05);

        //then
        assertEquals(getNumberWithPrecision4(0.1000), groupCalculatorForPolishFunds.getPercentOfInvestmentForOneFund());
        assertEquals(getNumberWithPrecision4(0.2500), groupCalculatorForForeignFunds.getPercentOfInvestmentForOneFund());
        assertEquals(getNumberWithPrecision4(0.0500), groupCalculatorForCashFunds.getPercentOfInvestmentForOneFund());
    }

    @Test
    public void ForDifferentLengthFundListShouldBeCorrect2() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", 0.05);

        //then
        assertEquals(getNumberWithPrecision2(0.20), groupCalculatorForPolishFunds.getUnseparatedAmount());
        assertEquals(getNumberWithPrecision2(0.75), groupCalculatorForForeignFunds.getUnseparatedAmount());
        assertEquals(getNumberWithPrecision2(0.05), groupCalculatorForCashFunds.getUnseparatedAmount());
    }

    @Test
    public void sumForUnseparatedAmountShouldBe1() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(2,"10001", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(3,"10001", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10001", 0.05);

        //then
        assertEquals(getNumberWithPrecision2(1.00), groupCalculatorForPolishFunds.getUnseparatedAmount()
                                                    .add(groupCalculatorForForeignFunds.getUnseparatedAmount())
                                                    .add(groupCalculatorForCashFunds.getUnseparatedAmount()));
    }

    //Tests for example number 3
    @Test
    public void investmentAmountForDifferentLengthFundListShouldBeCorrect3() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", 0.05);

        //then
        assertEquals(getNumberWithoutDecimalPlaces("667"), groupCalculatorForPolishFunds.getAmountOfInvestmentForOneFund());
        assertEquals(getNumberWithoutDecimalPlaces("3751"), groupCalculatorForForeignFunds.getAmountOfInvestmentForOneFund());
        assertEquals(getNumberWithoutDecimalPlaces("500"), groupCalculatorForCashFunds.getAmountOfInvestmentForOneFund());
    }

    @Test
    public void investmentPercentForDifferentLengthFundListShouldBeCorrect3() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", 0.05);

        //then
        assertEquals(getNumberWithPrecision4(0.0666), groupCalculatorForPolishFunds.getPercentOfInvestmentForOneFund());
        assertEquals(getNumberWithPrecision4(0.3750), groupCalculatorForForeignFunds.getPercentOfInvestmentForOneFund());
        assertEquals(getNumberWithPrecision4(0.0500), groupCalculatorForCashFunds.getPercentOfInvestmentForOneFund());
    }

    @Test
    public void ForDifferentLengthFundListShouldBeCorrect3() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", 0.05);

        //then
        assertEquals(getNumberWithPrecision2(0.00), groupCalculatorForPolishFunds.getUnseparatedAmount());
        assertEquals(getNumberWithPrecision2(1.75), groupCalculatorForForeignFunds.getUnseparatedAmount());
        assertEquals(getNumberWithPrecision2(0.25), groupCalculatorForCashFunds.getUnseparatedAmount());
    }

    @Test
    public void sumForUnseparatedAmountShouldBe2() {
        //given - test data above

        //when
        GroupCalculator groupCalculatorForPolishFunds = createGroupCalculator(3,"10005", 0.20);
        GroupCalculator groupCalculatorForForeignFunds = createGroupCalculator(2,"10005", 0.75);
        GroupCalculator groupCalculatorForCashFunds = createGroupCalculator(1,"10005", 0.05);

        //then
        assertEquals(getNumberWithPrecision2(2.00), groupCalculatorForPolishFunds.getUnseparatedAmount()
                .add(groupCalculatorForForeignFunds.getUnseparatedAmount())
                .add(groupCalculatorForCashFunds.getUnseparatedAmount()));
    }

}
