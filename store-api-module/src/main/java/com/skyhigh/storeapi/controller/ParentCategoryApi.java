/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.skyhigh.storeapi.controller;

import com.skyhigh.storeapi.model.dto.ParentCategoryDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Validated
@Tag(name = "parentCategory", description = "Everything about Parent Category")
public interface ParentCategoryApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /parentCategory : Add a new Parent Category to the app
     * Add a new Parent Category to the app
     *
     * @param parentCategoryDto Create a new Parent Category to the app (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "addParentCategory",
        summary = "Add a new Parent Category to the app",
        tags = { "parentCategory" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ParentCategoryDto.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ParentCategoryDto.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        },
        security = {
            @SecurityRequirement(name = "store_auth", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/parentCategory",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<ParentCategoryDto> addParentCategory(
        @Parameter(name = "ParentCategoryDto", description = "Create a new Parent Category to the app", required = true) @Valid @RequestBody ParentCategoryDto parentCategoryDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrl\" : \"Lubricants\", \"name\" : \"Lubricants\", \"parentCategoryId\" : 10, \"status\" : \"ACTIVE\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<ParentCategoryDto> <parentCategoryId>10</parentCategoryId> <name>Lubricants</name> <photoUrl>Lubricants</photoUrl> <status>aeiou</status> </ParentCategoryDto>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /parentCategory/{parentCategoryId} : Deletes a parent category
     * delete a parent category
     *
     * @param parentCategoryId Parent category id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid parent category value (status code 400)
     */
    @Operation(
        operationId = "deleteParentCategory",
        summary = "Deletes a parent category",
        tags = { "parentCategory" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid parent category value")
        },
        security = {
            @SecurityRequirement(name = "store_auth", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/parentCategory/{parentCategoryId}"
    )
    default ResponseEntity<Void> deleteParentCategory(
        @Parameter(name = "parentCategoryId", description = "Parent category id to delete", required = true) @PathVariable("parentCategoryId") Long parentCategoryId,
        @Parameter(name = "api_key", description = "") @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /parentCategory/findByStatus : Finds Parent Categorys by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (optional, default to ACTIVE)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */
    @Operation(
        operationId = "findParentCategoryByStatus",
        summary = "Finds Parent Categorys by status",
        tags = { "parentCategory" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ParentCategoryDto.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ParentCategoryDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid status value")
        },
        security = {
            @SecurityRequirement(name = "store_auth", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/parentCategory/findByStatus",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<List<ParentCategoryDto>> findParentCategoryByStatus(
        @Parameter(name = "status", description = "Status values that need to be considered for filter") @Valid @RequestParam(value = "status", required = false, defaultValue = "ACTIVE") String status
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrl\" : \"Lubricants\", \"name\" : \"Lubricants\", \"parentCategoryId\" : 10, \"status\" : \"ACTIVE\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<ParentCategoryDto> <parentCategoryId>10</parentCategoryId> <name>Lubricants</name> <photoUrl>Lubricants</photoUrl> <status>aeiou</status> </ParentCategoryDto>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /parentCategory/{parentCategoryId} : Find Parent Category by ID
     * Returns a single Parent Category
     *
     * @param parentCategoryId ID of Parent Category to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Parent Category not found (status code 404)
     */
    @Operation(
        operationId = "getParentCategoryById",
        summary = "Find Parent Category by ID",
        tags = { "parentCategory" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ParentCategoryDto.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ParentCategoryDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Parent Category not found")
        },
        security = {
            @SecurityRequirement(name = "api_key"),
            @SecurityRequirement(name = "store_auth", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/parentCategory/{parentCategoryId}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<ParentCategoryDto> getParentCategoryById(
        @Parameter(name = "parentCategoryId", description = "ID of Parent Category to return", required = true) @PathVariable("parentCategoryId") Long parentCategoryId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrl\" : \"Lubricants\", \"name\" : \"Lubricants\", \"parentCategoryId\" : 10, \"status\" : \"ACTIVE\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<ParentCategoryDto> <parentCategoryId>10</parentCategoryId> <name>Lubricants</name> <photoUrl>Lubricants</photoUrl> <status>aeiou</status> </ParentCategoryDto>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /parentCategory : Update an existing Parent Category
     * Update an existing Parent Category by Id
     *
     * @param parentCategoryDto Update an existent Parent Category in the app (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Parent Category not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateParentCategory",
        summary = "Update an existing Parent Category",
        tags = { "parentCategory" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ParentCategoryDto.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ParentCategoryDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Parent Category not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        },
        security = {
            @SecurityRequirement(name = "store_auth", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/parentCategory",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<ParentCategoryDto> updateParentCategory(
        @Parameter(name = "ParentCategoryDto", description = "Update an existent Parent Category in the app", required = true) @Valid @RequestBody ParentCategoryDto parentCategoryDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrl\" : \"Lubricants\", \"name\" : \"Lubricants\", \"parentCategoryId\" : 10, \"status\" : \"ACTIVE\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<ParentCategoryDto> <parentCategoryId>10</parentCategoryId> <name>Lubricants</name> <photoUrl>Lubricants</photoUrl> <status>aeiou</status> </ParentCategoryDto>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /parentCategory/{parentCategoryId} : Updates a parent category in the app with form data
     * 
     *
     * @param parentCategoryId ID of Parent Category to return (required)
     * @param name Name of parent category that needs to be updated (optional)
     * @param status Status of parent category that needs to be updated (optional)
     * @return Invalid input (status code 405)
     */
    @Operation(
        operationId = "updateParentCategoryWithForm",
        summary = "Updates a parent category in the app with form data",
        tags = { "parentCategory" },
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        },
        security = {
            @SecurityRequirement(name = "store_auth", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/parentCategory/{parentCategoryId}"
    )
    default ResponseEntity<Void> updateParentCategoryWithForm(
        @Parameter(name = "parentCategoryId", description = "ID of Parent Category to return", required = true) @PathVariable("parentCategoryId") Long parentCategoryId,
        @Parameter(name = "name", description = "Name of parent category that needs to be updated") @Valid @RequestParam(value = "name", required = false) String name,
        @Parameter(name = "status", description = "Status of parent category that needs to be updated") @Valid @RequestParam(value = "status", required = false) String status
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
