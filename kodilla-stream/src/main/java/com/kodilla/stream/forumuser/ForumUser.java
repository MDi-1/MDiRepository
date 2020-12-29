package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userIDnumber;
    private final String userName;
    private final char userGender;
    private final LocalDate userBirthDate;
    private final int postQuantity;

    public ForumUser ( final int userIDnumber, final String userName, final char userGender,
                       final LocalDate userBirthDate, final int postQuantity) {
        this.userIDnumber = userIDnumber;
        this.userName = userName;
        this.userGender = userGender;
        this.userBirthDate = userBirthDate;
        this.postQuantity = postQuantity;
    }

    public int getUserIDnumber() {
        return userIDnumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserGender() {
        return userGender;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser user = (ForumUser) o;
        return userIDnumber == user.userIDnumber && userGender == user.userGender && postQuantity== user.postQuantity && Objects.equals(userName, user.userName) && Objects.equals(userBirthDate, user.userBirthDate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userIDnumber, userName, userGender, userBirthDate, postQuantity);
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "userIDnumber=" + userIDnumber +
                ", userName='" + userName + '\'' +
                ", userGender=" + userGender +
                ", userBirthDate=" + userBirthDate +
                ", postQuantity=" + postQuantity + '}';
    }
}
