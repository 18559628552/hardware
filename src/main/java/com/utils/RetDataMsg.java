package com.utils;

import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RetDataMsg<T> extends RetMsg {
    private T data;
    private Object obj;

    public RetDataMsg() {
        super();
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getObj() {
        return this.obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
