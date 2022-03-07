package model;

import javax.persistence.*;

@Entity
@Table
public class Music implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String url;

    public Music() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getUrl() {
        return url;
    }

    public Music(Long id, String name, String category, String url) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.url = url;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Music clone() {
        Music music = new Music();
        music.setId(id);
        music.setName(name);
        music.setCategory(category);
        music.setUrl(url);
        return music;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
