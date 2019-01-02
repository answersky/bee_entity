package cn.bee.utils;

import com.csvreader.CsvReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * created by liufeng
 * 2018/12/18
 */
public class CsvUtil {
    public static void main(String[] args) {
        List<String> titles = new ArrayList<>();
        titles.add("id");
        titles.add("areaname");
        titles.add("parentid");
        titles.add("shortname");
        titles.add("lng");
        titles.add("lat");
        titles.add("level");
        titles.add("position");
        titles.add("sort");
        String file = "D:\\BaiduNetdiskDownload\\2016-areas\\areas.csv";
        String charset = "gbk";
        try {
            List<Map<String, String>> result = readCsv(titles, file, charset);
            System.out.println(result);
            System.out.println(result.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取csv文件
     *
     * @param titles
     * @param filePath
     * @param charset
     * @return
     * @throws Exception
     */
    public static List<Map<String, String>> readCsv(List<String> titles, String filePath, String charset) throws Exception {
        List<Map<String, String>> result = new ArrayList<>();
        InputStream inputStream = new FileInputStream(filePath);
        CsvReader csvReader = new CsvReader(inputStream, Charset.forName(charset));
        // 读表头
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            Map<String, String> map = new LinkedHashMap<>();
            for (int i = 0; i < titles.size(); i++) {
                String title = titles.get(i);
                // 读这行的某一列
                String value = csvReader.get(title);
                map.put(title, value);
            }
            result.add(map);
        }
        return result;
    }
}
