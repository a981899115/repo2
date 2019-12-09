package com.neuedu.ttc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.ttc.bean.Dept;
import com.neuedu.ttc.dao.DeptDao;
import com.neuedu.ttc.service.DeptService;
@Service("deptservice")
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao dao;
	@Override
	public void add(Dept dept) {
		dao.sdd(dept);

	}

	@Override
	public void update() {
		System.out.println("这是修改部门---------");

	}

}
