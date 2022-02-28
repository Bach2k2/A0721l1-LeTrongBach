package service.impl;

import model.MusicApp;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import service.MusicAppService;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

@Service
public class HibernateMusicAppServiceImpl implements MusicAppService {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    @Override
    public List<MusicApp> findAll() {
        String queryStr = "SELECT m FROM MusicApp AS m";
        TypedQuery<MusicApp> query = entityManager.createQuery(queryStr, MusicApp.class);
        return query.getResultList();
    }

    @Override
    public MusicApp findOne(Long id) {
        String queryStr = "SELECT c FROM MusicApp AS c WHERE c.id = :id";
        TypedQuery<MusicApp> query = entityManager.createQuery(queryStr, MusicApp.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public MusicApp save(MusicApp musicApp) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            MusicApp origin = findOne(musicApp.getId());
            origin.setName(musicApp.getName());
            origin.setCategory(musicApp.getCategory());
            origin.setUrl(musicApp.getUrl());
            session.saveOrUpdate(origin);
            transaction.commit();
            return origin;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;
    }

    @Override
    public List<MusicApp> save(List<MusicApp> musicApps) {
        return null;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<MusicApp> findAll(List<Long> ids) {
        return Collections.emptyList();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public void delete(MusicApp customer) {
    }

    @Override
    public void delete(List<MusicApp> musicApps) {
    }

    @Override
    public void deleteAll() {
    }
    static {
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
