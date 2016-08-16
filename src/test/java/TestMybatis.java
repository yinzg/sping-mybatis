
import com.zj.model.User;
import com.zj.service.UserService;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ziJun
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring.xml"})
public class TestMybatis {

    @Resource
    private UserService userService;

    private Logger log = Logger.getLogger(TestMybatis.class);

    @Test
    public void TestMybatis() {
        /*添加User*/
        User user1 = new User();
        user1.setId(Long.valueOf("3"));
        user1.setName("tom");
        user1.setAge(30);
        userService.addUser(user1);

        /*查询添加的User*/
        User user = userService.getUserById(3);
        log.info(user.toString());
    }

}
