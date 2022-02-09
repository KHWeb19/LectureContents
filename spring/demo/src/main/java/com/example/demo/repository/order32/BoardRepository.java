package com.example.demo.repository.order32;

import com.example.demo.entity.order32.Board;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Repository
public class BoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (Board board) {
        String query = "insert into board (title, content, writer) values (?, ?, ?)";

        // 위의 DB 쿼리에 대응하는 녀석들이
        // 각각 board.getTitle(), board.getContent(), board.getWriter()에 해당함
        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getWriter());
    }

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
                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));

                        // pattern 형태의 시간 포맷을 가지게 만듬
                        // 연도-월-일 시:분:초
                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        // getDate()를 통해 DB상의 날자
                        // getTime()을 통해 DB상의 시간
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        // 이 문자열 형식을 위의 패턴 형태로 만들어서 객체에 저장
                        board.setRegDate(printDate.parse(dbDate));

                        return board;
                    }
                }
        );

        return results;
    }

    public Board read(Integer boardNo) {
        List<Board> results = jdbcTemplate.query(
                "select * from board " +
                        "where board_no = ?",

                new RowMapper<Board>() {
                    @SneakyThrows
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Board board = new Board();

                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        // getDate()를 통해 DB상의 날자
                        // getTime()을 통해 DB상의 시간
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        // 이 문자열 형식을 위의 패턴 형태로 만들어서 객체에 저장
                        board.setRegDate(printDate.parse(dbDate));

                        return board;
                    }
                }, boardNo
        );

        // 정보를 찾지 못했다면 null 있다면 해당 내용 리턴 (0번 인덱스 - 결국 한개)
        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer boardNo) {
        String query = "delete from board where board_no = ?";

        jdbcTemplate.update(query, boardNo);
    }

    public void update(Board board) {
        String query = "update board set title = ?, content = ? where board_no = ?";

        jdbcTemplate.update(query, board.getTitle(), board.getContent(), board.getBoardNo());
    }
}
