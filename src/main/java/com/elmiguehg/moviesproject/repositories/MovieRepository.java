package com.elmiguehg.moviesproject.repositories;

import com.elmiguehg.moviesproject.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}
