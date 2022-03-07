package com.module.service.impl;

import com.module.model.Music;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;
import com.module.service.MusicAppService;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

@Service
public class HibernateMusicAppServiceImpl implements MusicAppService {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    @Override
    public List<Music> findAll() {
        String queryStr = "SELECT m FROM Music AS m";
        TypedQuery<Music> query = entityManager.createQuery(queryStr, Music.class);
        return query.getResultList();
    }

    @Override
    public Music findOne(Long id) {
        String queryStr = "SELECT m FROM Music  AS m WHERE m.id = :id";
        TypedQuery<Music> query = entityManager.createQuery(queryStr, Music.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public Music save(Music music) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Music origin = findOne(music.getId());
            origin.setName(music.getName());
            origin.setCategory(music.getCategory());
            origin.setUrl(music.getUrl());
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
    public List<Music> save(List<Music> music) {
        return null;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<Music> findAll(List<Long> ids) {
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
    public void delete(Music music) {
    }

    @Override
    public void delete(List<Music> music) {
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
