package com.contoh.aplikasi.aplikasipertama.service;

import org.springframework.stereotype.Service;
import com.contoh.aplikasi.aplikasipertama.model.Orang;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class OrangService {
    private List<Orang> daftarOrang = new ArrayList<>();
    private AtomicLong Counter = new AtomicLong();

    public OrangService() {
        daftarOrang.add(new Orang(Counter.incrementAndGet(), "Budi", 25));
        daftarOrang.add(new Orang(Counter.incrementAndGet(), "Siti", 30));
        daftarOrang.add(new Orang(Counter.incrementAndGet(), "Joko", 28));
    }

    public List<Orang> getAllOrang() {
        return daftarOrang;
    }

    public Optional<Orang> getOrangById(Long id) {
        return daftarOrang.stream().filter(orang -> orang.getId().equals(id)).findFirst();
    }

    public Orang addOrang(Orang orang) {
        orang.setId(Counter.incrementAndGet());
        daftarOrang.add(orang);
        return orang;
    }

    public Optional<Orang> updateOrang(Long id, Orang orangBaru) {
        return getOrangById(id).map(existingOrang -> {
            existingOrang.setNama(orangBaru.getNama());
            existingOrang.setUmur(orangBaru.getUmur());
            return existingOrang;
        });
    }

    public boolean deleteOrang(Long id) {
        return daftarOrang.removeIf(orang -> orang.getId().equals(id));
    }
}
