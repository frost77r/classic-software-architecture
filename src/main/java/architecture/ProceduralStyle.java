package architecture;


import utils.FileProcessor;

public class ProceduralStyle {
    public static String process(String filePath) {
        String data = FileProcessor.readFile(filePath);
        // 模拟处理逻辑
        return "主程序-子程序处理结果: " + data;
    }
}

