package service;

import model.MusicApp;

import java.util.List;

public interface MusicAppService {
    List<MusicApp> findAll();

    MusicApp findOne(Long id);

    MusicApp save(MusicApp musicApp);

    List<MusicApp> save(List<MusicApp> musicApps);

    boolean exists(Long id);

    List<MusicApp> findAll(List<Long> ids);

    long count();

    void delete(Long id);

    void delete(MusicApp musicApp);

    void delete(List<MusicApp> musicApps);

    void deleteAll();

}
