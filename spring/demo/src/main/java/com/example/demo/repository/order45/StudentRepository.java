package com.example.demo.repository.order45;

import com.example.demo.entity.order32.Board;
import com.example.demo.entity.order45.Student;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (Student student) {
        String query = "insert into student (name, classnum, math, english, korean, science) values (?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(query, student.getName(), student.getClassnum(), student.getMath(),
                    student.getEnglish(), student.getKorean(), student.getScience());
    }

    public List<Student> list() {
        List<Student> results = jdbcTemplate.query(
                "select * from student " +
                        "where student_no > 0 order by student_no desc",

                new RowMapper<Student>() {
                    @SneakyThrows
                    @Override
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student student = new Student();

                        student.setStudentNo(rs.getInt("student_no"));
                        student.setName(rs.getString("name"));
                        student.setClassnum(rs.getInt("classnum"));
                        student.setKorean(rs.getInt("korean"));
                        student.setEnglish(rs.getInt("english"));
                        student.setMath(rs.getInt("math"));
                        student.setScience(rs.getInt("science"));

                        SimpleDateFormat printDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        student.setRegDate(printDate.parse(dbDate));

                        return student;
                    }
                }
        );

        return results;
    }
}
