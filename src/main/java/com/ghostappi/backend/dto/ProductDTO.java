package com.ghostappi.backend.dto;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Integer idProduct;

    private String comercialName;

    private BigDecimal price;

    private Short stock;

    private Integer servingSize;

    private String unitServingSize;

    private Short servings;

    private String productRecomendation;

    private String imgProductPath;

    private Date caducity;

    private String flavor;

    private String lote;

    private String description;

    private String presentation;

    private Short netContent;

    private String unitNetContent;

    private Integer idBrand;

    private Integer idCategory;

    private Integer idAdministrationVia;

    private List<Integer> idNutrients; 

    // private List<NutrientProductDTO> nutrientProducts;
}

