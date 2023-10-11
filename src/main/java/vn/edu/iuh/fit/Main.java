package vn.edu.iuh.fit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.edu.iuh.fit.collectionInjection.Person;
import vn.edu.iuh.fit.objectInjection.Class_;
import vn.edu.iuh.fit.objectInjection.Student_;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("teo.xml");
//        Student student = ctx.getBean("t1", Student.class);
//        System.out.println(student);
// Object Injection
//        ApplicationContext context = new ClassPathXmlApplicationContext("objectInjection.xml");
//        Student_ student_ = context.getBean("st1",Student_.class);
//        System.out.println(student_);
//        System.out.println("Lớp: "+ student_.getClass_().getClassName());
//Object Injection by Construction
//        ApplicationContext context = new ClassPathXmlApplicationContext("objectInjection.xml");
//        Student_ student_ = context.getBean("st2",Student_.class);
//        System.out.println(student_);
//        System.out.println("Lớp: "+ student_.getClass_().getClassName());

//Collection Injection
//        ApplicationContext context = new ClassPathXmlApplicationContext("collectionInjection.xml");
//        Person person = context.getBean("person",Person.class);
//        System.out.println(person);
//Literal Values Injection
        ApplicationContext context = new ClassPathXmlApplicationContext("literalValuesInjection.xml");
        Class_ class_ = context.getBean("lop",Class_.class);
        System.out.println(class_.getClassId()+"_"+class_.getClassName());

    }
}