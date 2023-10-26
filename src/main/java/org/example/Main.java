package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        JavaSchoolStarter javaSchoolStarter = new JavaSchoolStarter();
        try {
           javaSchoolStarter.execute(
                    "INSERT VALUES 'id' = 1, 'name' = 'Ilya', 'counter' = false, 'surname' = 'Ivanov'");
            javaSchoolStarter.execute(
                    "INSERT VALUES 'id' = 2, 'name' = 'Redor', 'counter' = true, 'surname' = 'Sidorov'");

            javaSchoolStarter.execute(
                    "UPDATE VALUES 'name' = 'Ilya' WHERE 'id' = 3");

            javaSchoolStarter.execute("SELECT");

           javaSchoolStarter.execute("DELETE WHERE 'id' = 3");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}