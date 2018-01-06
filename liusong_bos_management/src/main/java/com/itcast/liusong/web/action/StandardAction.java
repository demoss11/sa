package com.itcast.liusong.web.action;

import com.itcast.liusong.service.base.IStandardService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import static com.opensymphony.xwork2.Action.SUCCESS;


/**
 * Created by l1003 on 2018/1/6.
 */

@ParentPackage("struts-default")
@Namespace("/liusong_bos_management")
@Controller
public class StandardAction {
    @Autowired
    private IStandardService standardService;
    @Action(value = "standard_save",results = {@Result(name = "success",location = "/success.html")})
    public String save(){
        //standardService.save();
        return SUCCESS;
    }
}
