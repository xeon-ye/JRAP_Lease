package com.jingrui.jrap.product.controllers;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import com.jingrui.jrap.system.controllers.BaseController;
import com.jingrui.jrap.core.IRequest;
import com.jingrui.jrap.system.dto.ResponseData;
import com.jingrui.jrap.product.dto.Good;
import com.jingrui.jrap.product.service.IGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

@Controller
public class GoodController extends BaseController {

  @Autowired
  private IGoodService service;


  @RequestMapping(value = "/afd/good/query")
  @ResponseBody
  public ResponseData query(Good dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
      @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
    IRequest requestContext = createRequestContext(request);
    return new ResponseData(service.select(requestContext, dto, page, pageSize));
  }

  @RequestMapping(value = "/afd/good/submit")
  @ResponseBody
  public ResponseData update(@RequestBody List<Good> dto, BindingResult result,
      HttpServletRequest request) {
    getValidator().validate(dto, result);
    if (result.hasErrors()) {
      ResponseData responseData = new ResponseData(false);
      responseData.setMessage(getErrorMessage(result, request));
      return responseData;
    }
    IRequest requestCtx = createRequestContext(request);
    return new ResponseData(service.batchUpdate(requestCtx, dto));
  }

  @RequestMapping(value = "/afd/good/remove")
  @ResponseBody
  public ResponseData delete(HttpServletRequest request, @RequestBody List<Good> dto) {
    service.batchDelete(dto);
    return new ResponseData();
  }

  /*
   * 产品发布启动工作流
   * */
  @RequestMapping(value = "/wfl/runtime/processInstances/good/release", method = RequestMethod.POST, produces = "application/json")
  @ResponseBody
  public ResponseData createVacationProcessInstance(@RequestBody Good good,
      HttpServletRequest httpRequest, HttpServletResponse response) {
    IRequest iRequest = createRequestContext(httpRequest);
    service.createVacationInstance(iRequest, good);
    return new ResponseData();
  }

}

