package pe.edu.cibertec.t1feigngrupo4.model;

import lombok.Data;

@Data
public class ProductStoreDto {

    private Integer id;
    private String title;
    private Double price;
    private String category;
}