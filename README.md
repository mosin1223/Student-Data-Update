Student Data Update
This is a simple Java program to update student data in a MySQL database using JDBC.

Features
Connects to a MySQL database using JDBC.
Updates specific fields (university and UNI_FEEs) in the students table based on a condition (CMS_ID).
Displays a success message indicating the number of rows affected.
Technologies Used
Java
JDBC (Java Database Connectivity)
MySQL
Prerequisites
MySQL Database with a table named students in the students database containing the following columns:

CMS_ID (int): Student ID
name (varchar): Student name
university (varchar): University name
UNI_FEEs (double): University fees.
JDBC Driver (com.mysql.cj.jdbc.Driver) installed.

Database connection details:

Host: localhost
Port: 3306
Database: students
Username: root
Password: root177.
How to Run
Clone this repository:

bash
Copy code
git clone https://github.com/<your-username>/Student-Data-Update.git
Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

Update database connection details in the UpdateData.java file, if necessary.

Compile and run the program:

bash
Copy code
javac UpdateData.java
java UpdateData
Example Output
If the update is successful:

text
Copy code
Data updated successfully
Rows affected :: 1
If no matching record is found:

text
Copy code
No rows affected
Contributing
Contributions are welcome! If you find any issues or have suggestions, feel free to open an issue or submit a pull request.
