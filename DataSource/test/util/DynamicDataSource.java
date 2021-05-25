package com.test.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * 动态切换数据源
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println("===== 当前数据源" + DynamicDataSourceContextHolder.get() + " =====");
        return DynamicDataSourceContextHolder.get();
    }

}
