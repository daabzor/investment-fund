package com.mateuszstaskiewicz.investmentfund.model.strategy;

import java.math.BigDecimal;
import java.util.*;

public abstract class AbstractStrategy implements Strategy {

    void isStrategyValid(List<BigDecimal> strategyPercentages) {
        if(!strategyPercentages.stream().reduce(BigDecimal::add).get().equals(new BigDecimal("1.00"))){
            throw new RuntimeException("Wrong implementation of strategy map. Sum of values in map should be equal 1");
        }
    }

}
