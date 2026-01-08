package com.microservice.ecommerce.inventory_service.service;

import com.microservice.ecommerce.inventory_service.dto.ProductDTO;
import com.microservice.ecommerce.inventory_service.entity.Product;
import com.microservice.ecommerce.inventory_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public List<ProductDTO> getAllInventory(){
        log.info("Fetching all inventory item");
        List<Product> inventories = productRepository.findAll();

        return inventories.stream()
                .map((element) -> modelMapper.map(element, ProductDTO.class))
                .collect(Collectors.toList());
    }
    public ProductDTO getProductById(Long id){
        log.info("Getting Product with Id: {}",id);
        return productRepository.findById(id)
                .map((element) -> modelMapper.map(element, ProductDTO.class))
                .orElseThrow(() -> new RuntimeException("Inventory not found!"));
    }

}
