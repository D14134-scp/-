package com.hzit.bean.test;

import com.hzit.bean.Emp;
import com.hzit.bean.dao.Deptmapper;
import com.hzit.bean.dao.Empmapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test02 {

    public static void main(String[] args) throws IOException {

        //1)通过配置文件获取 SqlSessionFactory工厂
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2)生成SqlSession对象(jdbc中Connection对象)
        SqlSession sqlSession = sessionFactory.openSession(true);
        // 获取 mapper代理对象
        Empmapper mapper = sqlSession.getMapper(Empmapper.class);
          Date date =new Date();
//        Emp emp1 = new Emp();
//        emp1.setEmpno(7001);
//        emp1.setEname("张骗人");
        //emp1.setJob("总教主");

//        List<Emp> empList = mapper.getEmpByParam(emp1);
//        for (Emp emp : empList) {
//            System.out.println("emp = " + emp);
//        }


//        System.out.printf("============这是分割线===========");
//
//
//        List<Emp> empList2 = mapper.getEmpByParam2(emp1);
//        for (Emp emp : empList2) {
//            System.out.println("emp = " + emp);
//        }

//      int i =  mapper.updateEmp(emp1);
//        System.out.printf("i ="+ i);

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7002);
//        int i = mapper.deleteAll(list);
//        System.out.printf("i =" + i);

//          List<Emp> empList = new ArrayList<Emp>();
//          for (int i = 0; i < 3; i++){
//              Emp emp = new Emp();
//              emp.setEname("教中无名人士");
//              emp.setJob("杂兵");
//              emp.setMgr(7001+i);
//              emp.setHiredate(date);
//              emp.setSal(5202);
//              emp.setDeptno(9527);
//              empList.add(emp);
//
//          }
//
//          int i = mapper.insertAll(empList);
//          System.out.println(i);
//          for (Emp emp: empList){System.out.println(emp.getEmpno());
//          }


        List<Emp> empList1 = new ArrayList<Emp>();

        Emp emp1 = new Emp();
        emp1.setEname("韦一笑");
        emp1.setJob("护法");
        emp1.setMgr(7010);
        emp1.setHiredate(date);
        emp1.setSal(5555);
        emp1.setDeptno(9999);

        Emp emp2 = new Emp();
        emp2.setEname("阳顶天");
        emp2.setJob("前教主");
        emp2.setMgr(7000);
        emp2.setHiredate(date);
        emp2.setSal(0);
        emp2.setDeptno(1);

        empList1.add(emp1);
        empList1.add(emp2);






        mapper.insertAll(empList1);



        sqlSession.close();
    }

}
