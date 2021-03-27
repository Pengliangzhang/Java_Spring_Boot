package com.beck.demo.controllers;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Pengliang_Zhang
 * @date 2021-03-22 3:08 p.m.
 */
@Api
@RestController
@RequestMapping("/main")
public class MainController {
    /**
     *
     *
     * @author Pengliang
     * @date 2021/03/22
     */
    @GetMapping("/basic")
    @ApiOperation("Get basic info")
    public String getBasicInfo() {
        return "";//reservationService.getReservation();
    }
}
