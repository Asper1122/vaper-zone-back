package com.vaperzone.vaperzone_store.vaper.service;

import com.vaperzone.vaperzone_store.vaper.repository.VaperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class VaperServiceImpl {

    private final VaperRepository vaperRepository;
}
