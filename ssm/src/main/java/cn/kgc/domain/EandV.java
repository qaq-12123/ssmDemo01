package cn.kgc.domain;

public class EandV {
    private String g_time;
    private String  c_model;
    private String  b_time;
    private String  rental;
    private String done;
    private String operate;
    private Integer vid;

    @Override
    public String toString() {
        return "EandV{" +
                "g_time='" + g_time + '\'' +
                ", c_model='" + c_model + '\'' +
                ", b_time='" + b_time + '\'' +
                ", rental='" + rental + '\'' +
                ", done='" + done + '\'' +
                ", operate='" + operate + '\'' +
                ", vid=" + vid +
                '}';
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getG_time() {
        return g_time;
    }

    public void setG_time(String g_time) {
        this.g_time = g_time;
    }

    public String getC_model() {
        return c_model;
    }

    public void setC_model(String c_model) {
        this.c_model = c_model;
    }

    public String getB_time() {
        return b_time;
    }

    public void setB_time(String b_time) {
        this.b_time = b_time;
    }

    public String getRental() {
        return rental;
    }

    public void setRental(String rental) {
        this.rental = rental;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }
}
