package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.bigDecimal;

import org.springframework.data.annotation.Id;
import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data


public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private String price;
}
