import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class secondTest {




    Second myGrade = new Second();
        SoftAssert softassert = new SoftAssert();



        @DataProvider(name = "data1")
        public Object[][] dpMethod() {
            return new Object[][] { { 120,"invalid" }, { 100,"exellent" }, { 99,"exellent" }, { 98,"exellent" }, { 91,"exellent" }, { 90,"exellent" }, { 89 ,"very good" }, { 88,"very good" }, { 81,"very good" }, { 80,"very good" },
                    { 79 , "good" }, { 78, "good" }, { 71, "good" }, { 70, "good" }, { 69,"accepted" }, { 68,"accepted" }, { 61,"accepted" }, { 60,"accepted" }, { 59 , "failed" }, { 58 , "failed"}, { 41 , "failed"}, { 40, "failed" }, { 39,"failed" },
                    { 38,"good" }, { 1,"good" }, { 0,"invalid" }, { -1 , "invalid , please enter positve number" }, };
        }


        @Test(priority = 2)
        public void test111() {
            Assert.assertTrue(true);
        }

        @Test(priority = 1)
        public void test222() {
            Assert.assertTrue(true);
        }

        @Test(dataProvider = "data1")
        public void test1(int y , String grade) {
            String actualGrade = myGrade.getGrade(y);
            softassert.assertEquals(actualGrade , grade );
        }



}
