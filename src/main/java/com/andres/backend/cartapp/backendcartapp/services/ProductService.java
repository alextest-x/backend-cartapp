package com.andres.backend.cartapp.backendcartapp.services;

import java.util.List;
import com.andres.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {

    //la firma del metodo
    List<Product> findAll();
}
