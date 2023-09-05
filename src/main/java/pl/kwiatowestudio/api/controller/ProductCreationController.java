package pl.kwiatowestudio.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.kwiatowestudio.api.dto.ProductDTO;
import pl.kwiatowestudio.api.dto.mapper.ProductMapper;
import pl.kwiatowestudio.business.ProductService;
import pl.kwiatowestudio.business.storage.StorageService;
import pl.kwiatowestudio.domain.Product;

@Controller
@AllArgsConstructor
public class ProductCreationController {

    private static final String PRODUCT_CREATION = "/tworzenie-produktu";
    private static final String PRODUCT_CREATION_ADD = "/tworzenie-produktu/dodaj";

    private final ProductMapper productMapper;
    private final ProductService productService;
    private final StorageService storageService;

    @GetMapping(value = PRODUCT_CREATION)
    public String productCreation(Model model) {
        model.addAttribute("productDTO", new ProductDTO());
        return "productCreation";
    }

    @PostMapping(value = PRODUCT_CREATION)
    public String handleFileUpload(@RequestParam("file") MultipartFile file
//                                   RedirectAttributes redirectAttributes
    ) {

        storageService.store(file);
//        redirectAttributes.addFlashAttribute("message",
//                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "redirect:%s".formatted(PRODUCT_CREATION);
    }

    @PostMapping(value = PRODUCT_CREATION_ADD)
    public String addProduct(
            @ModelAttribute("productDTO") ProductDTO dto,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "error";
        }

        Product product = productMapper.map(dto);
        productService.saveProduct(product);

        return "redirect:%s".formatted(PRODUCT_CREATION);
    }
}
