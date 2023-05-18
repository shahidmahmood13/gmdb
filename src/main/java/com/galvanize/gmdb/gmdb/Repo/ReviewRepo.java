package com.galvanize.gmdb.gmdb.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.gmdb.gmdb.Model.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {

    
    
}
