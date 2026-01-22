package com.parodi.cekkhodam.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class KhodamService {

    private final List<String> khodamList = new ArrayList<>();

    private final List<String> warningList = new ArrayList<>();

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

        // Daftar Warning Lucu (50+ Entries)
        warningList.add("Khodam ini sensitif kalau kamu belum mandi 3 hari.");
        warningList.add("Jangan diajak ngobrol soal politik, nanti dia stress.");
        warningList.add("Suka nyuri gorengan kalau kamu lagi lengah.");
        warningList.add("Hati-hati, dia sering kentut sembarangan.");
        warningList.add("Kalau malam suka nyanyi lagu dangdut koplo volume full.");
        warningList.add("Dia trauma sama kecoa terbang, mohon dimaklumi.");
        warningList.add("Khodam ini butuh asupan kuota internet 100GB per bulan.");
        warningList.add("Jangan ditinggal sendirian, nanti dia nangis dipojokan.");
        warningList.add("Suka ngeluh kalau kamu kebanyakan scroll TikTok.");
        warningList.add("Mantan atlet e-sport tapi pensiun karena jempol cantengan.");
        warningList.add("Hati-hati dompet sering hilang, dia suka jajan diam-diam.");
        warningList.add("Dia alergi sama orang yang suka ghosting.");
        warningList.add("Suka ngasih saran investasi bodong, jangan didengerin.");
        warningList.add("Kalau marah suka gigit kabel charger.");
        warningList.add("Cita-citanya jadi selebgram tapi followers cuma 3 (termasuk kamu).");
        warningList.add("Sering ngigo 'Paket... Paket...' pas tidur.");
        warningList.add("Dia ngefans berat sama tukang bakso depan komplek.");
        warningList.add("Hobinya stalking mantan kamu.");
        warningList.add("Suka pura-pura kesurupan kalau ditagih utang.");
        warningList.add("Khodam ini vegan, tapi kalau lihat ayam goreng dia goyah.");
        warningList.add("Jangan tanya kapan nikah, dia baperan.");
        warningList.add("Dia percaya bumi itu datar sedatar dompetmu.");
        warningList.add("Suka ngilang pas dibutuhin, kayak avatar.");
        warningList.add("Sering lupa naruh kacamata padahal dipake.");
        warningList.add("Dia pikir dia naga, padahal cuma cacing kepanasan.");
        warningList.add("Suka minjem baju tapi nggak pernah dibalikin.");
        warningList.add("Kalau ketawa bunyinya 'wkwkwk' secara literal.");
        warningList.add("Dia takut sama bunyi token listrik yang mau habis.");
        warningList.add("Selalu kalah kalau main suit batu-gunting-kertas.");
        warningList.add("Pernah diusir dari neraka karena terlalu berisik.");
        warningList.add("Khodam ini bisa meramal masa lalu, bukan masa depan.");
        warningList.add("Suka ngaret kalau janjian, alasan ban bocor mulu.");
        warningList.add("Dia butuh kopi sianida... eh, kopi susu maksudnya.");
        warningList.add("Jangan kaget kalau tiba-tiba ada bau menyan campur parfum laundry.");
        warningList.add("Khodam ini mantan buaya darat, sekarang lagi tobat.");
        warningList.add("Suka baper kalau liat hujan turun.");
        warningList.add("Dia lebih jago gombal daripada kamu.");
        warningList.add("Sering salah kirim stiker WA ke grup keluarga.");
        warningList.add("Musuh bebuyutannya adalah emak-emak naik motor sein kanan belok kiri.");
        warningList.add("Dia punya phobia sama timbangan berat badan.");
        warningList.add("Suka ngaku-ngaku sultan padahal kuota aja minta tethering.");
        warningList.add("Hobi utamanya adalah overthinking di malam hari.");
        warningList.add("Dia percaya konspirasi bahwa kucing adalah alien.");
        warningList.add("Suka nyanyi di kamar mandi suara sumbang.");
        warningList.add("Kalau lapar dia berubah jadi reog.");
        warningList.add("Jangan dipaksa diet, dia nanti ngamuk.");
        warningList.add("Dia punya dendam pribadi sama tukang parkir gaib.");
        warningList.add("Sering lupa hari, dikira minggu padahal senin.");
        warningList.add("Khodam ini sebenarnya baik, cuma mukanya aja ngajak ribut.");
        warningList.add("Keberadaannya 99.9% meresahkan warga sekitar.");
        warningList.add("Dia suka spoiler film yang belum kamu tonton.");
    }

    public String cekWarning(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            return "Khodam Error (Nama Kosong!)";
        }

        // Gunakan hash yang sedikit berbeda agar kombinasi Khodam + Warning lebih
        // variatif
        // Misalnya kita kali dengan length atau tambah konstanta biar index-nya beda
        // dengan index khodam
        int hash = Math.abs((nama.trim().toLowerCase() + "warning").hashCode());
        int index = hash % warningList.size();

        return warningList.get(index);
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
