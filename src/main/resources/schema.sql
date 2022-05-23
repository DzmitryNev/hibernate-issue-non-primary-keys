CREATE TABLE accounts (
	user_id serial PRIMARY KEY,
	number_ff VARCHAR,
	username VARCHAR ( 50 ) UNIQUE NOT NULL
);

CREATE TABLE account_info (
	account_info_id serial PRIMARY KEY,
	number_ff VARCHAR,
	info VARCHAR ( 1000 )
);
--generate data
INSERT INTO public.accounts
(user_id, number_ff, username, number_ff2)
VALUES(1, 'test1', 'u1', 'test1');

INSERT INTO public.account_info
(account_info_id, number_ff, info)
VALUES(1, 'test1', 'u2');
INSERT INTO public.account_info
(account_info_id, number_ff, info)
VALUES(2, 'test2', 'u3');
INSERT INTO public.account_info
(account_info_id, number_ff, info)
VALUES(3, 'test3', 'u4');
