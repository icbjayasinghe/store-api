package com.skyhigh.storeapi.util;

import com.skyhigh.storeapi.model.Product;
import com.skyhigh.storeapi.model.dto.SkuDto;
import org.springframework.stereotype.Service;

@Service
public class SkuNameCreatorUtil {
    public String concatProductName(Product product, String suffix) {
        String name = String.join(" - ",
                product.getProductBrand().getBrandName(),
                product.getCategory().getCategoryName(),
                product.getProductName(),
                suffix);
        return name;
    }
}
