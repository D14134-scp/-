package com.hzit.bean.dao;

import com.hzit.bean.Emp;

import java.util.List;

public interface Empmapper {
 /*
    功能：根据指定条件查询 如果ename有值则查询；如果job不为空根据job查询。如果都为空 查询所有数据
  */
        public List<Emp> getEmpByParam(Emp emp);

        public List<Emp> getEmpByParam2(Emp emp);

        public  int updateEmp(Emp emp);
        //批量删除
        public  int deleteAll(List<Integer> ids);

        public  int insertAll(List<Emp> ids);
}
