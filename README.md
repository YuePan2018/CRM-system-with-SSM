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

3. EasyUI<br>
This EasyUI project comes from a online course: "https://www.udemy.com/course/springmvc-ssm/"<br>
I edit the given jsp codes to match my SSM project<br><br>
3.1 Deploy the project in TomCat and run server<br>
3.2 Open /WebRoot/index.jsp (eg. http://localhost:8080/crm/index.jsp) in a browser, the web is a CRM page.<br>
3.3 When clicking "客户管理", web calls "customer_manage.jsp" and display customer table.<br>
3.4 Click "添加" button to insert a customer,<br>
After selecting and checking a row, click "修改" button to edit a customer, or click "删除" button to delete a customer.<br>