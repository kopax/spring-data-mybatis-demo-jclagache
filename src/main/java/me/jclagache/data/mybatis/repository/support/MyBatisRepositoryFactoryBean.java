package me.jclagache.data.mybatis.repository.support;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.data.mapping.PersistentEntity;
import org.springframework.data.mapping.context.MappingContext;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.util.Assert;

import java.io.Serializable;

public class MyBatisRepositoryFactoryBean<T extends Repository<S, ID>, S, ID extends Serializable>
		extends RepositoryFactoryBeanSupport<T, S, ID> {

	MappingContext<?, ?> mappingContext;
	SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	/**
	 * Configures the {@link MappingContext} to be used to lookup {@link PersistentEntity} instances for
	 * {@link #getPersistentEntity()}.
	 *
	 * @param mappingContext
	 */
	@Override
	public void setMappingContext(MappingContext<?, ?> mappingContext) {
		this.mappingContext = mappingContext;
	}


	@Override
	protected RepositoryFactorySupport createRepositoryFactory() {		
		return new MyBatisRepositoryFactory(sqlSessionTemplate);
	}

	@Override
	public void afterPropertiesSet() {
		Assert.notNull(sqlSessionTemplate, "SqlSessionTemplate must not be null!");
		super.afterPropertiesSet();
	}

}
