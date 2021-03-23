package com.beck.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beck.demo.entities.Reservation;

/**
 * @author Pengliang_Zhang
 * @date 2021-03-22 3:44 p.m.
 */
public interface ReservationService extends IService<Reservation> {
    String getReservation();
}
