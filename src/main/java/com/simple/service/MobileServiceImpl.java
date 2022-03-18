package com.simple.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.entity.Mobile;
import com.simple.repository.MobileRepository;
@Service
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public Mobile saveMobile(Mobile mob) {
		// TODO Auto-generated method stub
		return mobileRepository.save(mob);
	}

	@Override
	public Optional<Mobile> getMobileById(long id) {
		// TODO Auto-generated method stub
		return mobileRepository.findById(id);
	}

	@Override
	public Mobile updateMobile(Mobile mob) {
		// TODO Auto-generated method stub
		return mobileRepository.save(mob);
	}

}
