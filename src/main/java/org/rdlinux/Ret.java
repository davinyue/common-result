package org.rdlinux;

/**
 * 公共返回类
 */
public class Ret<T> {
    /**
     * 信息
     */
    private String msg = "success";
    /**
     * 状态码, 0正常
     */
    private int code = 0;
    /**
     * 数据
     */
    private T data;
    /**
     * 链路id
     */
    private String traceId;

    public static <Void> Ret<Void> success() {
        return new Ret<>();
    }

    public static <T> Ret<T> success(T data) {
        Ret<T> ret = new Ret<>();
        ret.setData(data);
        return ret;
    }

    public static <T> Ret<T> success(String msg, T data) {
        Ret<T> ret = success(data);
        ret.setMsg(msg);
        return ret;
    }

    public static <T> Ret<T> fail(int code, String msg, T data) {
        Ret<T> ret = new Ret<>();
        ret.setCode(code);
        ret.setMsg(msg);
        ret.setData(data);
        return ret;
    }

    public static <T> Ret<T> fail(int code, String msg) {
        return fail(code, msg, null);
    }

    public static <T> Ret<T> fail(String msg) {
        return fail(500, msg, null);
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}
