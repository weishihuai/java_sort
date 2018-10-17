package com.wsh.sort.comparable;

import java.util.Date;

/**
 * @Description: 新闻类
 * @Author: weishihuai
 * @Date: 2018/10/17 21:53
 * <p>
 * Comparable的使用方法: 实现compareTo方法
 */
public class News implements Comparable<News> {
    /**
     * 浏览量
     */
    private int hits;
    /**
     * 发布时间
     */
    private Date publishDate;
    /**
     * 标题
     */
    private String title;

    public News() {
    }

    public News(int hits, Date publishDate, String title) {
        this.hits = hits;
        this.publishDate = publishDate;
        this.title = title;
    }

    @Override
    public int compareTo(News o) {
        int result;
        //发布日期降序
        result = -this.publishDate.compareTo(o.publishDate);
        if (result == 0) {
            //浏览量升序
            result = this.hits - o.hits;
            if (result == 0) {
                //标题降序
                result = -this.title.compareTo(o.title);
            }
        }
        return result;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "hits=" + hits +
                ", publishDate=" + publishDate +
                ", title='" + title + '\'' +
                '}' + "\n";
    }
}
