package com.contoh.aplikasi.aplikasipertama.controller;

import com.contoh.aplikasi.aplikasipertama.model.Orang;
import com.contoh.aplikasi.aplikasipertama.service.OrangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/orang")
public class OrangController {
    @Autowired
    private OrangService orangService;

    @GetMapping
    public List<Orang> getAllOrang() {
        return orangService.getAllOrang();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orang> getOrangById(@PathVariable Long id) {
        Optional<Orang> orang = orangService.getOrangById(id);
        return orang.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // 3. ADD NEW ORANG (CREATE)
    // URL: POST http://localhost:8080/api/v1/orang
    // @RequestBody digunakan untuk membaca data JSON dari body permintaan dan
    // mengubahnya menjadi objek Orang

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Menandakan bahwa ini akan mengembalikan status 201 Created
    public Orang addOrang(@RequestBody Orang orang) {
        return orangService.addOrang(orang);
    }

    // 4. UPDATE ORANG
    // URL: PUT http://localhost:8080/api/v1/orang/{id}
    // Menggabungkan @PathVariable dan @RequestBody

    @PutMapping("/{id}")
    public ResponseEntity<Orang> updateOrang(@PathVariable Long id, @RequestBody Orang orangBaru) {
        Optional<Orang> updatedOrang = orangService.updateOrang(id, orangBaru);
        return updatedOrang.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // 5. DELETE ORANG
    // URL: DELETE http://localhost:8080/api/v1/orang/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrang(@PathVariable Long id) {
        boolean deleted = orangService.deleteOrang(id);
        if (deleted) {
            // Mengembalikan status 204 No Content jika berhasil dihapus
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            // Mengembalikan status 404 Not Found jika ID tidak ditemukan
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
