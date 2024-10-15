package architecture;

import utils.FileProcessor;

public class OOPStyle {
    public static String process(String filePath) {
        String data = FileProcessor.readFile(filePath);
        // 模拟处理逻辑
        return "面向对象处理结果: " + data;
    }
}

