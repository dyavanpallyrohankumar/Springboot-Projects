INSERT INTO
    address (
        address_id,
        address_name,
        line1,
        line2,
        city,
        state,
        pincode
    )
VALUES
    (
        1,
        'Address 1',
        'Line1-1',
        'Line2-1',
        'City1',
        'State1',
        '600001'
    );

INSERT INTO
    address (
        address_id,
        address_name,
        line1,
        line2,
        city,
        state,
        pincode
    )
VALUES
    (
        2,
        'Address 2',
        'Line1-2',
        'Line2-2',
        'City2',
        'State2',
        '600002'
    );

INSERT INTO
    address (
        address_id,
        address_name,
        line1,
        line2,
        city,
        state,
        pincode
    )
VALUES
    (
        3,
        'Address 3',
        'Line1-3',
        'Line2-3',
        'City3',
        'State3',
        '600003'
    );

INSERT INTO
    address (
        address_id,
        address_name,
        line1,
        line2,
        city,
        state,
        pincode
    )
VALUES
    (
        4,
        'Address 4',
        'Line1-4',
        'Line2-4',
        'City4',
        'State4',
        '600004'
    );

INSERT INTO
    address (
        address_id,
        address_name,
        line1,
        line2,
        city,
        state,
        pincode
    )
VALUES
    (
        5,
        'Address 5',
        'Line1-5',
        'Line2-5',
        'City5',
        'State5',
        '600005'
    );

INSERT INTO
    address (
        address_id,
        address_name,
        line1,
        line2,
        city,
        state,
        pincode
    )
VALUES
    (
        6,
        'Address 6',
        'Line1-6',
        'Line2-6',
        'City6',
        'State6',
        '600006'
    );

INSERT INTO
    address (
        address_id,
        address_name,
        line1,
        line2,
        city,
        state,
        pincode
    )
VALUES
    (
        7,
        'Address 7',
        'Line1-7',
        'Line2-7',
        'City7',
        'State7',
        '600007'
    );

INSERT INTO
    address (
        address_id,
        address_name,
        line1,
        line2,
        city,
        state,
        pincode
    )
VALUES
    (
        8,
        'Address 8',
        'Line1-8',
        'Line2-8',
        'City8',
        'State8',
        '600008'
    );

INSERT INTO
    users (
        user_id,
        user_name,
        contact_number,
        email,
        password,
        user_role,
        address_id
    )
VALUES
    (
        1,
        'admin_user',
        '9876543210',
        'admin@foodadda.com',
        'Admin@123',
        'ADMIN',
        1
    );

INSERT INTO
    users (
        user_id,
        user_name,
        contact_number,
        email,
        password,
        user_role,
        address_id
    )
VALUES
    (
        2,
        'customer_user',
        '9123456789',
        'customer@foodadda.com',
        'Customer@123',
        'CUSTOMER',
        2
    );

INSERT INTO
    users (
        user_id,
        user_name,
        contact_number,
        email,
        password,
        user_role,
        address_id
    )
VALUES
    (
        3,
        'vendor1',
        '9000000001',
        'vendor1@foodadda.com',
        'Vendor@123',
        'VENDOR',
        3
    );

INSERT INTO
    users (
        user_id,
        user_name,
        contact_number,
        email,
        password,
        user_role,
        address_id
    )
VALUES
    (
        4,
        'vendor2',
        '9000000002',
        'vendor2@foodadda.com',
        'Vendor@123',
        'VENDOR',
        4
    );

INSERT INTO
    restaurants (
        restaurant_id,
        name,
        contact_number,
        rating,
        status,
        cusine_type,
        user_id,
        address_id
    )
VALUES
    (
        1,
        'Spice Villa',
        '9988776655',
        4.2,
        'APPROVED',
        'INDIAN',
        3,
        5
    );

INSERT INTO
    restaurants (
        restaurant_id,
        name,
        contact_number,
        rating,
        status,
        cusine_type,
        user_id,
        address_id
    )
VALUES
    (
        2,
        'Dragon Palace',
        '9876501234',
        4.5,
        'APPROVED',
        'CHINESE',
        3,
        6
    );

INSERT INTO
    restaurants (
        restaurant_id,
        name,
        contact_number,
        rating,
        status,
        cusine_type,
        user_id,
        address_id
    )
VALUES
    (
        3,
        'Pasta Paradise',
        '9765432109',
        4.0,
        'APPROVED',
        'ITALIAN',
        4,
        7
    );

INSERT INTO
    restaurants (
        restaurant_id,
        name,
        contact_number,
        rating,
        status,
        cusine_type,
        user_id,
        address_id
    )
VALUES
    (
        4,
        'Taco Town',
        '9654321098',
        3.8,
        'APPROVED',
        'MEXICAN',
        4,
        8
    );

INSERT INTO
    menus (
        id,
        name,
        type,
        description,
        cuisine,
        price,
        rating,
        image_url,
        specialty,
        restaurant_id
    )
VALUES
    (
        1,
        'Dish 1',
        'VEG',
        'Delicious Dish 1',
        'INDIAN',
        110,
        4.0,
        'image1.jpg',
        'Special 1',
        1
    );

INSERT INTO
    menus (
        id,
        name,
        type,
        description,
        cuisine,
        price,
        rating,
        image_url,
        specialty,
        restaurant_id
    )
VALUES
    (
        2,
        'Dish 2',
        'NON_VEG',
        'Delicious Dish 2',
        'INDIAN',
        120,
        4.2,
        'image2.jpg',
        'Special 2',
        1
    );

INSERT INTO
    menus (
        id,
        name,
        type,
        description,
        cuisine,
        price,
        rating,
        image_url,
        specialty,
        restaurant_id
    )
VALUES
    (
        3,
        'Dish 3',
        'VEG',
        'Delicious Dish 3',
        'CHINESE',
        130,
        4.0,
        'image3.jpg',
        'Special 3',
        2
    );

INSERT INTO
    menus (
        id,
        name,
        type,
        description,
        cuisine,
        price,
        rating,
        image_url,
        specialty,
        restaurant_id
    )
VALUES
    (
        4,
        'Dish 4',
        'NON_VEG',
        'Delicious Dish 4',
        'CHINESE',
        140,
        4.2,
        'image4.jpg',
        'Special 4',
        2
    );

INSERT INTO
    menus (
        id,
        name,
        type,
        description,
        cuisine,
        price,
        rating,
        image_url,
        specialty,
        restaurant_id
    )
VALUES
    (
        5,
        'Dish 5',
        'VEG',
        'Delicious Dish 5',
        'ITALIAN',
        150,
        4.0,
        'image5.jpg',
        'Special 5',
        3
    );

INSERT INTO
    menus (
        id,
        name,
        type,
        description,
        cuisine,
        price,
        rating,
        image_url,
        specialty,
        restaurant_id
    )
VALUES
    (
        6,
        'Dish 6',
        'NON_VEG',
        'Delicious Dish 6',
        'ITALIAN',
        160,
        4.2,
        'image6.jpg',
        'Special 6',
        3
    );

INSERT INTO
    menus (
        id,
        name,
        type,
        description,
        cuisine,
        price,
        rating,
        image_url,
        specialty,
        restaurant_id
    )
VALUES
    (
        7,
        'Dish 7',
        'VEG',
        'Delicious Dish 7',
        'MEXICAN',
        170,
        4.0,
        'image7.jpg',
        'Special 7',
        4
    );

INSERT INTO
    menus (
        id,
        name,
        type,
        description,
        cuisine,
        price,
        rating,
        image_url,
        specialty,
        restaurant_id
    )
VALUES
    (
        8,
        'Dish 8',
        'NON_VEG',
        'Delicious Dish 8',
        'MEXICAN',
        180,
        4.2,
        'image8.jpg',
        'Special 8',
        4
    );

ALTER TABLE address
ALTER COLUMN address_id
RESTART WITH 100;

ALTER TABLE users
ALTER COLUMN user_id
RESTART WITH 100;

ALTER TABLE restaurants
ALTER COLUMN restaurant_id
RESTART WITH 100;

ALTER TABLE menus
ALTER COLUMN id
RESTART WITH 100;