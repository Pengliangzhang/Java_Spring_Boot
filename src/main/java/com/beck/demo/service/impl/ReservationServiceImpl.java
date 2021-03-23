package com.beck.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.beck.demo.entities.Reservation;
import com.beck.demo.mappers.ReservationMapper;
import com.beck.demo.service.ReservationService;
import org.springframework.stereotype.Service;

/**
 * @author Pengliang_Zhang
 * @date 2021-03-22 3:44 p.m.
 */
@Service
public class ReservationServiceImpl extends ServiceImpl<ReservationMapper, Reservation> implements ReservationService {

    @Override
    public String getReservation() {
        return "This message from impl class";
    }
}
