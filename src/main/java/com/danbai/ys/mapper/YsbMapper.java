package com.danbai.ys.mapper;

import com.danbai.ys.entity.Ysb;
import com.danbai.ys.utils.MyMapper;
import com.danbai.ys.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Repository;

/**
 * @author danbai
 */

@Repository
@CacheNamespace(implementation = RedisCache.class)
public interface YsbMapper extends MyMapper<Ysb> {
}