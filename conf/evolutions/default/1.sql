# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table category_post (
  category_id                   bigint not null,
  post_id                       bigint not null,
  constraint pk_category_post primary key (category_id,post_id)
);

create table chatroom (
  id                            bigint auto_increment not null,
  roomname                      varchar(255),
  modifieddate                  date,
  isdelete                      tinyint(1) default 0,
  constraint pk_chatroom primary key (id)
);

create table chatroom_user (
  chatroom_id                   bigint not null,
  user_id                       bigint not null,
  constraint pk_chatroom_user primary key (chatroom_id,user_id)
);

create table comment (
  id                            bigint auto_increment not null,
  content                       varchar(255) not null,
  isdelete                      tinyint(1) default 0,
  user_id                       bigint,
  post_id                       bigint,
  createdate                    datetime(6) not null,
  constraint pk_comment primary key (id)
);

create table favorite (
  id                            bigint auto_increment not null,
  isdelete                      tinyint(1) default 0,
  user_id                       bigint,
  post_id                       bigint,
  createdate1                   datetime(6) not null,
  constraint pk_favorite primary key (id)
);

create table message (
  id                            bigint auto_increment not null,
  content                       varchar(255),
  modifieddate                  date,
  isdelete                      tinyint(1) default 0,
  constraint pk_message primary key (id)
);

create table post (
  id                            bigint auto_increment not null,
  url                           varchar(255) not null,
  title                         varchar(255),
  imgurl                        varchar(255),
  content                       varchar(255),
  isdelete                      tinyint(1) default 0,
  user_id                       bigint,
  createdate                    datetime(6) not null,
  constraint uq_post_url unique (url),
  constraint pk_post primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  password                      varchar(1024) not null,
  passwordconf                  varchar(1024) not null,
  email                         varchar(1024) not null,
  sex                           integer,
  birthday                      datetime(6),
  modifieddate                  datetime(6),
  isdelete                      tinyint(1) default 0,
  imagecontent                  longblob,
  createdate                    datetime(6) not null,
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id)
);

create table usermessage (
  id                            bigint auto_increment not null,
  fromid                        bigint,
  toid                          bigint,
  content                       varchar(255),
  modifieddate                  date,
  isdelete                      tinyint(1) default 0,
  user_id                       bigint,
  chat_room_id                  bigint,
  message_id                    bigint,
  constraint pk_usermessage primary key (id)
);

alter table category_post add constraint fk_category_post_category foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_category_post_category on category_post (category_id);

alter table category_post add constraint fk_category_post_post foreign key (post_id) references post (id) on delete restrict on update restrict;
create index ix_category_post_post on category_post (post_id);

alter table chatroom_user add constraint fk_chatroom_user_chatroom foreign key (chatroom_id) references chatroom (id) on delete restrict on update restrict;
create index ix_chatroom_user_chatroom on chatroom_user (chatroom_id);

alter table chatroom_user add constraint fk_chatroom_user_user foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_chatroom_user_user on chatroom_user (user_id);

alter table comment add constraint fk_comment_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_comment_user_id on comment (user_id);

alter table comment add constraint fk_comment_post_id foreign key (post_id) references post (id) on delete restrict on update restrict;
create index ix_comment_post_id on comment (post_id);

alter table favorite add constraint fk_favorite_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_favorite_user_id on favorite (user_id);

alter table favorite add constraint fk_favorite_post_id foreign key (post_id) references post (id) on delete restrict on update restrict;
create index ix_favorite_post_id on favorite (post_id);

alter table post add constraint fk_post_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_post_user_id on post (user_id);

alter table usermessage add constraint fk_usermessage_user_id foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_usermessage_user_id on usermessage (user_id);

alter table usermessage add constraint fk_usermessage_chat_room_id foreign key (chat_room_id) references chatroom (id) on delete restrict on update restrict;
create index ix_usermessage_chat_room_id on usermessage (chat_room_id);

alter table usermessage add constraint fk_usermessage_message_id foreign key (message_id) references message (id) on delete restrict on update restrict;
create index ix_usermessage_message_id on usermessage (message_id);


# --- !Downs

alter table category_post drop foreign key fk_category_post_category;
drop index ix_category_post_category on category_post;

alter table category_post drop foreign key fk_category_post_post;
drop index ix_category_post_post on category_post;

alter table chatroom_user drop foreign key fk_chatroom_user_chatroom;
drop index ix_chatroom_user_chatroom on chatroom_user;

alter table chatroom_user drop foreign key fk_chatroom_user_user;
drop index ix_chatroom_user_user on chatroom_user;

alter table comment drop foreign key fk_comment_user_id;
drop index ix_comment_user_id on comment;

alter table comment drop foreign key fk_comment_post_id;
drop index ix_comment_post_id on comment;

alter table favorite drop foreign key fk_favorite_user_id;
drop index ix_favorite_user_id on favorite;

alter table favorite drop foreign key fk_favorite_post_id;
drop index ix_favorite_post_id on favorite;

alter table post drop foreign key fk_post_user_id;
drop index ix_post_user_id on post;

alter table usermessage drop foreign key fk_usermessage_user_id;
drop index ix_usermessage_user_id on usermessage;

alter table usermessage drop foreign key fk_usermessage_chat_room_id;
drop index ix_usermessage_chat_room_id on usermessage;

alter table usermessage drop foreign key fk_usermessage_message_id;
drop index ix_usermessage_message_id on usermessage;

drop table if exists category;

drop table if exists category_post;

drop table if exists chatroom;

drop table if exists chatroom_user;

drop table if exists comment;

drop table if exists favorite;

drop table if exists message;

drop table if exists post;

drop table if exists user;

drop table if exists usermessage;

