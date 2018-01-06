import com.itcast.liusong.dao.base.IStandardDao;
import com.itcast.liusong.domain.base.Standard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by l1003 on 2018/1/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class StandardRepositoryTest {

    @Autowired
    private IStandardDao standardDao;
    @Test
    public void TestQuery(){

    }
}
