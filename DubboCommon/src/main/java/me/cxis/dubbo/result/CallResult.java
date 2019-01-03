package me.cxis.dubbo.result;

import java.io.Serializable;

public class CallResult<T> implements Serializable {

    private static final long serialVersionUID = -4674588112953085403L;

    private T model;

    private boolean success = true;

    private String errorMsg;

    private int errorCode;

    public CallResult() {
    }

    public CallResult(T model) {
        this.model = model;
    }

    public CallResult(String errorMsg, int errorCode) {
        this.success = false;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "CallResult{" +
                "model=" + model +
                ", success=" + success +
                ", errorMsg='" + errorMsg + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
