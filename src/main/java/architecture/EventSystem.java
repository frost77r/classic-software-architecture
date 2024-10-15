package architecture;

import utils.FileProcessor;

public class EventSystem {
    public static String process(String filePath) {
        String data = FileProcessor.readFile(filePath);
        // 模拟处理逻辑
        return "事件系统处理结果: " + data;
    }
}

