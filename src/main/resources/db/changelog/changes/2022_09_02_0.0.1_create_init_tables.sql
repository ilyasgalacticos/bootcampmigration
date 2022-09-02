CREATE TABLE t_brands(
    id SERIAL PRIMARY KEY NOT NULL,
    name TEXT NOT NULL
);

CREATE TABLE t_items(
    id SERIAL PRIMARY KEY NOT NULL,
    name TEXT NOT NULL,
    price INT DEFAULT 0,
    amount INT DEFAULT 0,
    brand_id INT DEFAULT 0,
    CONSTRAINT fk_items_brands
        FOREIGN KEY (brand_id)
        REFERENCES t_brands (id)
);