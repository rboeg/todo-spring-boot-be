 
   CREATE TABLE "user" 
  (
     usr_id         SERIAL,
     usr_username   VARCHAR(255),
     usr_name       VARCHAR(255),
     usr_password   VARCHAR(255),
     PRIMARY KEY (usr_id)
  );
  
    CREATE TABLE folder 
  (
     fol_id         SERIAL,
     fol_name       VARCHAR(255),
     fol_usr_id     BIGINT,
     PRIMARY KEY (fol_id),
     CONSTRAINT fk_fol_usr_id 
       FOREIGN KEY(fol_usr_id) 
	   REFERENCES "user"(usr_id)
  );
  
  CREATE TABLE task 
  (
     tak_id         SERIAL,
     tak_order      SMALLINT DEFAULT 0,
     tak_text       VARCHAR(255),
     tak_done       BOOLEAN DEFAULT FALSE,
     tak_fol_id     BIGINT,
     PRIMARY KEY (tak_id),
     CONSTRAINT fk_tak_fol_id 
       FOREIGN KEY(tak_fol_id) 
	   REFERENCES folder(fol_id)
  );
  
