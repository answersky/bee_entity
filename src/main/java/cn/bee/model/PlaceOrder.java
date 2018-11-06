package cn.bee.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * created by liufeng
 * 2018/11/6
 * 下订单
 */
public class PlaceOrder implements Serializable {
    /**
     * 收货地址
     */
    private String receiveAddress;
    /**
     * 收货人姓名
     */
    private String receiver;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 商品编码
     */
    private String productCode;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 下单数量
     */
    private int num;
    /**
     * 备注
     */
    private String remark;

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "receiveAddress='" + receiveAddress + '\'' +
                ", receiver='" + receiver + '\'' +
                ", phone='" + phone + '\'' +
                ", productCode='" + productCode + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", remark='" + remark + '\'' +
                '}';
    }
}
