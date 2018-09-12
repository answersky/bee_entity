package cn.bee.utils;

import cn.bee.User;
import com.google.gson.Gson;

/**
 * created by liufeng
 * 2018/9/12
 */
public class JSONUtil {
    /**
     * 对象转json字符串
     *
     * @param object
     * @return
     */
    public static String object2String(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    /**
     * json 转对象
     *
     * @param json
     * @param object
     * @return
     */
    public static Object jsonStr2Object(String json, Class object) {
        Gson gson = new Gson();
        return gson.fromJson(json, object);
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("asdfas");
        user.setPassword("123123");
        String json = object2String(user);
        System.out.println(json);
        User u = (User) jsonStr2Object(json, User.class);
        System.out.println(u);
    }
}
