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

    @NotEmpty(message = "Tên bài hát đang để bỏ trống")
    @Max(value = 800,message = "Tên bài hát vượt quá độ dài quy định")
    @Pattern(regexp= "^[A-Z0-9a-z]+$",message = "Khong co ky tu dac biet")
    private String name;

    @NotEmpty(message ="Tên ca sĩ đang để trống" )
    @Max(value = 300,message = "Tên ca sĩ vượt quá độ dài quy định ")
    @Pattern(regexp= "^[A-Z0-9a-z]+$",message = "Khong co ky tu dac biet")
    private String singer;

    @NotEmpty(message = "Thể loại đang để trống")
    @Max(value = 1000,message = "Thể loại vượt quá giá trị quy định")
    @Pattern(regexp= "^[A-Z0-9a-z,]+$",message = "Khong co ky tu dac biet")
    private String category;

    public Music() {
    }

    public Music(Long id, @NotEmpty(message = "Tên bài hát đang để bỏ trống") @Max(value = 800, message = "Tên bài hát vượt quá độ dài quy định") @Pattern(regexp = "^[A-Z0-9a-z]+$", message = "Khong co ky tu dac biet") String name, @NotEmpty(message = "Tên ca sĩ đang để trống") @Max(value = 300, message = "Tên ca sĩ vượt quá độ dài quy định ") @Pattern(regexp = "^[A-Z0-9a-z]+$", message = "Khong co ky tu dac biet") String singer, @NotEmpty(message = "Thể loại đang để trống") @Max(value = 1000, message = "Thể loại vượt quá giá trị quy định") @Pattern(regexp = "^[A-Z0-9a-z,]+$", message = "Khong co ky tu dac biet") String category) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.category = category;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
