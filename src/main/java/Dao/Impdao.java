package Dao;
import org.springframework.stereotype.Component;
@Component("dao")
public class Impdao implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de données");
        return 100.25;
    }
}
