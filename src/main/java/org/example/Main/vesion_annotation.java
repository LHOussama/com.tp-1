package org.example.Main;
import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class vesion_annotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("Dao","Metier");
        IMetier metier=(IMetier) applicationContext.getBean("metier");
        System.out.println("version spring");
        System.out.println(metier.calcule());
    }
}
