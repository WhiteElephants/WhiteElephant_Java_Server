POST CREATE SCHEMA:

create table post (
    id int(11) not null primary key auto_increment,
    publishTime timestamp not null comment 'publish time',
    author varchar(30) not null comment 'author',
    title varchar(500) not null comment 'title',
    serializedData varchar(10000) comment 'title',
    readCount int(11) comment 'readCount',
    wordCount int(11) comment 'wordCount',
    category varchar(30) comment 'category',
    Index `timeIndex` (`publishTime`),
    Index `authorIndex` (`author`),
    Index `categoryIndex` (`category`)
);



publishTime,author,title,serializedData,readCount,wordCount,category