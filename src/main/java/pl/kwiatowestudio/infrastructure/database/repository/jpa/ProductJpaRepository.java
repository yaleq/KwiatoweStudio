package pl.kwiatowestudio.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kwiatowestudio.infrastructure.database.entity.ProductEntity;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Integer> {

}
