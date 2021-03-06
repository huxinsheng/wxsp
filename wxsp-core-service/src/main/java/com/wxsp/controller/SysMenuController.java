package com.wxsp.controller;


import com.wxsp.constant.ApiConstant;
import com.wxsp.service.SysMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author HuXinsheng
 * @since 2017-09-07
 */
@RestController
@RequestMapping(ApiConstant.RMS_MENU)
public class SysMenuController {
    private static final Logger log = LoggerFactory.getLogger(SysMenuController.class);

    @Autowired
    private SysMenuService sysMenuService;
}
