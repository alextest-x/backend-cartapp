package com.andres.backend.cartapp.backendcartapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.andres.backend.cartapp.backendcartapp.services.ProductService;
import com.andres.backend.cartapp.backendcartapp.models.entities.Product;

//regresa una api Json o xml
//@RequestMapping("/api") //establece una ruta base  http://localhost:8080/api/products

@RestController
@CrossOrigin(origins = "http://localhost:5173") //ponemos la front react
public class ProductController {



    /*
        inyectamos el tipo mas generico posible por eso usamos la interface del service luego busca mediante
        el components Scann de spring que implementacion concreta implementa dicha interface
        y la pasa o inyecta al atributo (que es del tipo inteface)


     */

    @Autowired
    private ProductService service;

    /*
      usamos el getMapping ya que es una peticion o request del tipo o metodo GET
      para leer o recuperar datos
      La peticion GET solicita una representaion de un recurso en este caso JSon
      las peticiones que usan el metodo GET solo deben recuperar datos

      el endpoint es /products
     */

    @GetMapping("/products")
    public List<Product> list() {
        return service.findAll();
    }
}
