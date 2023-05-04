package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.ParentCategoryApi;
import com.skyhigh.storeapi.model.dto.ParentCategoryDto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.storeAPIOpenAPI30.base-path:/api/v3}")
public class ParentCategoryApiController implements ParentCategoryApi {

    private final NativeWebRequest request;

    @Autowired
    public ParentCategoryApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
