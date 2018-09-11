package cn.bee.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * created by liufeng
 * 2018/9/11
 */
public class Md5Encrypt {

    /**
     * 加密
     *
     * @param uuid
     * @param password
     * @return
     */
    public static String EncoderByMd5(String uuid, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String str = base64Encoder.encode(messageDigest.digest((uuid + password).getBytes("utf-8")));
        return str;
    }
}
