package org.rdlinux;

import java.util.List;

public class Page<T> {
    /**
     * 当前页
     */
    private Integer currentPage;
    /**
     * 页大小
     */
    private Integer pageSize;
    /**
     * 总数据
     */
    private Integer total;
    /**
     * 数据
     */
    private List<T> data;

    public Page(PageParam pageParam, int total, List<T> data) {
        this.currentPage = pageParam.getCurrentPage();
        this.pageSize = pageParam.getPageSize();
        this.total = total;
        this.data = data;
    }

    public Page(int currentPage, int pageSize, int total, List<T> data) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.total = total;
        this.data = data;
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
