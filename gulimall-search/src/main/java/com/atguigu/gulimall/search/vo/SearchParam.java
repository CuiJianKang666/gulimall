package com.atguigu.gulimall.search.vo;

import lombok.Data;

import java.util.List;

/**
 * 封装页面所有可能传递过来的查询条件
 */

@Data
public class SearchParam {
    private String keyword; //页面传递过来的全文匹配关键字
    private List<Long> brandId; //品牌id,可以多选
    private Long catalog3Id; //三级分类id
    /**
     * 排序条件：sort=price/salecount/hotscore_desc/asc
     */
    private String sort;
    private Integer hasStock; //是否显示有货
    /**
     * hasStock=0/1
     * skuPrice=1_500/_500/500_  1-500 小于500 大于500
     */
    private String skuPrice; //价格区间查询
    private List<String> attrs; //按照属性进行筛选
    private Integer pageNum = 1; //页码
    private String _queryString; //原生的所有查询条件

}
