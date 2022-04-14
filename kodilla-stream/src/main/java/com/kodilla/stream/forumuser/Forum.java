package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(0012,"User1", 'M', 1994, 9,23, 156));
        userList.add(new ForumUser(0015,"User2", 'F', 2005, 3,5, 100));
        userList.add(new ForumUser(0023,"User3", 'M', 2012, 4,24, 156));
        userList.add(new ForumUser(0034,"User4", 'M', 1998, 9,7, 0));
        userList.add(new ForumUser(0056,"User5", 'M', 1993, 5,30, 0));
        userList.add(new ForumUser(0076,"User6", 'F', 1991, 9,21, 2));
        userList.add(new ForumUser(0035,"User7", 'M', 1987, 12,3, 4));
        userList.add(new ForumUser(0011,"User8", 'F', 2009, 1,9, 65));
        userList.add(new ForumUser(0045,"User9", 'M', 1978, 9,1, 34));
        userList.add(new ForumUser(0002,"User10", 'M', 1994, 11,23, 3));
        userList.add(new ForumUser(0067,"User11", 'F', 1999, 3,4, 0));
        userList.add(new ForumUser(0006,"User12", 'M', 2003, 5,17, 0));
        userList.add(new ForumUser(0005,"User13", 'M', 1999, 7,11, 12));
        userList.add(new ForumUser(0007,"User14", 'M', 2000, 1,19, 165));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
