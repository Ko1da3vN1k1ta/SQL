package org.example;

import java.security.interfaces.DSAKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        JavaSchoolStarter javaSchoolStarter = new JavaSchoolStarter();
        List<Map<String,Object>> result1 = javaSchoolStarter.execute("INSERT VALUES " +
                "'lastName' = 'Федоров' , " +
                "'id'=3, 'age'=40, 'active'=true");

    }
}
