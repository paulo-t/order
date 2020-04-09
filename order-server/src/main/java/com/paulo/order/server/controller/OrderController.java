package com.paulo.order.server.controller;

import com.paulo.common.exception.BizException;
import com.paulo.common.model.BaseResponse;
import com.paulo.common.utils.BaseResponseUtils;
import com.paulo.order.server.biz.OrderService;
import com.paulo.product.common.model.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: create by paulo
 * @version: v1.0
 * @description: com.paulo.order.server.controller
 * @date:2020/4/9
 */
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/getAllPerson")
    public BaseResponse<List<PersonVO>> getAllPerson() {
        try {
            return BaseResponseUtils.success(orderService.getAllPerson());
        } catch (BizException e) {
            return BaseResponseUtils.error(e.getErrCode(), e.getMessage());
        }
    }

    @GetMapping("/getSinglePerson")
    public BaseResponse<PersonVO> getSinglePerson() {
        try {
            return BaseResponseUtils.success(orderService.getSinglePerson());
        } catch (BizException e) {
            return BaseResponseUtils.error(e.getErrCode(), e.getMessage());
        }
    }
}
