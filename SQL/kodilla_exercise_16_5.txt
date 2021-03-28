INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("Bobby", "Supersonic");
commit;

INSERT INTO POSTS (USER_ID, BODY)
VALUES (6, "xyz");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (5, "We don't like fake accounts here");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (5, "I'm about to delete recently added user");

commit;

update posts set BODY = "TO DELETE" where ID = 7;
update posts set BODY = "TO DELETE" where ID = 8;
update posts set BODY = "TO DELETE" where ID = 9;

commit;

delete from POSTS where USER_ID = 5;
delete from POSTS where USER_ID = 6;
delete from USERS where ID = 6;

commit;