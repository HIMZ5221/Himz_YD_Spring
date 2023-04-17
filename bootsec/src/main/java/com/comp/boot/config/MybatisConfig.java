package com.comp.boot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.comp.boot.**.mapper")
public class MybatisConfig {

}
