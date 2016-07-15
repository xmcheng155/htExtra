import com.alibaba.fastjson.JSON;
import com.ht.extra.pojo.Inpatient;
import com.ht.extra.service.InpatientService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Dell on 2016/7/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //	private ApplicationContext ac = null;
    @Resource
    private InpatientService inpatientService= null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        Inpatient inp = inpatientService.getInpatientByIpid("ZY010016209637");
        // System.out.println(user.getUserName());
         logger.info("值："+inp.getPatientName());
        logger.info(JSON.toJSONString(inp));
    }

}
