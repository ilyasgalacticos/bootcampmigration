TRUNCATE TABLE t_items; COMMIT;
INSERT INTO t_items (name, description, item_price, amount, brand_id) VALUES
    ('Iphone 13', 'Super Iphone', 300000, 10, 1),
    ('Iphone 14', 'Super emes new Iphone', 400000, 20, 1),
    ('Iphone 12', 'Old Iphone', 200000, 15, 1),
    ('Redmi Note 10', 'Battery strong', 300000, 10, 2),
    ('Nokia 3110', 'Old but gold', 30000, 30, 4),
    ('Galaxy Note 23', 'Dont buy', 400000, 10, 3);