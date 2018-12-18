package cn.bee.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * created by liufeng
 * 2018/12/18
 */
public class ExcelUtil {
    private final static String xls = "xls";
    private final static String xlsx = "xlsx";

    public static void main(String[] args) {
        try {
            List<String> cells = new ArrayList<>();
            cells.add("A");
            cells.add("B");
            cells.add("C");
            cells.add("D");
            List<Map<String, Object>> result = readExcel("C:\\Users\\liufeng\\Desktop\\file.xlsx", cells);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Map<String, Object>> readExcel(String filePath, List<String> cells) throws Exception {
        List<Map<String, Object>> result = new ArrayList<>();
        File file = new File(filePath);
        //检查文件
        checkFile(file);
        //1.读取Excel文档对象
        Workbook workbook = getWorkBook(file);
        if (workbook == null) {
            throw new Exception("workbook is null");
        }
        int sheetNum = workbook.getNumberOfSheets();
        for (int k = 0; k < sheetNum; k++) {
            //2.获取要解析的表格（第一个表格）
            Sheet sheet = workbook.getSheetAt(k);
            if (sheet == null) {
                continue;
            }
            //获得最后一行的行号
            int lastRowNum = sheet.getLastRowNum();
            //遍历每一行
            for (int i = 0; i <= lastRowNum; i++) {
                Map<String, Object> rowMap = new LinkedHashMap<>();
                //3.获得要解析的行
                Row row = sheet.getRow(i);
                //4.获得每个单元格中的内容（String）
                for (int j = 0; j < cells.size(); j++) {
                    String title = cells.get(j);
                    Cell cell = row.getCell(j);
                    String stringCellValue = getCellValue(cell);
                    rowMap.put(title, stringCellValue);
                }
                result.add(rowMap);
            }
        }
        return result;
    }

    private static void checkFile(File file) throws IOException {
        //判断文件是否存在
        if (null == file) {
            throw new FileNotFoundException("文件不存在！");
        }
        //获得文件名
        String fileName = file.getName();
        //判断文件是否是excel文件
        if (!fileName.endsWith(xls) && !fileName.endsWith(xlsx)) {
            throw new IOException(fileName + "不是excel文件");
        }
    }

    private static Workbook getWorkBook(File file) throws IOException {
        Workbook workbook = null;
        InputStream is = null;
        try {
            //获得文件名
            String fileName = file.getName();
            //获取excel文件的io流
            is = new FileInputStream(file);
            //根据文件后缀名不同(xls和xlsx)获得不同的Workbook实现类对象
            if (fileName.endsWith(xls)) {
                //2003
                workbook = new HSSFWorkbook(is);
            } else if (fileName.endsWith(xlsx)) {
                //2007
                workbook = new XSSFWorkbook(is);
            }
        } catch (IOException e) {
            throw new IOException("获取workbook error");
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return workbook;
    }

    private static String getCellValue(Cell cell) {
        String cellValue = "";
        if (cell == null) {
            return cellValue;
        }
        //把数字当成String来读，避免出现1读成1.0的情况
        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            cell.setCellType(Cell.CELL_TYPE_STRING);
        }
        //判断数据的类型
        switch (cell.getCellType()) {
            //数字
            case Cell.CELL_TYPE_NUMERIC:
                cellValue = String.valueOf(cell.getNumericCellValue());
                break;
            //字符串
            case Cell.CELL_TYPE_STRING:
                cellValue = String.valueOf(cell.getStringCellValue());
                break;
            //Boolean
            case Cell.CELL_TYPE_BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            //公式
            case Cell.CELL_TYPE_FORMULA:
                cellValue = String.valueOf(cell.getCellFormula());
                break;
            //空值
            case Cell.CELL_TYPE_BLANK:
                cellValue = "";
                break;
            //故障
            case Cell.CELL_TYPE_ERROR:
                cellValue = "非法字符";
                break;
            default:
                cellValue = "未知类型";
                break;
        }
        return cellValue;
    }
}
