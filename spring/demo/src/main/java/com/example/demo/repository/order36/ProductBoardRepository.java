package com.example.demo.repository.order36;

import com.example.demo.entity.order36.ProductBoard;
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
public class ProductBoardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (ProductBoard productBoard) {
        String query = "insert into product_board (title, description, price, writer) " +
                "values (?, ?, ?, ?)";

        jdbcTemplate.update(query, productBoard.getTitle(), productBoard.getDescription(),
                productBoard.getPrice(), productBoard.getWriter());
    }

    public List<ProductBoard> list() {
        List<ProductBoard> results = jdbcTemplate.query(
                "select * from product_board " +
                        "where product_no > 0 order by product_no desc",

                new RowMapper<ProductBoard>() {
                    @SneakyThrows
                    @Override
                    public ProductBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                        ProductBoard productBoard = new ProductBoard();

                        productBoard.setProductNo(rs.getInt("product_no"));
                        productBoard.setTitle(rs.getString("title"));
                        productBoard.setDescription(rs.getString("description"));
                        productBoard.setPrice(rs.getInt("price"));
                        productBoard.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate =
                                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        productBoard.setRegDate(printDate.parse(dbDate));

                        return productBoard;
                    }
                }
        );

        return results;
    }

    public ProductBoard read(Integer productNo) {
        List<ProductBoard> results = jdbcTemplate.query(
                "select * from product_board " +
                        "where product_no = ?",

                new RowMapper<ProductBoard>() {
                    @SneakyThrows
                    @Override
                    public ProductBoard mapRow(ResultSet rs, int rowNum) throws SQLException {
                        ProductBoard productBoard = new ProductBoard();

                        productBoard.setProductNo(rs.getInt("product_no"));
                        productBoard.setTitle(rs.getString("title"));
                        productBoard.setDescription(rs.getString("description"));
                        productBoard.setPrice(rs.getInt("price"));
                        productBoard.setWriter(rs.getString("writer"));

                        SimpleDateFormat printDate =
                                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        String dbDate = rs.getDate("reg_date") + " " + rs.getTime("reg_date");
                        productBoard.setRegDate(printDate.parse(dbDate));

                        return productBoard;
                    }
                }, productNo
        );

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer productNo) {
        String query = "delete from product_board where product_no = ?";

        jdbcTemplate.update(query, productNo);
    }

    public void update(ProductBoard productBoard) {
        String query = "update product_board set title = ?, description = ?, " +
                "price = ? where product_no = ?";

        jdbcTemplate.update(query, productBoard.getTitle(), productBoard.getDescription(),
                productBoard.getPrice(), productBoard.getProductNo());
    }
}
