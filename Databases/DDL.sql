CREATE TABLE MEMBER_WITH_AUTHORITY (
    MEMBER_SEQ   VARCHAR(50)   PRIMARY KEY,
    MEMBER_ID    VARCHAR(50)   NOT NULL,
    PASSWORD     VARCHAR(100)  NOT NULL,
    NAME         VARCHAR(50)   NOT NULL,
    EMAIL        VARCHAR(50),
    CELLPHONE    VARCHAR(20),
    AUTHORITY    VARCHAR(20),
    REGISTER_SEQ VARCHAR(50),
    REGISTRY_DATE   DATETIME DEFAULT NOW(),
    MODIFIER_SEQ VARCHAR(50),
    MODIFY_DATE   DATETIME DEFAULT NOW()
);
