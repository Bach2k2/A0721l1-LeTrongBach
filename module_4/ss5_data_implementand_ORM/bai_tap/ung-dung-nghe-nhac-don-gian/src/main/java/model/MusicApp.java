package model;

import javax.persistence.*;

@Entity
@Table
public class MusicApp implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String url;

    public MusicApp() {
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

    public MusicApp(Long id, String name, String category, String url) {
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
    public MusicApp clone() {
        MusicApp musicApp = new MusicApp();
        musicApp.setId(id);
        musicApp.setName(name);
        musicApp.setCategory(category);
        musicApp.setUrl(url);
        return musicApp;
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
