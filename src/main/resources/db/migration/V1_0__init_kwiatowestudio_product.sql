CREATE TABLE product
(
    product_id      SERIAL      NOT NULL,
    name            VARCHAR(32) NOT NULL,
    description     TEXT,
    price           VARCHAR(32) NOT NULL,
    attachmentId    SERIAL
)