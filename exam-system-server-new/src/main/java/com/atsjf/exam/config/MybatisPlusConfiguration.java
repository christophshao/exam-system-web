package com.atsjf.exam.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * projectName: com.atsjf.exam.config
 *
 * @author: 19217
 * description:
 */
@Configuration
@MapperScan("com.atsjf.exam.mapper")
public class MybatisPlusConfiguration {

}