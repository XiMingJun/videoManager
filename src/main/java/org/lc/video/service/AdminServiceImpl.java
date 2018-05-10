package org.lc.video.service;

import org.lc.video.mapper.AdminMapper;
import org.lc.video.model.Admin;
import org.lc.video.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {


    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean checkLogin(Admin admin) {

        //根据loginName从数据库里面获取admin对象，然后判断password是否一致
        try {
            Admin result = adminMapper.getAdminByLoginName(admin.getName());

            if (result != null) {

                if (admin.getPassword().equals(result.getPassword())) {

                    return true;
                } else {
                    System.out.println("密码错误");
                    return false;
                }
            } else {

                System.out.println("用户不存在");
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
