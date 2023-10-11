package vn.edu.iuh.fit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("teo.xml");
        Student student = ctx.getBean("t1", Student.class);
        System.out.println(student);
    }
}