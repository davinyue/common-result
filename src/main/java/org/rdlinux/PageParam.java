package org.rdlinux;

/**
 * 分页参数
 */
public class PageParam {
    /**
     * 当前页
     */
    private Integer currentPage;
    /**
     * 页大小
     */
    private Integer pageSize;

    public PageParam(int currentPage, int pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public PageParam() {
        this.currentPage = 1;
        this.pageSize = 10;
    }

    public Integer getCurrentPage() {
        if (this.currentPage == null || this.currentPage < 1) {
            this.currentPage = 1;
        }
        return this.currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        if (this.pageSize == null || this.pageSize < 1) {
            this.pageSize = 10;
        }
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
