import com.art.dao.UserDAO;
import com.art.dao.UserDAOImp;
import com.art.init.HibernateConfig;
import com.art.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateConfig.class, UserDAOImp.class})
public class UserDAOTest {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void getAllTest() {
        List<User> all = userDAO.getAll();
        assertArrayEquals(new String[]{"Artem", "qwer"}, new String[]{all.get(0).getLogin(), all.get(1).getLogin()});
        assertEquals(all.size(), userDAO.count());
    }

    @Test
    public void deleteUserTest() {
        int amount = userDAO.count();
        userDAO.deleteUser(amount + 1);
        assertEquals(userDAO.count(), amount);
    }

    @Test
    public void findByIdTest() {
        User byId = userDAO.findById(userDAO.count() * 2);
        assertNull(byId);
        User byId1 = userDAO.findById(1);
        assertNotNull(byId1);
        assertEquals(byId1.getEmail(), "usenko.job@gmail.com");
    }

    @Test
    public void findByEmailTest() {
        User byId = userDAO.findByEmail("1");
        assertNull(byId);
        User byId1 = userDAO.findByEmail("usenko.job@gmail.com");
        assertNotNull(byId1);
        assertEquals("Artem", byId1.getLogin());

    }

    @Test
    public void findByLoginTest() {
        User byId = userDAO.findByLogin("");
        assertNull(byId);
        User byId1 = userDAO.findByLogin("Artem");
        assertNotNull(byId1);
        assertEquals("usenko.job@gmail.com", byId1.getEmail());

    }
}
