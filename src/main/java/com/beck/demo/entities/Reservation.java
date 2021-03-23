package com.beck.demo.entities;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;

/**
 * @author Pengliang_Zhang
 * @date 2021-03-22 3:46 p.m.
 */
@TableName("reservation")
@ApiModel(value = "Reservation object", description = "")
public class Reservation extends Model<Reservation> {

}
