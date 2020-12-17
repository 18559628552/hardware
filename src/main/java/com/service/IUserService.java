package com.service;

import com.utils.RetDataMsg;
import com.utils.RetMsg;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IUserService {
    public RetMsg vfUser(Integer userNumber, String userPwd);

}
