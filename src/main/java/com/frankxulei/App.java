package com.frankxulei;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 《阿里巴巴Java Spring Boot 2.0开发实战课程》 完全免费 
 * 特邀讲师 徐雷 Frank Xu
 * 第1课：Spring Boot2.0新特性和入门实战,https://yq.aliyun.com/live/583  
 * 第2课：Spring Boot2.0开发MVC网站并显示图片,https://yq.aliyun.com/live/592
 * 第3课：Spring Boot2.0实战MySQL和3个高级面试题，https://yq.aliyun.com/live/612
 * 第4课：Spring Boot2.0实战MVC用户登录和注册和Java面试题https://yq.aliyun.com/live/644
 * 第5课：Spring Boot2.0实战三层MVC架构实战与架构分层误区(Java面试题)https://yq.aliyun.com/live/655
 * 第6课：Spring Boot2.0实战MyBatis与优化(Java面试题)https://yq.aliyun.com/live/687
 * 第7课：Spring Boot2.0安全机制、漏洞与MVC身份验证实战(Java面试题) https://yq.aliyun.com/live/712
 * 第8课：Spring Boot2.0自动化配置机制解析(Java面试题) 课件 PPT下载 https://yq.aliyun.com/live/729
 * 第9课：Spring Boot2.0实战MongoDB4.0(MongoDB面试题) https://yq.aliyun.com/live/782
 * 第10课：Spring Boot2.0实战高并发缓存Redis面试题) https://yq.aliyun.com/live/791
 * 第11课：Spring Boot2.0实战RabbitMQ中间件与API原理解析 https://yq.aliyun.com/live/806
 * 第12课：Spring Boot2.0性能监控实战与Actuator机制解析 https://yq.aliyun.com/live/815
 * 第13课：Spring Boot2.0性能监控实战ElasticSearch搜索引擎中间件 https://yq.aliyun.com/live/844
 * 第14课：Spring Boot 2.0实战MyBatis连接池阿里Druid与SQL性能监控  https://yq.aliyun.com/live/855
 * 第15课：Spring Boot 2.0实战REST API帮助文档Swagger2  https://yq.aliyun.com/live/859
 * 第16课：Spring Boot 2.0实战Docker容器  https://yq.aliyun.com/live/859
 * 阿里巴巴Java专家问答专场  学Java 跳槽去阿里 https://yq.aliyun.com/activity/759
 */
@SpringBootApplication
public class App implements CommandLineRunner {
 
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("阿里巴巴Java Spring Boot2.0+REST API +Swagger2实战课程");
	}
}
