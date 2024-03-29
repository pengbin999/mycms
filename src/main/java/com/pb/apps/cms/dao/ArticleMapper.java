package com.pb.apps.cms.dao;

import com.pb.apps.cms.bean.Article;
import com.pb.apps.cms.bean.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    long countByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    int deleteByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    int insertSelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    List<Article> selectByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    Article selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article
     *
     * @mbg.generated Tue Nov 19 09:25:57 GMT+08:00 2019
     */
    int updateByPrimaryKey(Article record);
}