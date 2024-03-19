import org.testng.annotations.Test;

public class DataProviderHardcoded {

    @Test(dataProvider = "driveTest")
    public void testCaseData(String greeting, String communication, int id) {
        System.out.println(greeting + " " + communication + " " + id);

    }

    @org.testng.annotations.DataProvider(name = "driveTest")
    public Object[][] getData() {
        Object[][] data = {{"hello","text","1"}, {"bye","message","143"}, {"solo","call","453"}};
        return data;
    }


}
