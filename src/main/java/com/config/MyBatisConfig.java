package com.config;

import me.jclagache.data.mybatis.repository.config.EnableMyBatisRepositories;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableMyBatisRepositories
public class MyBatisConfig {
//
//	private static final Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);
//
//	@Autowired
//	private DataSource dataSource;
//
//	@Bean
//	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
//		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//		sessionFactory.setDataSource(dataSource);
//		sessionFactory.setTypeHandlers(new TypeHandler[] {
//			new DateTimeTypeHandler(),
//			new RoleListTypeHandler()
//		});
//		sessionFactory.setTypeAliases(new Class[] {
//				DateTime.class,
//				Role.class,
//				Manager.class,
//		});
////		sessionFactory.setTypeAliasesPackage("com.domain");
//		return sessionFactory;
//	}
//
//	@Bean
//	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
}