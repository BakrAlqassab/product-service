package controller;


import dto.ProductRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("api/product")

public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public void createProduct(@RequestBody ProductRequest productRequest) {


    }
}
