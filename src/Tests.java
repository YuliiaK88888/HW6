import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void checkFirst() {
        String expected1 = "[12, 2, 4, 6, 22, 10, 100]";
        String actual1 = HW6.first().toString();

        Assert.assertArrayEquals("Your test was failed", new String[]{expected1}, new String[]{actual1});
    }

    @Test
    public void checkSecond() {
        long expected2 = 8;
        long actual2 = HW6.second();

        Assert.assertEquals("Your test was failed", expected2, actual2);
    }

    @Test
    public void checkThird() {
        String expected3 = "[1, 8, 9, 12, 2]";
        String actual3 = HW6.third().toString();

        Assert.assertArrayEquals("Your test was failed", new String[]{expected3}, new String[]{actual3});
    }
    @Test
    public void checkFors () {
        String expected4 = "[1, 2, 4, 5, 6, 7, 9, 10, 11, 12, 15, 17, 19, 22, 100]";
        String actual4 = HW6.forts().toString();

        Assert.assertArrayEquals("Your test was failed", new String[]{expected4}, new String[]{actual4});
    }

    @Test
    public void checkFifth () {
        String expected5 = "[100, 22, 19, 17, 15, 12, 11, 10, 9, 7, 6, 5, 4, 2, 1]";
        String actual5 = HW6.fifths().toString();

        Assert.assertArrayEquals("Your test was failed", new String[]{expected5}, new String[]{actual5});
    }

    @Test
    public void checkSix () {
        String expected6 = "[2, 3, 5, 6, 8, 10]";
        String actual6 = HW6.six().toString();

        Assert.assertArrayEquals("Your test was failed", new String[]{expected6}, new String[]{actual6});
    }

    @Test
    public void checkSeventh () {
        String expected7 = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13]";
        String actual7 = HW6.sevenths().toString();

        Assert.assertArrayEquals("Your test was failed", new String[]{expected7}, new String[]{actual7});
    }

    @Test
    public void checkEighth () {
        long expected8 = 81;
        long actual8 = HW6.eights();

        Assert.assertEquals("Your test was failed", expected8, actual8);
    }

    @Test
    public void checkNine () {
        String expected9 = "maximum = 120minimum = 0";
        String actual9 = HW6.nine();

        Assert.assertEquals("Your test was failed", expected9, actual9);
    }

    @Test
    public void checkTen () {
        String expected10 = "sum = 240midle value = OptionalDouble[16.0]";
        String actual10 = HW6.ten();

        Assert.assertEquals("Your test was failed", expected10, actual10);
    }

    @Test
    public void checkEleven() {
        String expected11 = "[HELLO, HI, HELLO!, PRIVET, CHAO, SALUT!]";
        String actual11 = HW6.eleven().toString();

        Assert.assertEquals("Your test was failed", expected11, actual11);
    }

    @Test
    public void checkTwelve () {
        String expected12 = "[Petrov, Sidorov, Vasiliyev]";
        String actual12 = HW6.twelve().toString();

        Assert.assertEquals("Your test was failed", expected12, actual12);
    }

    @Test
    public void checkRegularExp1 () {
        Boolean expected13 = true;
        Boolean actual13 = HW6.checkRegularExp1();

        Assert.assertEquals("Your test was failed", expected13, actual13);
    }

    @Test
    public void checkRegularExp2 () {
        Boolean expected14 = false;
        Boolean actual14 = HW6.checkRegularExp2();

        Assert.assertEquals("Your test was failed", expected14, actual14);
    }

    @Test
    public void checkRegularExp3 () {
        String expected13 = "[*q+, *qq+, *qqq+]";
        String actual13 = HW6.checkRegularExp3().toString();

        Assert.assertEquals("Your test was failed", expected13, actual13);
    }
}

