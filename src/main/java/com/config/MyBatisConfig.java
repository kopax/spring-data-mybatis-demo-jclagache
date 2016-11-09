package com.config;

import com.domain.Manager;
import com.domain.Role;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.joda.time.DateTime;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.typeHandler.DateTimeTypeHandler;
import com.typeHandler.RoleListTypeHandler;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.persistence")
public class MyBatisConfig {

	private static final Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);

	@Autowired
	private DataSource dataSource;

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setTypeHandlers(new TypeHandler[] {
			new DateTimeTypeHandler(),
			new RoleListTypeHandler()
		});
		sessionFactory.setTypeAliases(new Class[] {
				DateTime.class,
				Role.class,
				Manager.class,
		});
//		sessionFactory.setTypeAliasesPackage("com.domain");
		return sessionFactory;
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}