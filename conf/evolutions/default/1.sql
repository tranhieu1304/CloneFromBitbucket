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

create table post (
  id                            bigint auto_increment not null,
  url                           varchar(255) not null,
  title                         varchar(255),
  content                       varchar(255),
  isdelete                      tinyint(1) default 0,
  user_id                       bigint,
  createdate                    datetime(6) not null,
  constraint pk_post primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  password                      varchar(1024) not null,
  passwordconf                  varchar(1024) not null,
  email                         varchar(1024) not null,
  sex                           integer,
  isdelete                      tinyint(1) default 0,
  birthday                      datetime(6) not null,
  createdate                    datetime(6) not null,
  modifieddate                  datetime(6) not null,
  constraint pk_user primary key (id)
);

alter table category_post add constraint fk_category_post_category foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_category_post_category on category_post (category_id);

alter table category_post add constraint fk_category_post_post foreign key (post_id) references post (id) on delete restrict on update restrict;
create index ix_category_post_post on category_post (post_id);

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


# --- !Downs

alter table category_post drop foreign key fk_category_post_category;
drop index ix_category_post_category on category_post;

alter table category_post drop foreign key fk_category_post_post;
drop index ix_category_post_post on category_post;

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

drop table if exists category;

drop table if exists category_post;

drop table if exists comment;

drop table if exists favorite;

drop table if exists post;

drop table if exists user;

