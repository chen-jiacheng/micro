package com.chenjiacheng.micro.web.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
  @GetMapping("/druid-status")
  public Object druidStat(){
      return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
  }
}