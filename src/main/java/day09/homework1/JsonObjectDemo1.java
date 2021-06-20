package day09.homework1;

import com.alibaba.fastjson.JSONObject;

import java.util.List;


public class JsonObjectDemo1 {
    /**
     * @Project: java_maven_basic
     * @Author: 皮皮
     * @Create: 2021-05-16 19:34
     * @Desc：
     **/
    public static void main(String[] args) {
        //第一题
        String str1 = "{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"}";
        Student newstr1 = JSONObject.parseObject(str1, Student.class);
        System.out.println(newstr1);
        //第二题
        String str2 = " [{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"},{\"name\": \"李四\", \"age\": \"16\"," +
                " \"score\":\"100\"}]";
        List<Student> newstr2  = JSONObject.parseArray(str2,Student.class);
        System.out.println(newstr2);

        //第三题
        String str3 = "{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }, " +
                "{ \"name\": \"广东\", \"capital\": \"广州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }";
        Countries countries = JSONObject.parseObject(str3,Countries.class);

        System.out.println(countries);
    }
}
