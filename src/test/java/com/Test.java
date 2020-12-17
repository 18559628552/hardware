package com;

import com.dao.*;
import com.pojo.Users;
import com.service.IUserService;
import com.utils.RetDataMsg;
import com.utils.RetMsg;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class Test{

    @Resource
    private UserDaoMapper userDaoMapper;
    @Resource
    private IUserService iUserServicel;

    @org.junit.Test
    public void findall(){
        //一对一查询用户
//        List<PsEp> employees=employeeDaoMapper.findall();
//        for (PsEp es:employees
//             ) {
//            System.out.println(es);
//        }
//        List<EpAt> epAts=atdDaoMapper.findall();
//        for (EpAt es:epAts
//        ) {
//            System.out.println(es);
//        }
//        int i=iAtdService.agreeAt(150003,"恭喜");
//        System.out.println(i);
        //管理员验证
//        RetDataMsg<List<Users>> users =userDaoMapper.vfUser(67641958,"123");
//        System.out.println(users+"##@#@#@#@#");
        RetMsg retMsg=iUserServicel.vfUser(67641958,"123");
        System.out.println(retMsg.getSuccess()+retMsg.getMsg());
//        //查询所有部门
//        List<Department> departments = departmentDaoMapper.findAllDp();
//        for (Department d: departments
//             ) {
//            System.out.println(d);
//        }
//
//        List<Position> positions=positionDaoMapper.findAllPs();
//        for (Position ps:positions
//             ) {
//            System.out.println(ps);
//        }


        //用json来传值
//        JSONArray json = JSONArray.fromObject(admins);
//        String js = json.toString();
//        //*****转为layui需要的json格式，必须要这一步，博主也是没写这一步，在页面上数据就是数据接口异常
//        String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+10+",\"data\":"+js+"}";
//        System.out.println(jso);
    }

}