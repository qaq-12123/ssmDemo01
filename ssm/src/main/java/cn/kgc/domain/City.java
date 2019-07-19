package cn.kgc.domain;


/**
 *
 */
public class City {
    private String word;
    private String cityname;
    private String abb;

    @Override
    public String toString() {
        return "City{" +
                ", word='" + word + '\'' +
                ", cityname='" + cityname + '\'' +
                ", abb='" + abb + '\'' +
                '}';
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getAbb() {
        return abb;
    }

    public void setAbb(String abb) {
        this.abb = abb;
    }
}
