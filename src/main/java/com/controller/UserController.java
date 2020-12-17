package com.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Users;
import com.service.IUserService;
import com.utils.PageView;
import com.utils.RetMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    IUserService iUserService;

    ModelAndView modelAndView = new ModelAndView();

    @RequestMapping("user/login")
    public ModelAndView  viewDpList(HttpServletRequest request, HttpServletResponse response, Users users) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        PageView pageView=new PageView();
        RetMsg retMsg = iUserService.vfUser(users.getUserNumber(), users.getUserPwd());

        if (retMsg.getSuccess().equals(false)) {
            //查询失败页面   --可换成提示
            modelAndView.setViewName("error");
        } else if (retMsg.getFlag().equals(0)) {
            //用户页面
            modelAndView.setViewName("user");
        } else if (retMsg.getFlag().equals(4)) {
            //管理员页面
            modelAndView.setViewName("admin");;

        }

        HttpSession session = request.getSession();
        session.setAttribute("users", retMsg.getObj());
        //上传用户信息到session域
        return modelAndView;
    }

    @RequestMapping("user/test")
    public ModelAndView  viewDpList1(){
        modelAndView.setViewName("error");
        return modelAndView;
    }



}
