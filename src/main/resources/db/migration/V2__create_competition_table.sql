CREATE TABLE competition
(
    id         uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    name       varchar not null unique,
    start_at   date,
    end_at     date,
    created_at timestamp with time zone,
    updated_at timestamp with time zone
);
