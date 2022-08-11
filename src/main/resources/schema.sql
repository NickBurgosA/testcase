CREATE TABLE Exchange_Rate
(
    id integer not null AUTO_INCREMENT,
    origin_Currency VARCHAR(20),
    final_Currency  VARCHAR(20),
    exchange_Date   VARCHAR(20),
    exchange_Value  VARCHAR(20),
    PRIMARY KEY(id)
);