package com.example.demo.model;



import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
public class FavouritePerson {

    /*Create class FavouritePerson with (!) name; (!) address; (!) age*/
    @Getter @Setter private String personName;

    @Getter @Setter private String personAddress;

    @Getter @Setter private int personAge;
}
