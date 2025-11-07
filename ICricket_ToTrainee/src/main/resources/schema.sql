CREATE TABLE IF NOT EXISTS players (
    player_id INT AUTO_INCREMENT PRIMARY KEY,
    ranking INT,
    player_name VARCHAR(100),
    country VARCHAR(100),
    debut_date VARCHAR(20),
    batting_style VARCHAR(50),
    bowling_style VARCHAR(50)
);
