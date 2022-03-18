package com.simple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simple.entity.Mobile;
@Repository
public interface MobileRepository extends JpaRepository<Mobile, Long> {

}
