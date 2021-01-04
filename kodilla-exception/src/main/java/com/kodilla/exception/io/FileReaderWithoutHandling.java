package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
        Stream<String> fileLines = null;
        try {
            fileLines = Files.lines(Paths.get(file.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileLines.forEach(System.out::println);
    }
}
