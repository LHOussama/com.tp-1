package Metier;
import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class Impmetier implements IMetier{
    @Autowired()
    private IDao dao;
    @Override
    public double calcule() {
        double data=dao.getData();
        return 5*data;
    }
    public IDao getDao() {
        return dao;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public Impmetier(IDao dao) {
        this.dao = dao;
    }
    public Impmetier() {
    }
}
