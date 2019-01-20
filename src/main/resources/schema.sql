drop table user;
drop table movie;

CREATE TABLE User(
	id integer (5) NOT NULL,
	first_name varchar (50) NOT NULL,
	last_name varchar (50) NOT NULL,
	city varchar (50) NOT NULL,
	username varchar (20) NOT NULL,
	password varchar (20) NOT NULL,
);

CREATE TABLE Movie (
	id integer (5) NOT NULL,
	name varchar (50) NOT NULL,
	release_date date NOT NULL,
	budget int (10),
	genre varchar (20) NOT NULL,
);
