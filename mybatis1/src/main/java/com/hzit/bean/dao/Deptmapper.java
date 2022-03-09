package com.hzit.bean.dao;

import com.hzit.bean.Dept;

import java.util.List;

public interface Deptmapper {
        public Dept findDeptById(int deptno);
        public List<Dept> selectAll();
        public List<Dept> selectByloc(String loc);
}
