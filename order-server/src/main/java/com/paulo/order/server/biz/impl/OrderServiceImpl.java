package com.paulo.order.server.biz.impl;

import com.paulo.common.enums.ResponseStatus;
import com.paulo.common.exception.BizException;
import com.paulo.common.model.BaseResponse;
import com.paulo.order.server.biz.OrderService;
import com.paulo.product.client.ProductClient;
import com.paulo.product.common.model.PersonVO;
import com.paulo.product.common.model.SinglePersonRequestVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: create by paulo
 * @version: v1.0
 * @description: com.paulo.order.server.biz.impl
 * @date:2020/4/9
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    ProductClient productClient;

    @Override
    public List<PersonVO> getAllPerson() throws BizException {
        BaseResponse<List<PersonVO>> allPersonRet = productClient.getAllPerson();
        if (allPersonRet.getCode() != 200) {
            throw new BizException(ResponseStatus.ERROR.getCode() + 1, "人员列表获取失败");
        }
        return allPersonRet.getData();
    }

    @Override
    public PersonVO getSinglePerson() throws BizException {
        SinglePersonRequestVO requestVO = new SinglePersonRequestVO();
        requestVO.setId(1);
        requestVO.setName("paulo");
        BaseResponse<PersonVO> singlePersonRet = productClient.getSinglePerson(requestVO);
        if (singlePersonRet.getCode() != 200) {
            throw new BizException(ResponseStatus.ERROR.getCode() + 1, "人员信息获取失败");
        }
        return singlePersonRet.getData();
    }
}
