package cn.jishupeng.respot.service.impl;

import cn.jishupeng.respot.domain.Product;
import cn.jishupeng.respot.mapper.ProductMapper;
import cn.jishupeng.respot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public Product findById(int id) {
        return productMapper.findById(id);
    }

    @Override
    public int delById(int id) {
        return productMapper.delById(id);
    }
}
