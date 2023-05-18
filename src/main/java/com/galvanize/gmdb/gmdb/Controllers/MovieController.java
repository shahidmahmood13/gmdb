package com.galvanize.gmdb.gmdb.Controllers;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.gmdb.gmdb.Model.Movie;
import com.galvanize.gmdb.gmdb.Repo.MovieRepo;
 

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
  private MovieRepo movieRepo;

  
    @PostMapping("/post")
    public void addMovie(@RequestBody Movie movie){
       movieRepo.save(movie);
    }

// 1st user story get all movies in list

    @GetMapping("/getall")
    public List<Movie> getallMovies(){
        return movieRepo.findAll();
    }

    // 2nd test case 
    // @GetMapping("/{id}")
    // public Mo

}
