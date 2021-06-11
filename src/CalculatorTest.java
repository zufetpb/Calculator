import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator calculator = new Calculator();
    @Before
    public void setUp() throws Exception {
        System.out.println("BeforeClass");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test(timeout = 5000)
    public void add() {
        for(int i=0; i<10; i++) {
            int num = (int) (Math.random()%100);
            int pre = calculator.getResult();
            calculator.add(num);

            Assert.assertEquals(pre+num, calculator.getResult());
        }
    }

    @Test(timeout = 5000)
    public void substract() {
        for(int i=0; i<10; i++) {
            int num = (int) (Math.random()%100);
            int pre = calculator.getResult();
            calculator.substract(num);
            Assert.assertEquals(pre-num, calculator.getResult());
        }
    }

    @Test(timeout = 5000)
    public void multiply() {
        for(int i=0; i<10; i++) {
            int num = (int) (Math.random()%100);
            int pre = calculator.getResult();
            calculator.multiply(num);
            Assert.assertEquals(pre*num, calculator.getResult());
        }
    }

    @Test(timeout = 5000)
    public void divide() {
        for(int i=0; i<10; i++) {
            int num = (int) (Math.random()%100);
            int pre = calculator.getResult();
            calculator.divide(num);
            Assert.assertEquals(pre/num, calculator.getResult());
        }
    }

    @Test(timeout = 5000)
    public void square() {
        for(int i=0; i<10; i++) {
            int num = (int) (Math.random()%100);
            calculator.square(num);
            Assert.assertEquals((int) Math.pow(num, 2), calculator.getResult());
        }
    }

    @Test(timeout = 5000)
    public void squareRoot() {
        for(int i=0; i<10; i++) {
            int num = (int) (Math.random()%100);
            calculator.squareRoot(num);
            Assert.assertEquals((int) Math.pow(num, 1.0/2.0), calculator.getResult());
        }
    }

    @Test(timeout = 5000)
    public void clear() {
        calculator.clear();
        Assert.assertEquals(0, calculator.getResult());
    }

}