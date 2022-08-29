package com.amigoscode.testing.payment;

import java.math.BigDecimal;

public interface CardPaymentCharger {

    CardPaymentCharge chargeCard(BigDecimal amount, Currency currency, String cardSource, String description);
}
