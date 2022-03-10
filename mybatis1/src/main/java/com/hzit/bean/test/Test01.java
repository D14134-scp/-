package com.hzit.bean.test;

import com.hzit.bean.Dept;
import com.hzit.bean.dao.Deptmapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {

    public static void main(String[] args) throws IOException {

        //1)通过配置文件获取 SqlSessionFactory工厂
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2)生成SqlSession对象(jdbc中Connection对象)
        SqlSession sqlSession = sessionFactory.openSession(true);
        // 获取 mapper代理对象
        Deptmapper mapper = sqlSession.getMapper(Deptmapper.class);


        //resultmap 测试
//        Dept deptres = mapper.selectDeptByLocinres("西安");
//        System.out.println(deptres);


          //单条查询
//        System.out.println(">>>通过ID(deptno)获取信息");
//        Dept testdept = mapper.findDeptById(1004);
//        System.out.println(testdept);
          //全部查询
//        System.out.println(">>>获取所有信息");
//        List<Dept> deptList = mapper.selectAll();
//        System.out.println(deptList);




        //3)执行statement语句对象：通过mapper文件中的namespace+id
        //提供了增删改查的接口 相对应mapper文件中的内容


        //查询一条 sqlSession.selectOne("");
//        selectOne:查询一条记录，如果使用selectOne查询多条记录则抛出异常：
//        Dept deptfindbyid =sqlSession.selectOne("com.hzit.bean.dao.Deptmapper.findDeptById", 1001);
//        // 输出用户信息
//        System.out.println("deptfindbyid 员工记录为 " + deptfindbyid);

        // 模糊查询 sqlSession.selectList("");

//            List<Dept> selectByloc = mapper.selectByloc("深圳");
//            for (Dept dept : selectByloc) {
//            System.out.println("dept = " + dept);
//        }





//
//
//        // 查询多条 sqlSession.selectList("");
//        // selectList:可以查询一条或多条记录。
//        List<Dept> deptList = sqlSession.selectList("com.hzit.bean.dao.Deptmapper.selectAll"); // 查询一条
//        for (Dept dept : deptList) {
//            System.out.println("dept = " + dept);
//        }
//        // 模糊查询 sqlSession.selectList("");
//        List<Dept> selectByloc = sqlSession.selectList("com.hzit.bean.dao.Deptmapper.selectByloc","深圳");
//        for (Dept dept : selectByloc){
//        System.out.println("dept = " + dept);
//             }


        //sqlSession.insert(""); 插入添加记录    deptno为主键
//        Dept addDept =new Dept();
//        addDept.setDeptno(1004);
//        addDept.setDname("销售部");
//        addDept.setLoc("西安");
//        int row = sqlSession.insert("com.hzit.bean.dao.Deptmapper.addDept", addDept);
//        System.out.println(row);
//        sqlSession.commit();


        //sqlSession.update("");   根据ID（员工编号 deptno）更新修改记录
//        Dept updateDept = sqlSession.selectOne("com.hzit.bean.dao.Deptmapper.findDeptById", 1004);
//        System.out.println("修改之前:" + updateDept);
//
//        // 修改
//        updateDept.setDname("销售部");
//        sqlSession.update("bj2202.hello.mybatis.updateDept", updateDept);
//        sqlSession.commit();
//
//        Dept newDept = sqlSession.selectOne("com.hzit.bean.dao.Deptmapper.findDeptById", 1004);
//        System.out.println("修改之后:" + newDept);


//        //sqlSession.delete(""); 根据ID（员工编号 deptno）删除记录
//        int row = sqlSession.delete("com.hzit.bean.dao.Deptmapper.deleteDeptById", 13);
//        System.out.println(row);
//        sqlSession.commit();
        // 关闭资源
        sqlSession.close();
    }

}
