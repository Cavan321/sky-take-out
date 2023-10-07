package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * @author Cavan
 * @date 2023-10-07
 * @qq 2069543852
 */
public interface ReportService {

    /**
     * 根据时间区间统计营业额
     * @param begin:
     * @param end:
     * @return Object
     */
    TurnoverReportVO getTurnover(LocalDate begin, LocalDate end);
}
