# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  password                      varchar(1024) not null,
  sex                           varchar(255),
  birthday                      datetime(6),
  height                        bigint,
  bloodtype                     varchar(255),
  isdelete                      tinyint(1) default 0,
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists user;

