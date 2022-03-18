package com.simple.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.simple.entity.Mobile;
@Service
public interface MobileService {
	
	public Mobile saveMobile(Mobile mob);
	public Optional<Mobile> getMobileById(long id);
	public Mobile updateMobile(Mobile mob);

}
