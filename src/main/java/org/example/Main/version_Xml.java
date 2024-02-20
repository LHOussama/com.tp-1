package org.example.Main;
import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class version_Xml {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("configue.xml");
        IMetier metier=(IMetier) applicationContext.getBean("metier");
        System.out.println(metier.calcule());
    }
}
