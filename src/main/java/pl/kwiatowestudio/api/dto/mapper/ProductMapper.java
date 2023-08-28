package pl.kwiatowestudio.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.kwiatowestudio.api.dto.ProductDTO;
import pl.kwiatowestudio.domain.Product;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    Product map(ProductDTO productDTO);
}
