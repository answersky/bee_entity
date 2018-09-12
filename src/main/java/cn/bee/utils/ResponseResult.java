package cn.bee.utils;

/**
 * created by liufeng
 * 2018/9/12
 */
public class ResponseResult<T> {
    private String message;
    /**
     * 200：正常
     * 400：失败
     */
    private String status;
    private T data;

    public ResponseResult() {
    }

    ;

    public ResponseResult(String message, String status, T data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
