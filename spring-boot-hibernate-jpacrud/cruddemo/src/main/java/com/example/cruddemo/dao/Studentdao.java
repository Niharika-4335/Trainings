package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Student;

import java.util.List;

public interface Studentdao {
    //create
    public void save(Student student);

    //read
    public Student fingById(Integer id);

    public List<Student> findAll();

    public List<Student> getbylastName(String name);

    //update
    public void update(Student st);

    public void deleteRecord(Integer id);

    public int deleteAll();


}
