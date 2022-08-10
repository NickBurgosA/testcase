CREATE TABLE ExchangeRate
(
    id integer PRIMARY KEY AUTO_INCREMENT,
    originCurrency VARCHAR(20),
    finalCurrency  VARCHAR(20),
    exchangeDate   VARCHAR(20),
    exchangeValue  VARCHAR(20)
);


INSERT INTO ExchangeRate(originCurrency, finalCurrency, exchangeDate, exchangeValue) values ('100', '200', '2022-08-11', '100');
INSERT INTO ExchangeRate(originCurrency, finalCurrency, exchangeDate, exchangeValue) values ('200', '500', '2022-08-11', '100');
INSERT INTO ExchangeRate(originCurrency, finalCurrency, exchangeDate, exchangeValue) values ('300', '400', '2022-08-11', '100');