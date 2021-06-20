package lemoon;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;


public class ExcelDemo {
    /**
     * @Project: java_maven_basic
     * @Author: 皮皮
     * @Create: 2021-05-19 00:27
     * @Desc：
     **/
    public static void main(String[] args) throws Exception {
        //1.IO流读取文件，打开Excel表格
        FileInputStream fil =new  FileInputStream("src/test/java/data/0519.xls");
        //2.用POI解析表格得到Excel对象
        Workbook sheets = WorkbookFactory.create(fil);
        //3.获取sheet
        Sheet sheet = sheets.getSheetAt(0);
        //4.获取行
        Row row = sheet.getRow(2);
        //5.获取单元格
        Cell cell = row.getCell(1);
        //转换单元格格式为String
        cell.setCellType(CellType.STRING);
        //6.打印内容
        System.out.println(cell.getStringCellValue());

    }
}
