# jpa-many-to-one-relationship

### Description
A demo project for a many to one relationship using Spring Boot, Jpa and MySQL.

Check the article at [RBS Programming](https://www.rbsprogramming.com/articles/jpa-many-to-one-relationship/).  

### Requirements
* JDK-1.8+
* Maven-3.2+
* MySQL-5.7

### How to run this project?
1. Clone this repository to your machine with the command - $ `git clone https://github.com/rbs-programming/jpa-many-to-one-relationship.git`.
1. Open the jpa-many-to-one-relationship/src/main/resources/application.properties file and change the spring.datasource.username and spring.datasource.password values to match your mysql username and password.
1. Log into mysql shell and create a MySQL Database with the command - $ `CREATE DATABASE jpa_many_to_one_relationship;`
1. In the project's root directory "jpa-many-to-one-relationship" type the command - $ `mvn spring-boot:run`
