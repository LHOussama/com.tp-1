import Metier.Calcul;
import org.junit.Assert;
import org.junit.Test;
public class calculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a,b;
        a=5;
        b=9;
        double expected=14;
        double res=calcul.some(a,b);
        Assert.assertTrue(res==expected);
    };
}
