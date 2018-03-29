package com.struts2.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@InterceptorRefs(value = {
    @InterceptorRef("customInterceptor"),
    @InterceptorRef("defaultStack")
})
@ParentPackage(value = "default-helloworld")
@Namespace("/")
@ResultPath("/")
public class HelloWorld extends ActionSupport {
  @Action(value="action1", interceptorRefs=@InterceptorRef("validation"), results = {@Result(name="success",location="/result.jsp")})
  public String execute() {
    return SUCCESS;
  }

  @Action(value="action2")
  public String doSomething() {
    return SUCCESS;
  }
}