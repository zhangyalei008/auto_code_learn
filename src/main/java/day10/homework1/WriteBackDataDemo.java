package day10.homework1;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class WriteBackDataDemo {
    /**
     * @Project: java_maven_basic
     * @Author: 皮皮
     * @Create: 2021-05-20 15:21
     * @Desc：
     **/

    public static void main(String[] args) throws Exception {
        WriteBackData wbd1 = new WriteBackData("1","2","Pass");
        WriteBackData wbd2 = new WriteBackData("2","2","Fail");
        WriteBackData wbd3 = new WriteBackData("3","2","Pass");

        ArrayList<WriteBackData> list1 = new ArrayList<>();
        list1.add(wbd1);
        list1.add(wbd3);
        list1.add(wbd2);
        System.out.println(list1);
        //开流
        FileInputStream fis =new  FileInputStream("src/main/java/day10/homework1/exam.xls");
        //获取Sheet页
        Workbook sheets = WorkbookFactory.create(fis);
        Sheet sheet = sheets.getSheetAt(0);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i);
        }

    }
}
