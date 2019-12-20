create database spring;

drop table if exists t_user;
create table t_user (
  id int not null auto_increment primary key,
  user_name varchar(20),
  create_time datetime
)