package com.contoh.aplikasi.aplikasipertama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.contoh.aplikasi.aplikasipertama")
public class AplikasiPertamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplikasiPertamaApplication.class, args);
	}

}
