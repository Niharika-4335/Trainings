package com.seleniumexpress.dl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentInfo {
    public static void main(String[] args) {
//        Student student=new Student();
//        student.setId(1);
//        student.setName("niharika");//it ensures encapsulation because we are not using variable of student class directly in another class
        //but in spring we don't need to manually create objects.

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Student anil=applicationContext.getBean("student1", Student.class);
        anil.display_info();

        Student pavan=applicationContext.getBean("student2", Student.class);
        pavan.display_info();



    }
}
