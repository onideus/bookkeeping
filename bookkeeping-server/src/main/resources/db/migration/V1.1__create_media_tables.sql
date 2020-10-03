create table media_type(
                           id serial primary key not null,
                           media_type varchar(255)
);

insert into media_type (media_type) values ('book');
insert into media_type (media_type) values ('video game');

create table media_sub_type(
                               id serial primary key not null,
                               media_type_id int references media_type(id),
                               media_sub_type varchar(255)
);

insert into media_sub_type (media_type_id, media_sub_type) VALUES (1, 'physical');
insert into media_sub_type (media_type_id, media_sub_type) VALUES (1, 'digital');
insert into media_sub_type (media_type_id, media_sub_type) VALUES (1, 'audio');
insert into media_sub_type (media_type_id, media_sub_type) VALUES (2, 'PS4');
insert into media_sub_type (media_type_id, media_sub_type) values (2, 'Switch');
insert into media_sub_type (media_type_id, media_sub_type) VALUES (2, 'PC');

create table media(
    id serial primary key not null,
    media_type_id int references media_type(id),
    media_sub_type_id int references media_sub_type(id),
    media_title varchar(255) not null,
    media_image bytea
);

create table user_tracked_media(
    id serial primary key not null,
    user_id int references user_table(id),
    media_id int references media(id),
    wishlist bool,
    owned bool
);

create table custom_media_tracker(
    id serial primary key not null,
    user_id int references user_table(id),
    tracker_name varchar(255) not null,
    goal int not null,
    start_date date,
    end_date date
);

create table media_completed(
    id serial primary key not null,
    user_id int references user_table(id),
    media_id int references media(id),
    custom_media_tracker_id int,
    media_completed_date date
);