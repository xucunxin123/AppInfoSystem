package cn.appsys.dao.devuser;

import cn.appsys.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author: xucunxin
 * @date: 2018/11/26
 * @package cn.appsys.dao.devuser
 * @description: TODO
 */
public interface DevUserMapper {
    //用户开发平台登录
    public DevUser getLoginUser(@Param("devCode")String devCode)throws Exception;
}
