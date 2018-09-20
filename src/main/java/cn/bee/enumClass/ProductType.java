package cn.bee.enumClass;

/**
 * created by liufeng
 * 2018/9/10
 */
public enum ProductType {
    /**
     * 服装
     */
    CLOTHING(1, "服装"),
    /**
     * 食品
     */
    FOOD(2, "食品"),
    /**
     * 家用电器
     */
    HOUSE_ELECTRIC(3, "家用电器");

    private int type;
    private String des;

    private ProductType(int type, String des) {
        this.type = type;
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public int getType() {
        return type;
    }


}
