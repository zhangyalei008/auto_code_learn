package day10.homework1;

public class WriteBackData {
    /**
     * @Project: java_maven_basic
     * @Author: 皮皮
     * @Create: 2021-05-20 15:16
     * @Desc：
     **/
    private String rowNum;
    private String cellNum;
    private String content;

    public WriteBackData(String rowNum, String cellNum, String content) {
        this.rowNum = rowNum;
        this.cellNum = cellNum;
        this.content = content;
    }

    public String getRowNum() {
        return rowNum;
    }

    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }

    public String getCellNum() {
        return cellNum;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WriteBackData{" +
                "rowNum='" + rowNum + '\'' +
                ", cellNum='" + cellNum + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
