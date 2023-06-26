/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.prices.openapi.interfaces.rest;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import com.example.prices.interfaces.rest.dtos.PriceResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
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
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-26T12:38:25.695626100+02:00[Europe/Madrid]")
@Validated
@Tag(name = "consulta-precios", description = "the consulta-precios API")
public interface ConsultaPreciosApi {

    /**
     * GET /consulta-precios : Consultar precios
     *
     * @param applicationDate Fecha de aplicación (required)
     * @param productId Identificador del producto (required)
     * @param brandId Identificador de la cadena (required)
     * @return Respuesta exitosa (status code 200)
     */
    @Operation(
        operationId = "searchPrices",
        summary = "Consultar precios",
        tags = { "prices" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Respuesta exitosa", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  PriceResponse.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/consulta-precios",
        produces = { "application/json" }
    )
    ResponseEntity<PriceResponse> searchPrices(
        @NotNull @Parameter(name = "applicationDate", description = "Fecha de aplicación", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "applicationDate", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate applicationDate,
        @NotNull @Parameter(name = "productId", description = "Identificador del producto", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "productId", required = true) Integer productId,
        @NotNull @Parameter(name = "brandId", description = "Identificador de la cadena", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "brandId", required = true) Integer brandId
    );

}