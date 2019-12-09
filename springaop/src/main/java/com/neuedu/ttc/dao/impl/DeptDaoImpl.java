package com.neuedu.ttc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.neuedu.ttc.bean.Dept;
import com.neuedu.ttc.dao.DeptDao;
@Repository("deptdao")
public class DeptDaoImpl implements DeptDao{

	@Autowired
	private JdbcTemplate jt;
	@Autowired
	private Dept dept;
	@Override
	public int sdd(Dept dept) {
		
		String sql="insert into dept(deptno,dname,loc) values(?,?,?)";
		System.out.println("部门编号："+this.dept.getDeptno()+"--部门名称："+this.dept.getDname()+"--部门位置"+this.dept.getLoc());
		Object[] ags={this.dept.getDeptno(),this.dept.getDname(),this.dept.getLoc()};
		jt.update(sql, ags);
		return 0;
	}
	@Override
	public List<Dept> findAll() {
		List<Dept> list=new ArrayList<Dept>();
		String sql="select * from dept";
		list = jt.query(sql, new RowMapper<Dept>() {

			@Override
			public Dept mapRow(ResultSet rs, int rowNum) throws SQLException {
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				return dept;
			}
		});
		return list;
	}
/*	@Override
	public Dept findById() {
		String sql="select * from dept where deptno=?";
		dept = jt.query(sql, Object [] args, new RowMapper<Dept>(){
			
		});
		return dept;
	}*/
	@Override
	public Dept findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
