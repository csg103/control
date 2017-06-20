package com.cri.service.serviceImpl;

import com.cri.mapper.UserInfoMapper;
import com.cri.pojo.UserInfoPOJO;
import com.cri.service.UserInfoService;
import com.cri.utils.BaseUtils;
import com.cri.vo.userinfo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用于开发指引。
 *
 * @author csg
 * @create 2017-06-18:54
 */
@Service
@Log4j2
@AllArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {

    private  UserInfoMapper userInfoMapper;


    @Transactional
    public int addUser(UserInfoPOJO userInfo) {
        userinfo vo = BaseUtils.getVOMap().map(userInfo, userinfo.class);
        int i = userInfoMapper.insert(vo);
        log.info("添加成功！！");
        return i;
    }
}
