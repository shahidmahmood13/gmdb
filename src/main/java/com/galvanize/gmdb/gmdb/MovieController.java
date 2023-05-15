package com.galvanize.gmdb.gmdb;

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
 

@RestController
@RequestMapping("/movie")
public class MovieController {
  private  JdbcTemplate jdbc;
    @Autowired
     private MovieRepo movieRepo;
  
    @PostMapping("/post")
    public void addMovie(@RequestBody Movie movie){
       movieRepo.save(movie);
    }

    @GetMapping("/all")
    public List<Movie> getallMovies(){
        return movieRepo.findAll();

    }







}
