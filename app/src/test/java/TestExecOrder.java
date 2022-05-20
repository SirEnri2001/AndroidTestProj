import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestExecOrder {
    @Test
    public void testD(){
        System.out.println("DDDDD");

    }

    @Test
    public void testA(){
        System.out.println("AAAAA");
    }

    @Test
    public void testB(){
        System.out.println("BBBBB");
        Assert.assertSame(Integer.valueOf(10),Integer.valueOf(10));

    }

    @Test
    public void testC(){
        System.out.println("CCCCC");
        Assert.assertSame(Integer.valueOf(10000),Integer.valueOf(10000));
    }
}
