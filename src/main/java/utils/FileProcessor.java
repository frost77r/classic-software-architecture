package utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileProcessor {
    public static String readFile(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            return "文件读取错误: " + e.getMessage();
        }
    }
}

