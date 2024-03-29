package com.nsnieto.qualitysimmit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@EnableSwagger2
@Configuration
public class SwaggerConfig {                                    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .useDefaultResponseMessages(false)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.any())
            //.apis(Predicates.not(RequestHandlerSelectors.basePackage("com.nsnieto.qualitysimmit")))
            .paths(PathSelectors.any())
            .build();
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("TEST ")
            .license("MIT")
            .licenseUrl("")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .build();
    }
}