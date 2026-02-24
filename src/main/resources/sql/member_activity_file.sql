create table tbL_activity_file(
    id bigint unsigned primary key ,
    member_id bigint unsigned not null,
    constraint fk_member_activity_file_member foreign key (member_id)
    references tbL_member(id),
    constraint fk_member_activity_file_file foreign key (id)
    references tbl_file(id)
);

select * from tbL_activity_file;

create view view_activity_file as
(
select f.id, file_path, file_name, file_original_name, file_size, file_content_type, created_datetime, updated_datetime, member_id
from tbl_file f join tbl_activity_file af
on f.id = af.id );

select * from view_activity_file;