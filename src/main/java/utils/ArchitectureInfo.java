package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArchitectureInfo {
    public static String getDescription(String style) {
        String filePath = "resources/descriptions/" + style + ".txt";
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            return "无法读取描述文件: " + e.getMessage();
        }
    }
}

