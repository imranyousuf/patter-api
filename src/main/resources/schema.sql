DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS idea;
DROP TABLE IF EXISTS comment;
DROP TABLE IF EXISTS spaces;


CREATE TABLE IF NOT EXISTS user (
    USER_ID INT NOT NULL AUTO_INCREMENT,
    USER_NAME VARCHAR(255),
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    EMAIL varchar(255),
    PASSWORD VARCHAR(255),
    TOKEN VARCHAR(4000),
    IMG_URL varchar(255),
    SPACES varchar(255),
    PRIMARY KEY(USER_ID)
);


CREATE TABLE IF NOT EXISTS idea (
    IDEA_ID INT AUTO_INCREMENT primary key,
    TITLE varchar(255),
    DESCRIPTION varchar(255),
    USER_KEY INT,
    UPVOTE INT,
    DOWNVOTE INT
);

CREATE TABLE IF NOT EXISTS comment (
    COMMENT_ID INT AUTO_INCREMENT primary key,
    DESCRIPTION varchar(255),
    UPVOTE INT,
    DOWNVOTE INT,
    USER_KEY INT,
    PARENT BOOLEAN,
    SPACE_ID INT

);

CREATE TABLE IF NOT EXISTS space (
    SPACE_ID INT AUTO_INCREMENT PRIMARY KEY,
    USER_ID_LIST VARCHAR(255),
    COMMENT_ID_LIST VARCHAR(255),
    IS_GENERAL BOOLEAN,
    IDEA_ID INT

);


/*
INSERT INTO IDEA (IDEA_ID, TITLE, DESCRIPTION, USER_KEY) VALUES(1, 'FB LOGIN','ADD A BUTTON', 1);
INSERT INTO IDEA (IDEA_ID, TITLE, DESCRIPTION, USER_KEY) VALUES(2, 'COFFEE MACHINE','NEED COFFEE', 2);
INSERT INTO IDEA (IDEA_ID, TITLE, DESCRIPTION, USER_KEY) VALUES(3, 'MANAGER SUCKS','CAN WE FIRE THEM', 3);
*/