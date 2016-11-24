package org.RtmHomePersistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.junit.Assert.assertTrue;

import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import com.rtmhome.persistance.repository.RetirementHomeRepo;

import junit.framework.TestCase;



/**
 * Unit test for simple App.
 */
@EnableJpaRepositories("com.rtmhome.persistance.repository")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,JpaRepositoriesAutoConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:Spring/Test-ApplicationContext.xml" })
public class AppTest
{

	

	@Autowired
	RetirementHomeRepo retirementHomeRepo;
	
	@Test
	public void test() {
		assertTrue(retirementHomeRepo==null);
	}
}

