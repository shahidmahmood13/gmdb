package com.galvanize.gmdb.gmdb.Model;
import java.sql.Date;
import java.util.List;

// import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter

public class Reviewer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "reviewer_id")
private Long reviewerId;
private String username;
private Date date_join;
private int no_of_review;

@OneToMany(mappedBy = "reviewer", cascade =  CascadeType.ALL)
private List<Review> review;

}
