package com.simple.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.entity.Mobile;
import com.simple.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	
	@Autowired
	private MobileService mobileService;
	
	@PostMapping("/savemobile")
	public Mobile saveMobile(@RequestBody() Mobile mob)
	{
		return mobileService.saveMobile(mob);
	}
	@GetMapping("/getmobile/{id}")
	public Mobile getMobile(@PathVariable("id") long id)
	{
	 Mobile mob=null;
	 try
	 {
		 mob=mobileService.getMobileById(id).orElseThrow(()->new Exception("this is not available"));
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
		return mob;
	
	}
	@PutMapping("/updatemobile/{id}")
	public Mobile updateMobile(@RequestBody() Mobile ui,@PathVariable("id") long id)
	{
		Optional<Mobile> mobile=mobileService.getMobileById(id);
		if(mobile.isPresent())
		
		{
			Mobile mb=mobile.get();
			mb.setMobilename(ui.getMobilename());
			mb.setMobiletype(ui.getMobiletype());
			mobileService.updateMobile(mb);
		}
		
		return ui;
		
		
	}
	

}
