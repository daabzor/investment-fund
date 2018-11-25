package com.mateuszstaskiewicz.investmentfund.model.statics;

import lombok.Data;

@Data
public class ForeignFund extends InvestmentFund {

    private static Long id;
    public static FundType fundType = FundType.FOREIGN;

    static {
        id = 1L;
    }

    public ForeignFund(final String name) {
        super(id, name + " " + Long.toString(id), fundType);
        id++;
    }

}
