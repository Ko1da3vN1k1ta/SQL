package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JavaSchoolStarter {
    List<Map<String, Object>> data;

    public List<Map<String, Object>> execute(String request) {
        data = new ArrayList<>();
        requestOrder(request);
        return null;
    }

    private void requestOrder(String request) {
        if (request.startsWith("INSERT")) {
            insertValues();
        }
       else if (request.startsWith("UPDATE")) {
            updateValues();
        }
        else if (request.startsWith("DELETE")) {
            deleteValues();
        }
       else if (request.startsWith("SELECT")){
            selectValues();
        }
    }

    private void selectValues() {
    }

    private void deleteValues() {
        
    }

    private void updateValues() {
        
    }

    private void insertValues() {
        
    }
}
