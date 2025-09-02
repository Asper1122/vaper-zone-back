package com.vaperzone.vaperzone_store.vaper.repository;

import com.vaperzone.vaperzone_store.vaper.model.Vaper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VaperRepository extends JpaRepository<Vaper, UUID> {
}
