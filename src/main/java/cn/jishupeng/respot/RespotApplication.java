package cn.jishupeng.respot;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "cn.jishupeng.respot.mapper")
@SpringBootApplication
public class RespotApplication {

    public static void main(String[] args) {
        SpringApplication.run(RespotApplication.class, args);
    }

}
