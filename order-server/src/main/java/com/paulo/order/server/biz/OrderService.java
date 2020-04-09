package com.paulo.order.server.biz;

import com.paulo.common.exception.BizException;
import com.paulo.common.model.BaseResponse;
import com.paulo.product.common.model.PersonVO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author: create by paulo
 * @version: v1.0
 * @description: com.paulo.order.server.biz
 * @date:2020/4/9
 */
public interface OrderService {
    /**
     *获取人员列表
     */
    List<PersonVO> getAllPerson() throws BizException;
    /**
     * 获取单个人员
     */
    PersonVO getSinglePerson() throws BizException ;
}
