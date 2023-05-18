package com.galvanize.gmdb.gmdb.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.gmdb.gmdb.Model.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie ,Integer>{

}