package com.seleniumexpress.dl;

public class Student {
    private Integer id;
    private String name;

    public Student(Integer id) {
        this.id = id;
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //    public void setId(Integer id) {
//        this.id = id;
//        System.out.println("injected id");
//    }
//
//    public void setName(String name) {
//        this.name = name;
//        System.out.println("injected name");
//    }


    public void display_info(){
        System.out.println("student with  id "+ id +" has name "+ name);
    }

}
