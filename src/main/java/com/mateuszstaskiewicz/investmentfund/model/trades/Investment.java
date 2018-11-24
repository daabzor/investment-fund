package com.mateuszstaskiewicz.investmentfund.model.trades;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Investment {

    private InvestmentType investmentType;

    private BigDecimal investmentAmount;


}
