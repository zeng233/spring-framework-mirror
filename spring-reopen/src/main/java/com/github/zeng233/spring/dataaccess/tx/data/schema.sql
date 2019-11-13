drop table if exists user;
create table user (
  id int not null auto_increment primary key,
  user_name varchar(20),
  create_time datetime
)