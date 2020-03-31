insert into occupation(id, job) values(10001, 'Web-Designer');
insert into occupation(id, job) values(10002, 'Mechanic');

insert into service_provider(id, address, email, name, phone, pin) values(10001, 'B12 gali sahar ilaka Rajya, Desh', 'test@test.com', 'Pappu Ki Dukan', 9098987678, 989800);
insert into service_provider(id, address, email, name, phone, pin) values(10002, 'B12 gali2 sahar2 ilaka2 Rajya2, Desh2', 'tappu@test.com', 'Tappu Ki Dukan', 9000000008, 222222);

insert into occupation_service(provider_id, occupation_id) values(10001,10001);
insert into occupation_service(provider_id, occupation_id) values(10001,10002);
insert into occupation_service(provider_id, occupation_id) values(10002,10002);