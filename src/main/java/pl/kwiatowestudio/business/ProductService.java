package pl.kwiatowestudio.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.kwiatowestudio.business.dao.ProductDAO;
import pl.kwiatowestudio.domain.Product;
import pl.kwiatowestudio.infrastructure.database.entity.ProductEntity;

@Slf4j
@Service
@AllArgsConstructor
public class ProductService {
    private final ProductDAO productDAO;

    @Transactional
    public ProductEntity saveProduct(final Product product) {
        Product productBuild = buildProduct(product);
        return productDAO.saveProduct(productBuild);
    }

    private Product buildProduct(Product product) {

        return Product.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }

}
