package com.neuedu.ttc.springaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neuedu.ttc.bean.Dept;
import com.neuedu.ttc.service.DeptService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/spring.xml"})
public class DeptTest {
	@Autowired
	private DeptService service;
	@Autowired
	private Dept dept;
	@Test
	public void test() {
		dept.setDeptno(1223);
		dept.setDname("sdssds");
		dept.setLoc("ccccc");
		service.add(dept);
	}

}
