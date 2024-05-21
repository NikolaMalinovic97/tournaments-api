CREATE TABLE competitor
(
    id             uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    competition_id uuid     not null,
    user_id        uuid     not null,
    ranking        smallint not null,

    CONSTRAINT fk_competition
        FOREIGN KEY (competition_id)
            REFERENCES competition (id),

    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
);
