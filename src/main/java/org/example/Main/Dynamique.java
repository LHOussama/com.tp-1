package org.example.Main;
import Dao.IDao;
import Metier.IMetier;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Dynamique {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("configue.txt"));
        String class_metier=scanner.nextLine();
        System.out.println(class_metier);
        Class cmetier=Class.forName(class_metier);
        IMetier metier=(IMetier) cmetier.getConstructor().newInstance();
        String class_dao= scanner.nextLine();
        System.out.println(class_dao);
        Class cdao=Class.forName(class_dao);
        IDao dao=(IDao) cdao.getConstructor().newInstance();
        Method method=cmetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("dynamique "+metier.calcule());
    }
}
