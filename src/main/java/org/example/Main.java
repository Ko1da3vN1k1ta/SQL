package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        JavaSchoolStarter javaSchoolStarter = new JavaSchoolStarter();
        try {
           javaSchoolStarter.execute(
                    "INSERT VALUES 'id' = 1, 'name' = 'Ilya', 'counter' = false, 'surname' = 'Merenkov'");
            javaSchoolStarter.execute(
                    "INSERT VALUES 'id' = 2, 'name' = 'Filipp', 'counter' = false, 'surname' = 'Sheinberger'");

            javaSchoolStarter.execute(
                    "UPDATE VALUES 'name' = 'Vladimir' WHERE 'id' = 2");

            javaSchoolStarter.execute("SELECT");

           javaSchoolStarter.execute("DELETE WHERE 'id' = 3");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}