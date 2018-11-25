package com.mateuszstaskiewicz.investmentfund.model.statics;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class PolishFund extends InvestmentFund {

    private static Long id;
    public static FundType fundType = FundType.POLISH;

    static {
        id = 1L;
    }

    public PolishFund(final String name) {
        super(id, name + " " + Long.toString(id), fundType);
        id++;
    }

}
