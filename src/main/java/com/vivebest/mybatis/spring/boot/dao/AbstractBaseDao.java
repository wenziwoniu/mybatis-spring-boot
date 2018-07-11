/*
 * @(#)AbstractBase.java 2015年7月14日 Copy Right 2015 Tencent Group Holding Limited. All
 * Copyright Reserved
 */

package com.vivebest.mybatis.spring.boot.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 所有Dao的基类
 * 
 * @version 1.0.0,2015年7月14日
 * @author zhengzhangwen
 * @since 1.0.0
 */
public interface AbstractBaseDao<T> {

    List<T> find(T obj);

    List<T> find();

    T findOne(Serializable serializable);

    T findOneByParam(Object param);

    List<T> findAllByParam(Object param);

    int findAllByParamCount(Object param);

    int insert(T obj);

    boolean exists(Serializable serializable);

    int delete(Serializable serializable);

    int delete(T obj);

    int update(T obj);

    int saveOrUpdate(T obj);

    int findCount(T obj);
}
