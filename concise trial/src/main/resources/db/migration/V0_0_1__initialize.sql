/*
 * Engine: PostgreSQL
 * Version: 0.0.1
 * Description: Initial database structure and data.
 */

/*
 * Structure
 */

CREATE TABLE data (
  id BIGSERIAL NOT NULL,
  data VARCHAR(255) NOT NULL,
  PRIMARY KEY(id)
);