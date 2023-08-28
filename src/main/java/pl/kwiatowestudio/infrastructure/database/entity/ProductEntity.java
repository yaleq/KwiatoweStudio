package pl.kwiatowestudio.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer productId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name="price")
    private BigDecimal price;

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="attachmentId")
//    private String attachmentId;
}
