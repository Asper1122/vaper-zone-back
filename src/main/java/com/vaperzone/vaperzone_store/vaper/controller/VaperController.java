package com.vaperzone.vaperzone_store.vaper.controller;

import com.vaperzone.vaperzone_store.vaper.service.VaperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vaper")
@RequiredArgsConstructor
public class VaperController {

    private final VaperService vaperService;
}
