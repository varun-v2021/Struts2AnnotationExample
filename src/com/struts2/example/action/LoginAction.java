package com.struts2.example.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/Login")
@ResultPath(value="/")
@Action(value = "User", results = {@Result(name="success",location="pages/login.jsp")})
public class LoginAction extends ActionSupport {

}//There is no Action mapped for namespace / and action name User.
