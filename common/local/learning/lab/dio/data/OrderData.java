package local.learning.lab.dio.data;

import java.math.BigDecimal;

public record OrderData(
        String      code,
        String      productName,
        BigDecimal  price) { }
