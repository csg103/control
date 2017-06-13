package com.cri.mapper;

import com.cri.vo.UserInfoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserInfoMapper 开发模型指导
 *
 * @author csg
 * @create 2017-06-19:09
 */
@Transactional
@Repository
public interface UserInfoMapper extends JpaRepository<UserInfoVO, Integer> {
}
