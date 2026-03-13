package JAVA_BASICS;

import java.nio.file.*;
import java.nio.file.attribute.FileTime;

public class LastModifiedNIO {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("D:\\text_sample.txt");
        FileTime fileTime = Files.getLastModifiedTime(path);
        System.out.println("Last Modified: " + fileTime);
    }
}
