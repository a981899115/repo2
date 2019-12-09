package com.neuedu.ttc.dao;

import java.util.List;

import com.neuedu.ttc.bean.Dept;

public interface DeptDao {
	int sdd(Dept dept);
	
	List<Dept> findAll();
	
	Dept findById();

}
