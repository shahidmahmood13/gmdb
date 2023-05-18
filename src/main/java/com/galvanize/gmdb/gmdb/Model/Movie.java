package com.galvanize.gmdb.gmdb.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

// import org.hibernate.mapping.List;
import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@
@Setter
@Getter
@Entity
@Table(name="movies")
public class Movie {
    public Movie(String string) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Long movieId;
    private String title;
    private Integer year;
    private String genre;
    private String runtime;

    @JsonIgnore 
    @OneToMany(mappedBy = "movie" ,cascade =  CascadeType.ALL)
    private List<Review> reviews;

    
}
