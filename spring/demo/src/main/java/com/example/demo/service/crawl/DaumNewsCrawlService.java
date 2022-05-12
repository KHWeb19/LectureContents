package com.example.demo.service.crawl;

import com.example.demo.entity.crawl.DaumNews;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public interface DaumNewsCrawlService {
    public Document connectUrl (String url);
    public List<DaumNews> daumNewsFindAll ();
    public void daumNewsMainCrawler (String category);
    public void daumNewsCrawling (Elements elements, String category);
}
