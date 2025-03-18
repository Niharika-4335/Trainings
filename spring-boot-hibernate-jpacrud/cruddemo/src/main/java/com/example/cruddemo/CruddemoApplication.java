package com.example.cruddemo;

import com.example.cruddemo.dao.Studentdao;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);

    }

    @Bean()
    public CommandLineRunner commandLineRunner(Studentdao dao) {
        return runner -> {
//			createStudent(dao);

//			createmultipleStudent(dao);

//			readDetails(dao);

//			getallRecords(dao);

//			getbylastName(dao);

//          updateName(dao);

//          deleteDetails(dao);
            deleteallMembers(dao);

        };
    }

    private void deleteallMembers(Studentdao dao) {
        int count = dao.deleteAll();

    }

    private void deleteDetails(Studentdao dao) {
        int id = 3;
        dao.deleteRecord(id);

    }

    private void updateName(Studentdao dao) {
        Student st = dao.fingById(1);
        st.setLast_name("kulkarni");
        dao.update(st);
    }

    private void getbylastName(Studentdao dao) {
        List<Student> st = dao.getbylastName("shaik");
        System.out.println(st);
    }

    //performing querying operations
    private void getallRecords(Studentdao dao) {
        List<Student> list = dao.findAll();
        System.out.println(list);

    }

    private void readDetails(Studentdao dao) {
        Student stu = new Student("hussain", "shaik", "13#gmail.com");
        dao.save(stu);
        System.out.println(stu.getId());
        Student stu1 = dao.fingById(stu.getId());
        System.out.println(stu1);
    }

    //in crud-create part is completed.
    private void createmultipleStudent(Studentdao dao) {
        Student student1 = new Student("niharika", "bethapudi", "abc@gmail.com");
        Student student2 = new Student("ni", "di", "def@gmail.com");
        Student student3 = new Student("anil", "bullipati", "ghj@gmail.com");
        dao.save(student1);
        dao.save(student2);
        dao.save(student3);

    }


    private void createStudent(Studentdao dao) {
        Student student = new Student("niharika", "bethapudi", "abc@gmail.com");
        dao.save(student);
        System.out.println(student.getId());
    }


}
