package com.kodilla.testing.forum.statistics;

import java.io.*;
import java.util.*;

public class UserGenerator {

    public List<List<String>> readCsv()  throws IOException {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\test\\resources\\users.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            } } catch (Exception e) { e.printStackTrace(); }
        return records;
    }
    public List<String> consumeCsv(int usersQuantity) throws IOException {
        Set<String> nameset = new HashSet<>();
        Random random = new Random();
        while (nameset.size() < usersQuantity) {
            String firstname = readCsv().get(0).get(random.nextInt(23));
            String surname = readCsv().get(1).get(random.nextInt(23));
            String nickname = readCsv().get(2).get(random.nextInt(23));
            String digits = "";
            if (random.nextBoolean()) digits = String.valueOf(random.nextInt(100));
            nameset.add(firstname + " " + surname + " - " + nickname + digits);
        }
        List<String> namelist = new ArrayList<>();
        namelist.addAll(nameset);
        return namelist;
    }
}
