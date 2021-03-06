package com.wxsp.service;


import com.wxsp.db.mapper.core.SysRoleMapper;
import com.wxsp.entity.rms.po.RmsRole;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author HuXinsheng
 * @since 2017-09-07
 */
@Service
public class SysRoleService extends ServiceImpl<SysRoleMapper, RmsRole> {
    private static final Logger log = LoggerFactory.getLogger(SysRoleService.class);

    @Autowired
    private SysRoleMapper sysRoleMapper;
}
