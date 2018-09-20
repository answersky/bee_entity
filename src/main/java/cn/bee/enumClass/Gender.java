package cn.bee.enumClass;

/**
 * created by liufeng
 * 2018/9/10
 */
public enum Gender {
    /**
     * 男
     */
    MEN(1, "男"),
    /**
     * 女
     */
    WOMEN(2, "女"),
    /**
     * 未知
     */
    UNKNOW(0, "未知");

    private int type;
    private String des;

    public String getDes() {
        return des;
    }

    private Gender(int type, String des) {
        this.type = type;
        this.des = des;
    }

    public int getType() {
        return type;
    }
}
