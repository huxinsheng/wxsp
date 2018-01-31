package com.wxsp.controller;


import com.wxsp.service.SysRoleMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 角色权限表 前端控制器
 * </p>
 *
 * @author HuXinsheng
 * @since 2017-09-07
 */
@RestController
@RequestMapping("/rmsRoleMenu")
public class SysRoleMenuController {
    private static final Logger log = LoggerFactory.getLogger(SysRoleMenuController.class);

    @Autowired
    private SysRoleMenuService sysRoleMenuService;
}
