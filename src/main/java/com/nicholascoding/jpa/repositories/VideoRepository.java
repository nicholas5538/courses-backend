package com.nicholascoding.jpa.repositories;

import com.nicholascoding.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
