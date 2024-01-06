package com.leg.member.dao;

import com.leg.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author leg
 * @email leg@gmail.com
 * @date 2024-01-03 21:38:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
