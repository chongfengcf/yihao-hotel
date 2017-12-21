package com.jiudian.bill.action;

import com.jiudian.bill.service.BillService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")
public class BillManageAction extends ActionSupport {

    @Autowired
    private BillService billService;

    private int page;
    private int limit;

    /**
     * 显示账单页
     * */
    @Action(value = "/sys/bill/bill",
            results = {@Result(name = "index", location = "/bill/bill.jsp")})
    public String index() {
        return "index";
    }

    /**
     * 分页返回账单json
     *
     */
    @Action(value = "/sys/bill/findBill")
    public void findAllRoom() throws IOException {
        String jsonstring = this.billService.billsPagination(page, limit);
        ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
        ServletActionContext.getResponse().getWriter().write(jsonstring);
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
