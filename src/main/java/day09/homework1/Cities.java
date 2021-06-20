package day09.homework1;

public class Cities {
    /**
     * @Project: java_maven_basic
     * @Author: 皮皮
     * @Create: 2021-05-18 00:00
     * @Desc：
     **/

    private String name;
    private String capital;

    public Cities(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
