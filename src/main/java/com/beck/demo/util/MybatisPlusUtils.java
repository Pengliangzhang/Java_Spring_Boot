package com.beck.demo.util;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author Pengliang_Zhang
 * @date 2021-03-27 8:23 a.m.
 */
public class MybatisPlusUtils {
    public static void main(String[] atgs) {
        AutoGenerator ag = new AutoGenerator();

        // Step 1: For Global Config
        GlobalConfig config = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        // Step 2: whether use AR(Active Record Model)
        config.setActiveRecord(true)
                .setAuthor("MyBatisPlus Generator")
                .setOutputDir(projectPath + "/target")
                .setOpen(false)
                .setFileOverride(true)
                .setIdType(IdType.AUTO)
                .setServiceName("sService")
                .setSwagger2(true)
                .setBaseResultMap(true)
                .setBaseColumnList(true);

        // Step 3: config dataSource, to connect to local
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/java_spring_boot_db?useUnicode=true&useSSL=false&characterEncoding=utf8")
                .setUsername("beckroot")
                .setPassword("Beckroot147");

        // Step 4: Strategy config for global configuration
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setEntityLombokModel(false)
                .setRestControllerStyle(false)
                .setEntityTableFieldAnnotationEnable(true)
                .setEnableSqlFilter(false)
                // reservation is the table name
                .setInclude(new String[]{"reservation"});

        // Step 5: package config, will auto generate entity/mapper/service/serviceImpl files to the package
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("")
                .setMapper("com.beck.demo.mapper")
                .setService("com.beck.demo.service")
                .setServiceImpl("com.beck.demo.service.impl")
                .setController("com.beck.demo.controller")
                .setEntity("com.beck.demo.entity");

        // Step 6: template config
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
        templateConfig.setController(null);

        // Step 7:
        ag.setTemplate(templateConfig);
        ag.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
        // step 8: execute Auto Generator
        ag.execute();
    }
}
