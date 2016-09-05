POST CREATE SCHEMA:

create table posts (
    id int(11) not null primary key auto_increment,
    postId varchar(50) not null comment 'postId',
    publishTime timestamp not null comment 'publish time',
    author varchar(30) not null comment 'author',
    title varchar(500) not null comment 'title',
    readCount int(11) comment 'readCount',
    wordCount int(11) comment 'wordCount',
    category varchar(30) comment 'category',
    Index `timeIndex` (`publishTime`),
    Index `authorIndex` (`author`),
    Index `categoryIndex` (`category`)
);

create table nodes (
    id int(11) not null primary key auto_increment,
    postId varchar(50) not null comment 'postId',
    nodeType int(10) not null comment 'nodeType',
    isSubtitle bool not null comment 'isSubtitle',
    mediaId varchar(100) comment 'mediaId',
    content varchar(1000) comment 'content',
    mediaIds varchar(400) comment 'mediaIds'
);


publishTime,author,title,serializedData,readCount,wordCount,category