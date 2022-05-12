package com.example.demo.repository.crawl;

import com.example.demo.entity.crawl.DaumNews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaumNewsCrawlRepository extends JpaRepository<DaumNews, Long> {
    public DaumNews findByNewsNo(String newsNo);
}
