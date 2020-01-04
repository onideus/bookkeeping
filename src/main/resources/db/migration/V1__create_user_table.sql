create table user_table(
    id int primary key not null,
    first_name varchar(255),
    last_name varchar(255),
    default_media_type int
);

create SEQUENCE hibernate_sequence;