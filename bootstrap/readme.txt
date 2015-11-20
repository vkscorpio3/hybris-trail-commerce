Create extensions:
ant extgen
ant modulegen

Connect to MySQL:
add mysql-connector-java-5.1.30-bin.jar to hybris\bin\platform\lib\dbdriver\
add to local properties
	db.driver=com.mysql.jdbc.Driver
	db.password=sandboxhybris
	db.username=sandboxhybris
	db.url=jdbc:mysql://localhost/sandboxhybris
