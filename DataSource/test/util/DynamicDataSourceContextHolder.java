package com.test.util;

public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<String> currenDataSource = new ThreadLocal<>();

    /**
     * 清除数据源
     */
    public static void clear() {
        currenDataSource.remove();
    }

    /**
     * 获取数据源
     *
     * @return
     */
    public static String get() {
        return currenDataSource.get();
    }

    /**
     * 设置数据源
     *
     * @param datasource
     */
    public static void setDataSource(String datasource) {
        currenDataSource.set(datasource);
    }

}
