# CRM-system-with-SSM
##### A customer relationship management system done by Spring + Spring MVC + MyBatis

1. DataBase: MySql<br><br>
database name: ssm <br>
username: root <br>
password: admin <br><br>
import table ssm.sql<br>
table name: t_customer

2. MyBatis + Spring:<br>
Run MybatisSpringTest.java, insert a row in database<br><br>
MyBatis configuration is set by scanning all interfaces in ./mapper<br>
Spring is set by annotation, and transaction manager is set up.

3. SpringMVC<br>
Deploy project in TomCat and run server<br>
open a url in a browser: http://localhost:8080/spring-springmvc-mybatis/customer/test.action