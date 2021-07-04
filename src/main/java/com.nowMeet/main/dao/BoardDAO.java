package com.nowMeet.main.dao;

import com.nowMeet.main.bean.BoardBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {
	/** The namespace. */
	private String namespace = "main.";

	@Autowired
	private SqlSessionTemplate sqlSession;

	/**
	 * 게시판 정보 리스트 DML을 한다.
	 */
	public List<BoardBean> selectBoardList() {
		return this.sqlSession.selectList("selectBoardList");
	}
}