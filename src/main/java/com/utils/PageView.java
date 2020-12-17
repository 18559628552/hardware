package com.utils;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PageView {
    private String viewName;

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}
