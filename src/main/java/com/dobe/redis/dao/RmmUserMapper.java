package com.dobe.redis.dao;

import com.dobe.redis.pojo.RmmUser;

public interface RmmUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmm_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmm_user
     *
     * @mbggenerated
     */
    int insert(RmmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmm_user
     *
     * @mbggenerated
     */
    int insertSelective(RmmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmm_user
     *
     * @mbggenerated
     */
    RmmUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmm_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RmmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmm_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RmmUser record);
}