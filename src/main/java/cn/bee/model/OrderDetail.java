package cn.bee.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * created by liufeng
 * 2018/11/6
 */
public class OrderDetail implements Serializable {
    private Integer id;
    private String productCode;
    private String orderNo;
    private int num;
    private Date createTime;
    private List<Product> productList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", num=" + num +
                ", createTime=" + createTime +
                ", productList=" + productList +
                '}';
    }
}
