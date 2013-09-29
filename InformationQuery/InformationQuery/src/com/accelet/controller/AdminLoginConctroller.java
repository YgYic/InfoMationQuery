package com.accelet.controller;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.accelet.database.IDbAccess;

import x.y.service.Foo;

@Controller
@SessionAttributes("admin_name")
public class AdminLoginConctroller {
	@Resource(name="dbAccess")
	private IDbAccess dbAccess;
	/**
	 *  WebDataBinder 对应请求参数的绑定关系，
	 *  registerCustomEditor绑定form标签	下相应属性的验证关系(对应于foo对象中个参数)。
	 */
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
        binder.registerCustomEditor(String.class, "username", new PropertyEditorSupport(false){
        	@Override
        	public void setAsText(String text) {
        		if (text == null) {
        			setValue(null);
        		}
        		else {
        			String value = text.trim();
        			setValue(value + "ddddsasdsda");
        		}
        	}
        });
    }
	
	@RequestMapping(value="login.do", method=RequestMethod.GET)
    public ModelAndView index() {
		//参数foo指示jsp页面form标签对应的commandName和modelAttribute="foo" 
		//其中form中各标签的path对应foo对象中的各个属性
        ModelAndView mav = new ModelAndView("login", "foo", new Foo());
        //mav.addObject("message", "Hello World!");
        dbAccess.queryCircleAdmin2();
        dbAccess.queryUserInfo();
        return mav;
    }
	
	/**
	 *  @Valid 注释，表明foo对象用于验证请求参数
	 *  ModelMap.addAttribute 用于存储后台传给前台的数据，跟ModelAndView.addObject方法类似
	 *  如果将该方法的返回值改为String则返回值表示对应的jsp页面名称
	 *  即如下方法可以用ModelMap和String类型的返回值代替
	 */
	@RequestMapping(value="login.do", method=RequestMethod.POST)
    public String login(/*@ModelAttribute("currentUser")*/ @Valid Foo foo, BindingResult errorResult, ModelMap model) {
		ModelAndView mav = new ModelAndView();
		System.out.println(foo.getPassword());
		System.out.println(foo.getUsername());
		if (errorResult.hasErrors()) {
			model.addAttribute("admin_name","心理咨询师");
			mav.setViewName("login");
			mav.addObject("key", "adsc");
			return "login";
			//return mav;
		}
		model.addAttribute("admin_name","心理咨询师");
        mav.setViewName("main");
        mav.addObject("message", "Hello World!");
        return "main";
        //return mav;
    }
	
}
