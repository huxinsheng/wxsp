package com.wxsp.db.mapper.core;

import com.wxsp.entity.rms.po.RmsRoleMenu;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
  * 角色权限表 Mapper 接口
 * </p>
 *
 * @since 2017-09-07
 */
@Mapper
@Component
public interface SysRoleMenuMapper extends BaseMapper<RmsRoleMenu> {

}
