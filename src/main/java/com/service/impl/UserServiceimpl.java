package com.service.impl;

import com.dao.UserDaoMapper;
import com.pojo.Users;
import com.service.IUserService;
import com.utils.RetDataMsg;
import com.utils.RetMsg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceimpl implements IUserService {
    @Resource
    private UserDaoMapper userDaoMapper;


    @Override
    public RetMsg vfUser(Integer userNumber, String userPwd) {
        Users users=userDaoMapper.vfUser(userNumber, userPwd);

        RetMsg retMsg=new RetMsg();
        if (users.getUserId()==null) {
            retMsg.setSuccess(false);
            retMsg.setMsg("查询失败");
            retMsg.setErrorCode(1);
        }
          if(users.getUserDentify()==0&&users.getUserState()==0){
               retMsg.setSuccess(true);//查询成功
               retMsg.setMsg("当前为可登录普通用户");
               retMsg.setFlag(0);//登录标识
               retMsg.setObj(users);//上传用户对象
          }else if(users.getUserDentify().equals(4)&&users.getUserState().equals(0)){
              retMsg.setSuccess(true);
              retMsg.setMsg("当前为可登录管理员用户");
              retMsg.setFlag(4);//登录标识
              retMsg.setObj(users);
          }else if (users.getUserState().equals(4)){
              retMsg.setSuccess(true);
              retMsg.setMsg("查询账户已冻结");
              retMsg.setErrorCode(1);
          }
        System.out.println("我执行到这里了");
          return retMsg;

    }
}
