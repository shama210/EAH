package com.sankrankgroup.eah.service;
import com.sankrankgroup.eah.*;
import com.sankrankgroup.eah.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import com.sankrankgroup.eah.model.User;
import com.sankrankgroup.eah.model.Login;
import org.springframework.stereotype.Repository;

@Repository
    public class UserServiceImpl implements UserService {

  //      @Autowired

//        JdbcTemplate jdbcTemplate;
        @Autowired
        UserRepository userRepository;
        /*
        @Override
        public User getUser(int userId) {
            String sql = "SELECT * FROM user";
            //jdbcTemplate.query(sql, RowMapper)
            return null;
        }
*/
        /*
        private static final class UserRowMapper implements RowMapper<User> {

            @Nullable
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User(resultSet.getString("userid"), resultSet.getString("username"));

                //user.setEmailAddress(resultSet.getString("email"));
                return null;
            }
        }
        */

        @Override
        public Boolean addUser(User user) {
            //System.out.println("Adding a new employee");
           // String sql = "INSERT INTO userd(userid, username, firstname, lastname, password, emailAddress) VALUES (?, ?, ?, ?, ?, ?)";
            //System.out.println("jdbcTemplate 2 " + jdbcTemplate);
           // jdbcTemplate.update(sql, new Object[]{user.getUserId(), user.getUserName(), user.getFirstName(), user.getLastName(), user.getPassword(), user.getEmailAddress()});
            userRepository.save(user);
            return true;

        }
    }