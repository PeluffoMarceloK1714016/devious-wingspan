package main.java.wingspan.cards;
import java.util.HashMap;

public class DataTable {
    HashMap<String, BirdInfo> table;

    public DataTable()
    {
        table = new HashMap<>();
        enterBirdInfo();
    }

    private void enterBirdInfo()
    {
        // for each bird, table.put("Duck", new BirdInfo("Duck", ...));
    }
    
}