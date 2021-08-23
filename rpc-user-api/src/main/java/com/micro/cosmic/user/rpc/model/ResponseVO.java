package com.micro.cosmic.user.rpc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author caojiancheng
 * @date 2020/11/2
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVO<T> implements Serializable {
    /**
     * 响应码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String msg;
    /**
     * 响应数据
     */
    private T data;

    public static <R> ResponseVO<R> success(R data) {
        return new ResponseVO<R>(0, "success", data);
    }
}
