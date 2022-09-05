package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
   private String name;
   @ManyToMany
   private List<Actor> actors;
   @ElementCollection
   @Enumerated(EnumType.STRING)
   private List<Language>languages;
   private int length;
   private double rating;
   @ElementCollection
   @Enumerated(EnumType.STRING)
   private List<MovieFeature>movieFeatures;
}
