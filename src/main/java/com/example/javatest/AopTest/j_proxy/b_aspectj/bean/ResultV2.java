package com.example.javatest.AopTest.j_proxy.b_aspectj.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chengzhengzheng
 * @date 2019/11/18
 **/
@Data
public class ResultV2<T> implements Serializable {

    private static final long serialVersionUID = -1L;
    /**
     * 结果数据
     */
    private T data;
    /**
     * 状态码
     */
    private int ec = 200;

    /**
     * 状态信息
     */
    private String em = "success";
    /**
     * 是否立即返回
     */
    private Boolean immediate = false;

    /**
     * 是否成功
     *
     * @return
     */
    public boolean isSuccess() {
        return this.ec == 200;
    }


    private ResultV2(int ec, String em) {
        this.ec = ec;
        this.em = em;
    }

    private ResultV2(T obj, Boolean immediate) {
        this.data = obj;
        this.immediate = immediate;
    }

    private ResultV2(String em, T data) {
        this.em = em;
        this.data = data;
    }

    public static <E> ResultV2<E> successResult(E obj) {
        return successResult(obj, false);
    }

    public static <E> ResultV2<E> successResult() {
        return successResult(null);
    }

    public static <E> ResultV2<E> successResult(E data, String em) {
        return new ResultV2<>(em, data);
    }

    public static <E> ResultV2<E> successResult(E obj, boolean immediate) {
        return new ResultV2<>(obj, immediate);
    }

    public static <E> ResultV2<E> errorResult(ResultStatusEnum resultStatus) {
        return new ResultV2<>(resultStatus.getEc(), resultStatus.getEm());
    }

    public static <E> ResultV2<E> errorResult(int ec, String em) {
        return new ResultV2<E>(ec, em);
    }


    @Override
    public String toString() {
        return this.toString();
    }

}
