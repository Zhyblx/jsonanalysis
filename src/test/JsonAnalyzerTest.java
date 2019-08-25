package test;

/**
 * Json数据解析测试
 */

import analyzer.JsonAnalyzer;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class JsonAnalyzerTest {

    private static JsonAnalyzer jsonAnalyzer=new JsonAnalyzer();

    public static void main(String[] args) throws Exception {
        File file = new File("/home/zhangyibin/下载/1.json.txt");
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"gbk");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String text = "";
        String data="";
        while ((text = bufferedReader.readLine()) != null) {
            data=data+text;

        }
//        System.out.println(data);
        String analyzerData=jsonAnalyzer.setJsonAnalyzer(data);
        System.out.println(analyzerData);

        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();

    }


}
