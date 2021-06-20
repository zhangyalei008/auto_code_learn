package lemoon;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;


public class ReadExcel {
    /**
     * @Project: java_maven_basic
     * @Author: 皮皮
     * @Create: 2021-05-19 01:04
     * @Desc： 读取表格
     **/
    public static void main(String[] args) throws Exception {
        FileInputStream fil = new FileInputStream("src/test/java/data/0519.xlsx");
        Workbook sheets = WorkbookFactory.create(fil);
        Sheet sheet1 = sheets.getSheet("Sheet1");
        //增强循环方式
//        for (Row row : sheet1) {
//            for (Cell cell : row) {
//                cell.setCellType(CellType.STRING);
//                System.out.print(cell.getStringCellValue() + "   ");
//            }
//            System.out.println();
//        }
        //普通循环方式
        for(int i = 0;i<=sheet1.getLastRowNum();i++){
            Row row = sheet1.getRow(i);
            int lastCellNum = row.getLastCellNum();
            for(int j =0;j<lastCellNum;j++){
                Cell cell = row.getCell(j);
                cell.setCellType(CellType.STRING);
                System.out.print(cell.getStringCellValue() + "   ");
            }
            System.out.println();
        }
    }
}
