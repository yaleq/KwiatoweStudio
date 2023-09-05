package pl.kwiatowestudio.business.storage;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class StorageProperties {

    private String location = "src/main/java/pl/kwiatowestudio/business/products-img";

}
