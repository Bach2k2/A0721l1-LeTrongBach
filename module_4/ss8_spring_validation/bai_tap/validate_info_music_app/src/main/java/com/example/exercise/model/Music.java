package com.example.exercise.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="musics")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Max(800)
    @Pattern(regexp= "^[A-Z0-9a-z]+$",message = "Khong co ky tu dac biet")
    private String name;

    @NotEmpty
    @Max(300)
    @Pattern(regexp= "^[A-Z0-9a-z]+$",message = "Khong co ky tu dac biet")
    private String singer;

    @NotEmpty
    @Max(1000)
    @@Pattern(regexp= "^[A-Z0-9a-z,]+$",message = "Khong co ky tu dac biet")
    private String category;

}
