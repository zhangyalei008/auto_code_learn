package day09.homework1;

import java.util.List;

public class Countries {
    /**
     * @Project: java_maven_basic
     * @Author: 皮皮
     * @Create: 2021-05-18 00:03
     * @Desc：
     **/

    private String name;
    private List<Cities> provinces;

    public Countries(String name, List<Cities> provinces) {
        this.name = name;
        this.provinces = provinces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cities> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Cities> provinces) {
        this.provinces = provinces;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                ", provinces=" + provinces +
                '}';
    }
}
