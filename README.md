# Hiberoid Android to Sqlite

*Hiberoid provide relationship between Object and Database of Sqlite.
Hiberoid is work same as like hibernate but Hiberoid is work on only android. It's simple to use in android.*

<!--![Thumbnail of slate](thumbnail.png)-->

## Integration

How integrate to Hiberoid?

1. Android Studio: Add the following to your modul level build.gradle file:

    ```yml
    compile 'com.om.hiberoid:hiberoid:1.0.0'
    ```

2. For Maven project using in pom.xml:

    ```ruby
    <dependency>
        <groupId>com.om.hiberoid</groupId>
        <artifactId>hiberoid</artifactId>
        <version>1.0.0</version>
        <type>pom</type>
    </dependency>
    ```



## Coding Part

### Hiberoid Object

Create a object of Hiberoid for request on Sqlite for database queries. Requirement for Create object of Hiberoid as parameter:

1. Context of your app
2. Database name you want to create
3. Your database version in int. If you want to update your exist database then required increament old version value.

```yml
int version=1;
Hiberoid hiberoid=new Hiberoid(context,"my_database_name",version);
```
### Bean Class and Database Table

Hiberoid mapping your bean class to database table. Hiberoid using some annotations like @Entity, @Id, @Column for direct fast and simple implementation.
```yml
@Entity(name = "Students")
public class Student implements Serializable {
    
    private int id;
    private String name;
    private String class_name;
    private String grade;
    .....
}
```
In above code, bean class name is 'Student' but table name 'Students'. Here using @Entity annotation on bean class (@Entity is class level Annotation) for make this bean class(Student) to table of database, if you’re not set @Entity on any bean class that mean class not a table for database mapping. Hiberoid make mapping on only those class have @Entity annotation, without annotation classes are normal class.
```yml
@Entity
public class Student implements Serializable {
    .....
}
```
Here Bean class name 'Student' and table name also 'Student'.
### Mapping between Instance Variable of Class and Database Table Columns
Instance variable of your entity class directly it's columns in table without any annotations. If you want to change name of column in table then using @column annotation with name of custome column name on particuler instance variable. if you want to make a primary key in table then using @Id annotation on particuler instance variable in entity class.Ex
```yml
@Entity(name = "Students")
public class Student implements Serializable {
    @Id
    private int id;
    
    @Column(name="Student_name")
    private String name;
    
    @Column
    private String class_name;
    private String grade;
    .......   
}
 ```
 1. In this code @Id annotation on 'id' variable, Now this is a primary key in table.
 2. If @column without any parameter apply on variable then this behave as default(variable Without @Column Annotation)
 3. Also you can change of data type, default value and nullable in table using parameter.
 
 ```yml
  @Column(name="Student_name",dataType ="varchar(50)",defaultValue ="Surendra",nullable = Column.NULLABLE.NOTNULL)
 ```
  
  Default Value of nullable parameter is Column.NULLABLE.NULL

### More Description 
[Visit Hiberoid github page](https://sureksd.github.io/HiberoidDemo/)
