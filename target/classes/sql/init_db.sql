CREATE USER mini_football_db_manager WITH PASSWORD "Password";
CREATE DATABASE mini_football_db OWNER mini_football_db_manager;
 \c mini_football_db;
GRANT ALL PRIVILEGES ON DATABASE mini_football_db TO mini_football_db_manager;
GRANT ALL ON SCHEMA public TO mini_football_db_manager;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO mini_football_db_manager;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO mini_football_db_manager;
ALTER DEFAULT PRIVILEGES IN SCHEMA public GRANT ALL ON TABLES TO mini_football_db_manager;
CREATE TYPE player_position AS ENUM ('GK', 'DEF', 'MIDF', 'STR');
CREATE TYPE continent_type AS ENUM ('AFRICA', 'EUROPA', 'ASIA', 'AMERICA');
ALTER TABLE player
ADD COLUMN goal_nb INTEGER;
 
 -- 1. Ajouter la colonne goal_nb (nullable)
ALTER TABLE "Player" 
ADD COLUMN goal_nb INTEGER NULL;

-- 2. Mettre à jour les joueurs avec leurs nombres de buts
-- Note: Adaptez les noms exacts si nécessaire

-- a) Thibaut Courtois : 0
UPDATE player
SET goal_nb = 0 
WHERE name = 'Thibaut Courtois';

-- b) Dani Carvajal : 2
UPDATE player 
SET goal_nb = 2 
WHERE name = 'Dani Carvajal';

-- c) Jude Bellingham : 5
UPDATE player
SET goal_nb = 5 
WHERE name = 'Jude Bellingham';

-- d) Robert Lewandowski : NULL
UPDATE player
SET goal_nb = NULL 
WHERE name = 'Robert Lewandowski';

-- e) Antoine Griezmann : NULL
UPDATE player
SET goal_nb = NULL 
WHERE name = 'Antoine Griezmann';

