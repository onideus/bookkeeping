ALTER TABLE media_completed
    DROP COLUMN custom_media_tracker_id;

create table media_completed_tracker_join
(
    completed_media_id int references media_completed (id),
    custom_tracker_id  int references custom_media_tracker (id)
);

ALTER TABLE media_completed_tracker_join ADD CONSTRAINT "completed_join_pk" PRIMARY KEY (completed_media_id, custom_tracker_id);