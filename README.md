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

### More Description 
[Visit Hiberoid github page](https://sureksd.github.io/HiberoidDemo/)
