package com.mateuszstaskiewicz.investmentfund.model.strategy;

import com.mateuszstaskiewicz.investmentfund.exception.WrongValuesStrategyException;

import java.math.BigDecimal;
import java.util.*;

public abstract class AbstractStrategy implements Strategy {

    void isStrategyValid(final List<BigDecimal> strategyPercentages) {
        if(!strategyPercentages.stream().reduce(BigDecimal::add).get().equals(new BigDecimal("1.00"))){
            throw new WrongValuesStrategyException("Wrong implementation of strategy map. Sum of values in map should be equal 1");
        }
    }

}
