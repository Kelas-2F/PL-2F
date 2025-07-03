package com.contoh.aplikasi.aplikasipertama.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaloController {
    
    @GetMapping("/halo")
    public String sapaDunia() {
        return "Halo, Selamat Datang di Aplikasi Pertama!";
    }

    @GetMapping("/")
    public String beranda() {
        return "Selamat Datang di API Spring Boot Pertama Saya  !";
    }
}
