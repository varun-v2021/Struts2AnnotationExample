package com.struts2.example.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/Simple")
@ResultPath(value="/")
@Action(value = "action", results = {@Result(name="success",location="/simple.jsp")})
public class SimpleAction extends ActionSupport {

}//There is no Action mapped for namespace / and action name User.
