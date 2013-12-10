package com.accelet.controller.accountsQuery;


import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountsInfoQuery {
	
	@RequestMapping("query.do")
    public ModelAndView query() {
		System.out.println("Ht wd");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloWorld");
        mav.addObject("message", "Hello World!!!!!");
        return mav;
    }
	
	@RequestMapping("/query/queryInfo")
    public ModelAndView queryInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloWorld");
        mav.addObject("message", "Query Info!!!!!");
        return mav;
    }
	
	@RequestMapping(value="/query/upload", method=RequestMethod.POST)
    public ModelAndView upload(@RequestParam("name") String name, 
            @RequestParam("file") MultipartFile file) { 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("helloWorld");
		if (!file.isEmpty()) { 
            try {
				byte [] bytes = file.getBytes();
				System.out.println(bytes.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            // store the bytes somewhere 
            mav.addObject("message", "redirect:uploadSuccess");
        } else { 
        	 mav.addObject("message", "redirect:uploadFailure");
        } 
        
        //mav.addObject("message", "Query Info!!!!!");
        return mav;
    }
	
	@RequestMapping(value="/query/{ownerId}", method=RequestMethod.GET)
	public String findOwner(@PathVariable String ownerId, Model model) {
	  model.addAttribute("owner", ownerId);  
	  return "displayOwner"; 
	}
	
		
}
