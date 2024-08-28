package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {


    UserList userList = new UserList();

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        userList.addUser("John", "123");
        userList.addUser("Jane", "456");
        userList.addUser("Jack", "789");

        // TODO: find one of them

        User foundUser = userList.findUserByUsername("John");

        // TODO: assert that UserList found User
        String expected = foundUser.getUsername();
        String actual = "John";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("Jack", "123");
        userList.addUser("Jane", "543");
        userList.addUser("James", "678");



        // TODO: change password of one user
        boolean passwordChanged = userList.changePassword("Jack", "123", "789");

        // TODO: assert that user can change password
        assertTrue(passwordChanged);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Jack", "123");
        userList.addUser("Jane", "543");
        userList.addUser("James", "678");

        // TODO: call login() with correct username and password
        User actual = userList.login("Jack", "123");

        // TODO: assert that User object is found
        User user = userList.findUserByUsername("Jack");

        assertEquals(user, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Jack", "123");
        userList.addUser("Jane", "543");
        userList.addUser("James", "678");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Jack", "125");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}