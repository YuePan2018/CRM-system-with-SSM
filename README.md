# CRM-system-with-SSM
##### A customer relationship management system done by Spring + Spring MVC + MyBatis

1. DataBase: MySql<br><br>
database name: ssm <br>
username: root <br>
password: admin <br><br>
import table ssm.sql<br>
table name: t_customer

2. Test: MyBatis + Spring + SpringMVC:<br>
Deploy the project in TomCat and run server<br>
Open a url in a browser: http://localhost:8080/ssm/customer/input.action<br>
In this web page, input customer properties and click "save".<br>
If insert a customer into database successfully, browser will jump to a success page.

3.EasyUI<br>
This EasyUI project comes from a online course: "https://www.udemy.com/course/springmvc-ssm/"<br>
I edits jsp codes to match my SSM project<br><br>
3.1 Open /WebRoot/index.jsp in a browser, the web is a CRM page.<br>
3.2 When clicking "客户管理", web calls "customer_manage.jsp" and display customer table.<br>
3.3 Click "添加" button to insert a customer, click "修改" button to edit a customer, and click "删除" button to delete a customer.<br>