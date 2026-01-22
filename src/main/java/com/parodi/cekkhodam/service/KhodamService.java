package com.parodi.cekkhodam.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class KhodamService {

    private final List<String> khodamList = new ArrayList<>();

    public KhodamService() {
        // Daftar Khodam Lucu, Nyeleneh, dan Kekinian (50+ Entries)
        khodamList.add("Harimau Suka Rebahan");
        khodamList.add("Kulkas 2 Pintu");
        khodamList.add("Naga Sakit Pinggang");
        khodamList.add("Tuyul Part Time");
        khodamList.add("Pocong Keseleo");
        khodamList.add("Genderuwo Introvert");
        khodamList.add("Kunti Bogel");
        khodamList.add("Sapu Lidi Legend");
        khodamList.add("Bakwan Gosong");
        khodamList.add("Sendal Jepit Putus");
        khodamList.add("Cicak Kejepit Pintu");
        khodamList.add("Kucing Oyen Barbar");
        khodamList.add("Seblak Ceker Pedas");
        khodamList.add("Magic Com Rusak");
        khodamList.add("Ban Dalem Bocor");
        khodamList.add("Kucing Oren Pajero");
        khodamList.add("Seringai Token Listrik Bunyi");
        khodamList.add("Jin Wibu Bau Bawang");
        khodamList.add("Tahu Bulat Dadakan");
        khodamList.add("Kerupuk Kaleng Khong Guan");
        khodamList.add("Lontong Balap Kehabisan Bensin");
        khodamList.add("Vario Geber-Geber");
        khodamList.add("Mio Mirza");
        khodamList.add("Beat Karbu Racing");
        khodamList.add("Supra Bapak Geter");
        khodamList.add("Galon Aqua Kosong");
        khodamList.add("Charger HP Minta Digoyang");
        khodamList.add("Headset Sebelah Mati");
        khodamList.add("Tikus Kantor Dasi Kupu-Kupu");
        khodamList.add("Kecoa Terbang Mode Tempur");
        khodamList.add("Nyamuk Demam Berdarah");
        khodamList.add("Laba-laba Spiderman KW");
        khodamList.add("Ultraman Kehabisan Baterai");
        khodamList.add("Power Rangers Pink Pensiun");
        khodamList.add("Kamen Rider Belum Lunas Cicilan");
        khodamList.add("Godzilla Kena Encok");
        khodamList.add("Dinosaurus T-Rex Tangan Pendek");
        khodamList.add("Ayam Kampus Semester 14");
        khodamList.add("Bebek Goreng Haji Slamet");
        khodamList.add("Lele Terbang Indosiar");
        khodamList.add("Buaya Darat Insyaf");
        khodamList.add("Ular Kobra Lagi Sariawan");
        khodamList.add("Kudanil Senam Aerobik");
        khodamList.add("Gajah Duduk Warung Kopi");
        khodamList.add("Jerapah Leher Pendek");
        khodamList.add("Singa Laut Masuk Angin");
        khodamList.add("Pinguin Nyasar ke Bekasi");
        khodamList.add("Beruang Kutub Makan Seblak");
        khodamList.add("Panda Mata Panda (Kurang Tidur)");
        khodamList.add("Koala Malas Ngapa-ngapain");
        khodamList.add("Kanguru Tinju Masuk UGD");
        khodamList.add("Musang King Durian Runtuh");
        khodamList.add("Wombat Kotak Ajaib");
        khodamList.add("Platypus Bingung Identitas");
        khodamList.add("Capybara Masbro Santuy");
    }

    public String cekKhodam(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            return "Khodam Error (Nama Kosong!)";
        }

        // Logika Deterministik: Menggunakan HashCode
        // Agar nama yang sama selalu menghasilkan khodam yang sama
        int hash = Math.abs(nama.trim().toLowerCase().hashCode());
        int index = hash % khodamList.size();

        return khodamList.get(index);
    }

    // Optional: Tambah deskripsi lucu nanti
}
