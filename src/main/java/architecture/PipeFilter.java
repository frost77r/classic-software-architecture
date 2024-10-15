package architecture;

import utils.FileProcessor;

public class PipeFilter {
    public static String process(String filePath) {
        String data = FileProcessor.readFile(filePath);
        // 模拟处理逻辑
        return "管道-过滤器处理结果: " + data;
    }
}

