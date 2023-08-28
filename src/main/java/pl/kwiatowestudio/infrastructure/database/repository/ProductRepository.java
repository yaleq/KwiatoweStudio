package pl.kwiatowestudio.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.kwiatowestudio.business.dao.ProductDAO;
import pl.kwiatowestudio.domain.Product;
import pl.kwiatowestudio.infrastructure.database.entity.ProductEntity;
import pl.kwiatowestudio.infrastructure.database.repository.jpa.ProductJpaRepository;
import pl.kwiatowestudio.infrastructure.database.repository.mapper.ProductEntityMapper;

@Repository
@AllArgsConstructor
public class ProductRepository implements ProductDAO {

    private final ProductJpaRepository productJpaRepository;
    private final ProductEntityMapper productEntityMapper;

    @Override
    public ProductEntity saveProduct(Product productBuild) {
        ProductEntity entity = productEntityMapper.mapToEntity(productBuild);
        return productJpaRepository.save(entity);
    }

}
