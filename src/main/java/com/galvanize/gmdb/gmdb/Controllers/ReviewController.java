package com.galvanize.gmdb.gmdb.Controllers;
import java.util.Optional;
import java.util.List;

import org.checkerframework.common.reflection.qual.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.gmdb.gmdb.Model.Review;
import com.galvanize.gmdb.gmdb.Repo.ReviewRepo;

import io.micrometer.core.instrument.Meter.Id;

@RestController
@RequestMapping("/review")
public class ReviewController {
    
    @Autowired
    private  ReviewRepo reviewRepo;

    @PostMapping("/post")
    public String addReview(@RequestBody Review review){
        reviewRepo.save(review);
        return "review done:  " + review.getReviewText();
    }
 
    @GetMapping("/all")
    public List<Review> getAllreviw(){
        return reviewRepo.findAll();
        // return "review done:  " + review.getReviewText();
    }

    // 2nd test case  get review by get movie id

//    @GetMapping("/{id}")
//     public List<Review> getReviewsbyMoviId(@RequestBody Review review){
//        reviewRepo.findBYMovieId()
//     }

}
