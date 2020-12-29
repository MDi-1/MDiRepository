package com.kodilla.stream.forumuser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public List<String> readTxt()  throws IOException {
        List<String> records = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(
                "kodilla-stream\\src\\main\\resources\\noSexNames.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                records.add(line);
            } } catch (Exception e) { e.printStackTrace(); }
        return records;
    }
    public void generate() throws IOException {
        int i = 1001;
        char sex;
        int posts;
        Random random = new Random();
        for (String name : readTxt()) {
            if (random.nextBoolean()) sex = 'F';
            else sex = 'M';
            random.nextInt();
            LocalDate date = LocalDate.of(random.nextInt(50) + 1980, random.nextInt(12) + 1, random.nextInt(28) + 1);
            if (random.nextInt(5) < 3) { posts = 0; } else { posts = random.nextInt(100); }
            ForumUser user = new ForumUser(i, name, sex, date, posts);
            userList.add(user);
            i ++;
        }
    }
    public List<ForumUser> getUserList() {
        return userList;
    }
}
