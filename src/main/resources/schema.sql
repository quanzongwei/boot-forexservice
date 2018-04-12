CREATE  TABLE exchange_value(
id  INTEGER NOT NULL ,
 currency_from VARCHAR(64),
 currency_to VARCHAR(64),
 conversion_multiple DECIMAL(10,2),
 port INTEGER ,
PRIMARY KEY(id)
);