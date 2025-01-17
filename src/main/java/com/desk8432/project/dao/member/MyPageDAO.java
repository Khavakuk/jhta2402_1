package com.desk8432.project.dao.member;

import com.desk8432.project.dto.member.MyPageDTO;
import com.desk8432.project.mybatis.MybatisConnectionFactory;
import org.apache.ibatis.session.SqlSession;

public class MyPageDAO {
    public MyPageDTO loginMember(MyPageDTO myPageDTO) {
        MyPageDTO loginMemberDTO = null;
        SqlSession sqlSession = MybatisConnectionFactory.getSqlSession();
        loginMemberDTO = sqlSession.selectOne("getMember", myPageDTO);
        System.out.println("====="+loginMemberDTO.toString());
        sqlSession.close();
        return loginMemberDTO;
    }
}
