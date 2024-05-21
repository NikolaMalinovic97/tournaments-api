CREATE TABLE match
(
    id                    uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    competition_id        uuid     not null,
    home_competitor_id    uuid     not null,
    away_competitor_id    uuid     not null,
    home_competitor_goals smallint not null,
    away_competitor_goals smallint not null,
    round                 smallint not null,

    CONSTRAINT fk_competition
        FOREIGN KEY (competition_id)
            REFERENCES competition (id),

    CONSTRAINT fk_home_competitor
        FOREIGN KEY (home_competitor_id)
            REFERENCES competitor (id),

    CONSTRAINT fk_away_competitor
        FOREIGN KEY (away_competitor_id)
            REFERENCES competitor (id)
);
