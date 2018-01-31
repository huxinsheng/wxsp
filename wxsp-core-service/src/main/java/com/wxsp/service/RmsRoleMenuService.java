package com.wxsp.service;


import com.wxsp.db.mapper.rms.RmsRoleMenuMapper;
import com.wxsp.entity.rms.po.RmsRoleMenu;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色权限表 服务实现类
 * </p>
 *
 * @author HuXinsheng
 * @since 2017-09-07
 */
@Service
public class RmsRoleMenuService extends ServiceImpl<RmsRoleMenuMapper, RmsRoleMenu> {
    private static final Logger log = LoggerFactory.getLogger(RmsRoleMenuService.class);

    @Autowired
    private RmsRoleMenuMapper rmsRoleMenuMapper;
}
