package com.cri.service.serviceImpl;

import com.cri.mapper.UserInfoMapper;
import com.cri.pojo.UserInfoPOJO;
import com.cri.service.UserInfoService;
import com.cri.utils.BaseUtils;
import com.cri.vo.UserInfoVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

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
    private UserInfoMapper userInfoMapper;
    //  private DozerBeanMapper baseMapper;

    public String addUser(UserInfoPOJO useinfo) {
        UserInfoVO vo = BaseUtils.getVOMap().map(useinfo, UserInfoVO.class);
        userInfoMapper.save(vo);
        log.info("添加成功！！");
        return "";
    }
}
