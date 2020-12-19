DROP TABLE IF EXISTS CUSTOMER;
DROP TABLE IF EXISTS RESERVATION;
DROP TABLE IF EXISTS HOUSE;
DROP TABLE IF EXISTS ROOM;
DROP TABLE IF EXISTS REVIEW;
DROP TABLE IF EXISTS COUPON;
DROP TABLE IF EXISTS EVENT;

CREATE TABLE CUSTOMER (
    ID VARCHAR(20) PRIMARY KEY,
    NAME VARCHAR(20),
    NICK_NAME VARCHAR(50),
    PHONE_NUMBER VARCHAR(15)
);

CREATE TABLE RESERVATION (
    ID LONG PRIMARY KEY,
    USER_ID VARCHAR(20),
    HOUSE_ID LONG,
    ROOM_ID LONG,
    CHECK_IN_DATE DATE,
    CHECK_OUT_DATE DATE,
    ROOM_COUNT NUMBER,
    PRICE NUMBER
);

CREATE TABLE HOUSE (
    ID LONG PRIMARY KEY,
    TYPE VARCHAR(20),
    STYLE VARCHAR(10),
    NAME VARCHAR(50),
    ADDRESS VARCHAR(300),
    SCORE NUMBER,
    OWNER_WORDS VARCHAR(500),
    PHOTOS VARCHAR(100),
    INFO VARCHAR(500)
);

CREATE TABLE ROOM (
    ID LONG PRIMARY KEY,
    HOUSE_ID LONG,
    NAME VARCHAR(50),
    STYLE VARCHAR(10),
    CHECK_IN_TIME NUMBER,
    CHECK_OUT_TIME NUMBER,
    NIGHT_STAY_PRICE NUMBER,
    CLOSE_TIME NUMBER,
    USAGE_DURATION NUMBER,
    DAY_STAY_PRICE NUMBER,
    PHOTO VARCHAR(100),
    INFO VARCHAR(500),
    COUNT NUMBER
);

CREATE TABLE REVIEW (
    ID LONG PRIMARY KEY,
    AUTHOR VARCHAR(20),
    HOUSE_ID LONG,
    ROOM_NAME VARCHAR(20),
    SCORE NUMBER,
    TITLE VARCHAR(100),
    CONTENTS VARCHAR(500)
);

CREATE TABLE COUPON (
    ID VARCHAR(20) PRIMARY KEY,
    NAME VARCHAR(100),
    DISCOUNT NUMBER,
    FROM_DATE DATE,
    TO_DATE DATE,
    USABLE_HOUSES VARCHAR(15)
);

CREATE TABLE EVENT (
    ID LONG PRIMARY KEY,
    HOUSE_ID LONG,
    NAME VARCHAR(50),
    INFO VARCHAR(200)
);

