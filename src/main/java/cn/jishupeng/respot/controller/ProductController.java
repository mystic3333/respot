package cn.jishupeng.respot.controller;

import cn.jishupeng.respot.domain.Product;
import cn.jishupeng.respot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/all")
    public List<Product> all() {
        return productService.findAll();
    }

    @GetMapping("/findById")
    public Product findById(@RequestParam("id") Integer id) {
        return productService.findById(id);
    }

    @GetMapping("/delById")
    public int delById(@RequestParam("id") Integer id) {
        return productService.delById(id);
    }


}
