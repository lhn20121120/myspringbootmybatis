package com.lk.lambda.controller;

import com.lk.lambda.common.result.JsonResult;
import com.lk.lambda.model.Wife;
import com.lk.lambda.service.WifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WifeController extends BaseController {
    private WifeService wifeService;
    @Autowired
    public WifeController(WifeService wifeService){
        this.wifeService = wifeService;
    }
    @GetMapping("/wifes")
    public JsonResult getWifeList (){
        List<Wife> wifelist = wifeService.selectList();
        return renderSuccess(wifelist);
    }
}
