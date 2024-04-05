package com.andres.backend.cartapp.backendcartapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andres.backend.cartapp.backendcartapp.repositories.ProductRepository;
import com.andres.backend.cartapp.backendcartapp.models.entities.Product;

//anotar el componente de spring
@Service
public class ProductServiceImpl implements ProductService {

    //inyectando ProductRepository @Autowired
    @Autowired
    private ProductRepository repository;



    /*
      el findAll() regresa un ieterable hay que pasarlo a una lista con un cast
      @Transactional para transaciones en la base de datos con commit y rollback
      ademas de mantener la conexion abierta dentro del metodo del service y realiza
      el flush para sincronizar los datos del objeto entity de jpa
      con los registros de la tabla de BBDD.
     */
    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }
}
