package com.auction.sale.domain;


import java.io.Serializable;

public class RestResponse implements Serializable {

    private final static long serialVersionUID = 1L;
    /**
     * 成功
     */
    private final static int STATUS_SUCCESS = 200;

    /**
     * 代码错误
     */
    private final static int STATUS_ERROR_INTERNAL_SERVER_ERROR = 500;

    /**
     * 服务不可用（针对熔断&服务降级的情况）
     */
    private final static int STATUS_ERROR_SERVICE_UNAVAILIABLE = 503;


    private int status;
    private Object data;
    private String message;


    public RestResponse(int code, String message, Object data) {
        super();
        this.status = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static RestResponse buildSuccess(Object data) {
        return new RestResponse(STATUS_SUCCESS, "success", data);
    }


    /**
     * 代码错误
     * @param data
     * @return
     */
    public static RestResponse buildError_InternalServerError(Object data) {
        return new RestResponse(STATUS_ERROR_INTERNAL_SERVER_ERROR, "error", data);
    }

    /**
     * 返回错误码（服务不可用时，返回此方法），但推荐直接使用异常类
     * @param data
     * @return
     */
    public static RestResponse buildError_ServiceUnavailable(Object data) {
        return new RestResponse(STATUS_ERROR_SERVICE_UNAVAILIABLE, "error", data);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}