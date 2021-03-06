package com.mateuszstaskiewicz.investmentfund.model.statics;

import lombok.Data;

@Data
public abstract class InvestmentFund {

    private static Long generalIdCounter;

    private Long generalId;

    private Long id;

    private String name;

    private FundType fundType;

    static {
        generalIdCounter = 1L;
    }

    public InvestmentFund(final Long id, final String name, final FundType fundType) {
        this.id = id;
        this.name = name;
        this.fundType = fundType;
        this.generalId = generalIdCounter;
        generalIdCounter++;
    }

}

