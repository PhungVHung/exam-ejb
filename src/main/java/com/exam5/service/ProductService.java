package com.exam5.service;

import com.exam5.entity.Product;
import com.exam5.reponsitory.ProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class ProductService  {

        @Autowired
        ProductReponsitory productReponsitory;

        public Product create(Product product){
            return productReponsitory.save(product);
        }

        public Page<Product> getList(int page, int limit){
            return productReponsitory.findAll(PageRequest.of(page -1 , limit));
        }

        public Product getDetail(long id){
            return productReponsitory.findById(id).orElse(null);
        }
}
