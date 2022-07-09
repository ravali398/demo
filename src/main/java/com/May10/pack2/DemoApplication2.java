package com.May10.pack2;


	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	import springfox.documentation.swagger2.annotations.EnableSwagger2;

	@SpringBootApplication
	@EnableSwagger2
	public class DemoApplication2 {

		public static void main(String[] args) {
			SpringApplication.run(DemoApplication2.class, args);
		}

	}


