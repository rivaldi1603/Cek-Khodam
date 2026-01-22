package com.parodi.cekkhodam.controller;

import com.parodi.cekkhodam.service.KhodamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KhodamController {

    private final KhodamService khodamService;

    public KhodamController(KhodamService khodamService) {
        this.khodamService = khodamService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/check")
    public String checkKhodam(@RequestParam("nama") String nama, Model model) {
        String khodam = khodamService.cekKhodam(nama);
        model.addAttribute("nama", nama);
        model.addAttribute("khodam", khodam);
        return "index"; // Kembali ke halaman yang sama dengan hasil
    }
}
