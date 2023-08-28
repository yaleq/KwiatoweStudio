package pl.kwiatowestudio.domain;

import lombok.*;

import java.math.BigDecimal;

@With
@Value
@Builder
public class Product {
    String name;
    String description;
    BigDecimal price;
//    String attachmentId;
}
