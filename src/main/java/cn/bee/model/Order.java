package cn.bee.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * created by liufeng
 * 2018/11/6
 */
public class Order implements Serializable {
    private Integer id;
    private String orderNo;
    private String username;
    private String status;
    private Date createTime;
    private BigDecimal totalPrice;
    private OrderDetail orderDetail;
    private String receiveAddress;
    private String receiver;
    private String receivePhone;

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", username='" + username + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", totalPrice=" + totalPrice +
                ", orderDetail=" + orderDetail +
                ", receiveAddress='" + receiveAddress + '\'' +
                ", receiver='" + receiver + '\'' +
                ", receivePhone='" + receivePhone + '\'' +
                '}';
    }
}
