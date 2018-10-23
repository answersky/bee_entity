package cn.bee.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * created by liufeng
 * 2018/9/10
 */
public class Product implements Serializable {
    private Integer id;
    private String productCode;
    private String productName;
    private String productType;
    private String pic;
    private BigDecimal price;
    private Integer inventory;
    private Integer attributeId;
    private Integer picId;
    private Integer sort;
    private String operator;
    private Date createTime;
    private Date updateTime;
    private ProductAttribute productAttribute;
    private ProductPic productPic;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public ProductAttribute getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(ProductAttribute productAttribute) {
        this.productAttribute = productAttribute;
    }

    public ProductPic getProductPic() {
        return productPic;
    }

    public void setProductPic(ProductPic productPic) {
        this.productPic = productPic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", pic='" + pic + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", attributeId=" + attributeId +
                ", picId=" + picId +
                ", sort=" + sort +
                ", operator='" + operator + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", productAttribute=" + productAttribute +
                ", productPic=" + productPic +
                ", status='" + status + '\'' +
                '}';
    }
}
