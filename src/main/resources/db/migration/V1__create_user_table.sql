CREATE TABLE "user"
(
    id         uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    first_name varchar not null,
    last_name  varchar not null
);
