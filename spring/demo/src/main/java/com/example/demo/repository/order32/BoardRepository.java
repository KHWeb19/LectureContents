package com.example.demo.repository.order32;

import com.example.demo.entity.order32.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Board> list() {
        // jdbcTemplate.query(A, B)
        // A에 해당하는 DB Query를 실행함
        // B에는 A에 배치될 정보들이 들어가며
        // 현재 RowMapper가 이 정보를 하나하나 처리해주고 있음
        // 모든 데이터를 싹 다 가져오게 되어있음
        List<Board> results = jdbcTemplate.query(
                "select board_no, title, content, writer, reg_date from board " +
                        "where board_no > 0 order by board_no desc",

                // 요놈이 하나씩 넘겨줌
                new RowMapper<Board>() {
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setRegDate(rs.getDate("reg_date"));

                        return board;
                    }
                }
        );

        return results;
    }
}
