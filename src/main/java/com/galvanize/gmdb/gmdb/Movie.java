package com.galvanize.gmdb.gmdb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter 
@Setter
@Entity
@Table(name="tbmovie")
public class Movie {
    @Id
    private Integer id;
    private  String title;
    private Integer year;
    private String genre;
    private String runtime;
    
}
