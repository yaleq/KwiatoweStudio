package pl.kwiatowestudio.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.kwiatowestudio.domain.Product;
import pl.kwiatowestudio.infrastructure.database.entity.ProductEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductEntityMapper {
    Product mapFromEntity(ProductEntity entity);
    ProductEntity mapToEntity(Product product);
}
