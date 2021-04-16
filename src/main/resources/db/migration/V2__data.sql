INSERT INTO "user" 
            (usr_username, usr_name, usr_password)
VALUES      ('jolmedo', 'Javiera Olmedo', 'BCRYPT4782342748873434'), ('rvizzca', 'Rafael Vizca', 'BCRYPT7187342748871287');

INSERT INTO folder
            (fol_name, fol_usr_id)
VALUES      ('Work', 1), ('Daily Tasks', 1);

INSERT INTO task
            (tak_text, tak_fol_id)
VALUES      ('Prepare weekly report', 1), ('Write to candidates', 1), ('Buy groceries', 2);
