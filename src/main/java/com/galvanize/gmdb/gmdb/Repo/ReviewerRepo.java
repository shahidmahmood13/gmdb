package com.galvanize.gmdb.gmdb.Repo;

// import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.gmdb.gmdb.Model.Review;
import com.galvanize.gmdb.gmdb.Model.Reviewer;
import java.util.List;


@Repository
public interface ReviewerRepo   extends JpaRepository<Reviewer, Integer> {
//   public Review review;

//   List<Review> findBYMovieId(Integer movie);
   


    
}
