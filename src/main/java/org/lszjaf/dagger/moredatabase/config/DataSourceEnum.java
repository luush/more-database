package org.lszjaf.dagger.moredatabase.config;

/**
 * Created by ZSX on 2018/1/18.
 *
 * @author ZSX
 */
public enum DataSourceEnum {

    /** 主库数据源 */
    MASTER("dataSourceOne", "first_datasource"),

    /** 从库数据源 */
    SLAVE("slave", "second_datasource");


    private DataSourceEnum(String key, String description) {
        this.key = key;
        this.description = description;
    }

    /** 数据源对应的key(用于在Spring配置文件中指定数据源Map中的key使用) */
    private String key;

    /** 说明 */
    private String description;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
