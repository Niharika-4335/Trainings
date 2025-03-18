package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Daoi implements Dao {
    private EntityManager entityManager;


    //    @Autowired
    public Daoi(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student fingById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> tq = entityManager.createQuery("from Student order by last_name desc", Student.class);
        return tq.getResultList();
    }

    @Override
    public List<Student> getbylastName(String name) {
        TypedQuery<Student> tq1 = entityManager.createQuery("from Student where last_name=:data", Student.class);
        tq1.setParameter("data", name);
        return tq1.getResultList();
    }

    @Override
    @Transactional
    public void update(Student st) {
        entityManager.merge(st);
    }

    @Override
    @Transactional
    public void deleteRecord(Integer id) {
        Student st=entityManager.find(Student.class,id);
        entityManager.remove(st);
    }
}
