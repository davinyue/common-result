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

    /**
     * 返回成功结果
     */
    public static <Void> Ret<Void> success() {
        return new Ret<>();
    }

    /**
     * 返回成功结果
     *
     * @param msg 消息
     */
    public static <Void> Ret<Void> msg(String msg) {
        Ret<Void> ret = new Ret<>();
        ret.setMsg(msg);
        return ret;
    }

    /**
     * 返回成功结果
     *
     * @param data 数据
     */
    public static <T> Ret<T> success(T data) {
        Ret<T> ret = new Ret<>();
        ret.setData(data);
        return ret;
    }

    /**
     * 返回成功结果
     *
     * @param msg  消息
     * @param data 数据
     */
    public static <T> Ret<T> success(T data, String msg) {
        Ret<T> ret = success(data);
        ret.setMsg(msg);
        return ret;
    }

    /**
     * 返回失败结果
     *
     * @param code 错误码
     * @param msg  消息
     * @param data 数据
     */
    public static <T> Ret<T> fail(int code, String msg, T data) {
        Ret<T> ret = new Ret<>();
        ret.setCode(code);
        ret.setMsg(msg);
        ret.setData(data);
        return ret;
    }

    /**
     * 返回失败结果
     *
     * @param code 错误码
     * @param msg  消息
     */
    public static <T> Ret<T> fail(int code, String msg) {
        return fail(code, msg, null);
    }

    /**
     * 返回失败结果
     *
     * @param msg 消息
     */
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
