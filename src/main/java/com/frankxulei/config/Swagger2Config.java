package com.frankxulei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 《阿里巴巴Java Spring Boot 2.0开发实战课程》 完全免费 
 * 特邀讲师 徐雷 Frank Xu
 * Swagger2Config 配置类
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
						.basePackage("com.frankxulei.controllers"))
				.paths(PathSelectors.regex("/.*"))
				.build().apiInfo(apiEndPointsInfo());
	}

	private ApiInfo apiEndPointsInfo() {

		return new ApiInfoBuilder().title("阿里巴巴Java Spring Boot2.0+MyBatis+Druid+REST API +Swagger2实战课程")
				.description("阿里巴巴Java Spring Boot2.0+MyBatis+Druid+REST API +Swagger2实战课程")
				.contact(new Contact("Frank Xu", "www.alibaba.com", "frankxulei@alibaba.com"))
				.license("Apache GPL 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("1.0.0")
				.build();
	}
}
