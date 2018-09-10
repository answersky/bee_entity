package cn.bee.model;

import java.io.Serializable;

/**
 * created by liufeng
 * 2018/9/10
 */
public class ProductPic implements Serializable {
    private Integer id;
    private String mainUrl;
    private String pic1;
    private String pic2;
    private String pic3;
    private String pic4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainUrl() {
        return mainUrl;
    }

    public void setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }

    @Override
    public String toString() {
        return "ProductPic{" +
                "id=" + id +
                ", mainUrl='" + mainUrl + '\'' +
                ", pic1='" + pic1 + '\'' +
                ", pic2='" + pic2 + '\'' +
                ", pic3='" + pic3 + '\'' +
                ", pic4='" + pic4 + '\'' +
                '}';
    }
}
