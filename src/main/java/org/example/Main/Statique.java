package org.example.Main;
import Dao.IDao;
import Dao.Impdao;
import Metier.Impmetier;
public class Statique {
    public static void main(String[] args) {
        Impmetier metier=new Impmetier();
        IDao dao=new Impdao();
        metier.setDao(dao);
        System.out.println(metier.calcule());
    }
}
