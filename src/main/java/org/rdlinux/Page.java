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

    public Page() {
    }

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

    public Page<T> setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Page<T> setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public Page<T> setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public List<T> getData() {
        return this.data;
    }

    public Page<T> setData(List<T> data) {
        this.data = data;
        return this;
    }
}
