package com.ihandy.quote_core.serverdb.dao;

import com.ihandy.quote_core.serverdb.model.TlCheXianSearchPeopleInfo;

public interface TlCheXianSearchPeopleInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_PEOPLEINFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long numPeopleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_PEOPLEINFO
     *
     * @mbggenerated
     */
    int insert(TlCheXianSearchPeopleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_PEOPLEINFO
     *
     * @mbggenerated
     */
    int insertSelective(TlCheXianSearchPeopleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_PEOPLEINFO
     *
     * @mbggenerated
     */
    TlCheXianSearchPeopleInfo selectByPrimaryKey(Long numPeopleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_PEOPLEINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TlCheXianSearchPeopleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QCYB.TL_CHEXIAN_SEARCH_PEOPLEINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TlCheXianSearchPeopleInfo record);
}