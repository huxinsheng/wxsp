package com.wxsp.service;


import com.wxsp.db.mapper.rms.RmsMenuMapper;
import com.wxsp.entity.rms.po.RmsMenu;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author HuXinsheng
 * @since 2017-09-07
 */
@Service
public class RmsMenuService extends ServiceImpl<RmsMenuMapper, RmsMenu> {
    private static final Logger log = LoggerFactory.getLogger(RmsMenuService.class);

    @Autowired
    private RmsMenuMapper rmsMenuMapper;
}
