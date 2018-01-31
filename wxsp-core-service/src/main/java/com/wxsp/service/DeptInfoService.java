package com.wxsp.service;


import com.wxsp.db.mapper.core.DeptInfoMapper;
import com.wxsp.entity.rms.po.RmsDept;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author HuXinsheng
 * @since 2017-09-07
 */
@Service
public class DeptInfoService extends ServiceImpl<DeptInfoMapper, RmsDept> {
    private static final Logger log = LoggerFactory.getLogger(DeptInfoService.class);

    @Autowired
    private DeptInfoMapper deptInfoMapper;
}
