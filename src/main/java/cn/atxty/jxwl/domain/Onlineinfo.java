package cn.atxty.jxwl.domain;
/**
 * 曲线图临时表
 * @author tangting
 *
 */
public class Onlineinfo {
    private String a1;

    private Integer a2;

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1 == null ? null : a1.trim();
    }

    public Integer getA2() {
        return a2;
    }

    public void setA2(Integer a2) {
        this.a2 = a2;
    }
}