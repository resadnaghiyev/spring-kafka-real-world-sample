package com.rashad.kafkaconsumer.repository;

import com.rashad.kafkaconsumer.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
