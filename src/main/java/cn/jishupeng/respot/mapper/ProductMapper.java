package cn.jishupeng.respot.mapper;


import cn.jishupeng.respot.domain.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Repository
public interface ProductMapper {

    @Select("select * from products")
    public abstract List<Product> findAll();

    @Select("select * from products where id=#{id}")
    Product findById(int id);

    @Delete("delete from products where id=#{id}")
    int delById(int id);
}
