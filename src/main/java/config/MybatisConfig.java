//package config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//
////mybatis设置
//public class MybatisConfig {
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
//        SqlSessionFactoryBean ssfb=new SqlSessionFactoryBean();
//        //设置别名 需改动
//        ssfb.setTypeAliasesPackage("");
//        ssfb.setDataSource(dataSource);
//        return ssfb;
//    }
//
////mybatis包扫描
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer msc=new MapperScannerConfigurer();
//        //需改动
//        msc.setBasePackage("");
//        return msc;
//    }
//
//}
