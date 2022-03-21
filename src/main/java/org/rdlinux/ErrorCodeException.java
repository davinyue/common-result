package org.rdlinux;

/**
 * 带错误编码的异常类
 */
public class ErrorCodeException extends RuntimeException {
    private static final long serialVersionUID = 7269868409516147549L;
    /**
     * 移除编码
     */
    private int errorCode;

    public ErrorCodeException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ErrorCodeException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }


    public ErrorCodeException(int errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

}
