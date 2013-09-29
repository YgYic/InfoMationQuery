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
	 *  WebDataBinder ��Ӧ��������İ󶨹�ϵ��
	 *  registerCustomEditor��form��ǩ	����Ӧ���Ե���֤��ϵ(��Ӧ��foo�����и�����)��
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
		//����fooָʾjspҳ��form��ǩ��Ӧ��commandName��modelAttribute="foo" 
		//����form�и���ǩ��path��Ӧfoo�����еĸ�������
        ModelAndView mav = new ModelAndView("login", "foo", new Foo());
        //mav.addObject("message", "Hello World!");
        dbAccess.queryCircleAdmin2();
        dbAccess.queryUserInfo();
        return mav;
    }
	
	/**
	 *  @Valid ע�ͣ�����foo����������֤�������
	 *  ModelMap.addAttribute ���ڴ洢��̨����ǰ̨�����ݣ���ModelAndView.addObject��������
	 *  ������÷����ķ���ֵ��ΪString�򷵻�ֵ��ʾ��Ӧ��jspҳ������
	 *  �����·���������ModelMap��String���͵ķ���ֵ����
	 */
	@RequestMapping(value="login.do", method=RequestMethod.POST)
    public String login(/*@ModelAttribute("currentUser")*/ @Valid Foo foo, BindingResult errorResult, ModelMap model) {
		ModelAndView mav = new ModelAndView();
		System.out.println(foo.getPassword());
		System.out.println(foo.getUsername());
		if (errorResult.hasErrors()) {
			model.addAttribute("admin_name","������ѯʦ");
			mav.setViewName("login");
			mav.addObject("key", "adsc");
			return "login";
			//return mav;
		}
		model.addAttribute("admin_name","������ѯʦ");
        mav.setViewName("main");
        mav.addObject("message", "Hello World!");
        return "main";
        //return mav;
    }
	
}
