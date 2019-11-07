

package com.sym;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
public class SymMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SymMarketApplication.class, args);
	}


//	@Bean
//	public Connector httpConnector() {
//		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		connector.setScheme("http");
//		//监听http的端口号
//		connector.setPort(80);
//		connector.setSecure(false);
//		//监听到http的端口号后转向到的https的端口号
//		System.out.println("监听到了80端口");
//		connector.setRedirectPort(443);//这里的端口写成和配置文件一样的端口就Ok
//		return connector;
//	}

}