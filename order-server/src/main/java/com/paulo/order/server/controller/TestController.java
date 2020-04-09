package com.paulo.order.server.controller;

import com.paulo.common.model.BaseResponse;
import com.paulo.product.client.ProductClient;
import com.paulo.product.common.model.PersonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: create by paulo
 * @version: v1.0
 * @description: com.paulo.order.server.controller
 * @date:2020/4/9
 */
@RestController
public class TestController {
    @Resource
    ProductClient productClient;

    @GetMapping("/getPersonList")
    public BaseResponse<List<PersonDTO>> getPersonList(){
       return productClient.getAllPerson();
    }
}
