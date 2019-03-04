create tablespace osf DATAFILE
'osf' size 1024M autoextend on next 4M Maxsize unlimited
;

create user osfu identified by 12345678
default tablespace osf;

grant dba to osfu;