insert into managed_services( id, user_id, service_provider_id, service_id, date, start_time, end_time) 
values( 10001, 100001, 10001, 10001, '2020-05-13 00:00:00', '10:10:10', '10:50:10'); 
insert into managed_services( id, user_id, service_provider_id, service_id, date, start_time, end_time) 
values( 10002, 100001, 10002, 10001, '2020-05-13 00:00:00', '10:10:10', '10:50:10'); 

insert into service_charges(id, service,price, managed_services_id) values(101,'hair cut',100,10001);
insert into service_charges(id, service,price, managed_services_id) values(102,'shave',50,10001);
insert into service_charges(id, service,price, managed_services_id) values(103,'massage',150,10001);