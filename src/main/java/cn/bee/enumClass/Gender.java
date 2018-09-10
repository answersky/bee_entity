package cn.bee.enumClass;

/**
 * created by liufeng
 * 2018/9/10
 */
public enum Gender {
    /**
     * 男
     */
    MEN(1),
    /**
     * 女
     */
    WOMEN(2),
    /**
     * 未知
     */
    UNKNOW(0);

    private int type;

    private Gender(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
