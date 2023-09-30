import java.util.List;

public class AdapterClient {
    public static void main(String[] args) {

        DataBaseDataGenerator gen = new DataBaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(gen.generateData());
        for(DisplayData3rdParty datum: legacyData){
            datum.displayData();
        }
    }
}