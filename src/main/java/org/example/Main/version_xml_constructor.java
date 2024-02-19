package org.example.Main;
import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class version_xml_constructor {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("configv1.xml");
        IMetier metier=(IMetier) applicationContext.getBean("metier");
        System.out.println("injection par constructeur");
        System.out.println(metier.calcule());

    }

}
