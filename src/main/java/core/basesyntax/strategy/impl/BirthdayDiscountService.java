package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    private static final int SUM = 1;
    @Override
    public double getDiscount() {
        return (double) (SUM  * 0.33) * 100;
    }
}
