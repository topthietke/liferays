ALTER USER 'liferay'@'%' IDENTIFIED WITH mysql_native_password BY 'liferay';
GRANT ALL PRIVILEGES ON lportal.* TO 'liferay'@'%';
FLUSH PRIVILEGES;

ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;