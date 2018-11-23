package com.mateuszstaskiewicz.investmentfund.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public abstract class Investment {

    private InvestmentType investmentType;

}
