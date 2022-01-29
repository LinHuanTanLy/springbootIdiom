package com.ly.idiom.net;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -1220656299702215742L;
    private String code;
    private String message;
    private T data;

    public static <T> Response<T> ok(T data) {
        return new Response("200", "success", data);
    }
    public static <T> Response<T> ok(String msg) {
        return new Response("200", "success", null);
    }

    public static <T> Response ok(String code, String message, T data) {
        return new Response(code, message, data);
    }

    public static <T> Response fail(T data) {
        return new Response("500", "fail request", data);
    }
    public static <T> Response<T> fail(String msg) {
        return new Response("500", "fail request", null);
    }

    public static <T> Response fail(String code, String message, T data) {
        return new Response(code, message, data);
    }

    private Response(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}