package cn.bee.enumClass;

/**
 * created by liufeng
 * 2018/9/10
 */
public enum ProductType {
    /**
     * 服装
     */
    CLOTHING(1),
    /**
     * 食品
     */
    FOOD(2),
    /**
     * 家用电器
     */
    HOUSE_ELECTRIC(3);

    private int type;

    private ProductType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}
