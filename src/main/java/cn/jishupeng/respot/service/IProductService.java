package cn.jishupeng.respot.service;

import cn.jishupeng.respot.domain.Product;

import java.util.List;

public interface IProductService {
    public abstract List<Product> findAll();
    Product findById(int id);
    int delById(int id);
}
