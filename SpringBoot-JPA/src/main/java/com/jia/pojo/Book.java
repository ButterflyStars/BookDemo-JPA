package com.jia.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: 2020/4/16 0:25
 * Description: No Description
 */
@Entity
@Data
@ApiModel("书籍实体类")
public class Book {
    @Id
    @ApiModelProperty("主键")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ApiModelProperty("书籍名")
    private String name;
    @ApiModelProperty("作者")
    private String author;
    private String publish;
    private Double price;
    // private Integer enable;    //删除标志位
}
