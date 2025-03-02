CREATE USER robin PASSWORD 'demo' SUPERUSER
CREATE DATABASE demo owner robin encoding 'UTF8'
GRANT ALL PRIVILEGES ON DATABASE demo TO robin

¥c demo;
CREATE SCHEMA "import";