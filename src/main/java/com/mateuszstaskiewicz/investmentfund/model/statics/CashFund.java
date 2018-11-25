package com.mateuszstaskiewicz.investmentfund.model.statics;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class CashFund extends InvestmentFund {

    private static Long id;
    public static FundType fundType = FundType.CASH;

    static {
        id = 1L;
    }

    public CashFund(final String name) {
        super(id, name + " " + Long.toString(id), fundType);
        id++;
    }

}
