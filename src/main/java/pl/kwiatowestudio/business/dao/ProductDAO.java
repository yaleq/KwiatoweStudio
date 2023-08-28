package pl.kwiatowestudio.business.dao;

import pl.kwiatowestudio.domain.Product;
import pl.kwiatowestudio.infrastructure.database.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity saveProduct(Product product);
}
