package com.wxsp.cache;

import com.wxsp.db.mapper.core.SysUserMapper;
import com.wxsp.entity.rms.vo.RmsUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HuXinsheng
 */
@Service
public class CacheService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Cacheable(value = "usercache", key = "'selectUserById:id_'+#id")
    public RmsUserVo selectUserById(Integer id) {
        Map<String,Object> paramsMap = new HashMap<>(5);
        paramsMap.put("id",id);
        RmsUserVo rmsUser = sysUserMapper.selectOneUser(paramsMap);
        return rmsUser;
    }

    @Cacheable(value = "usercache", key = "'selectUserByAccout:account_'+#account")
    public RmsUserVo selectUserByAccout(String account) {
        Map<String,Object> paramsMap = new HashMap<>(5);
        paramsMap.put("account",account);
        RmsUserVo rmsUser = sysUserMapper.selectOneUser(paramsMap);
        return rmsUser;
    }
}
