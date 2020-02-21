# Ranames
A simple tool to generate fake names.

------------------------------------------------------------
 Compiling and starting
------------------------------------------------------------

Build using Maven.
1. mvn package
2. cd target
3. java -jar Ranames-1.0-SNAPSHOT.jar
4. localhost:8080/ranames

#### Basic usage
    https://uinames.com/api/
    ---
    {
      "name":"John",
      "surname":"Doe",
      "gender":"male",
      "region":"United States"
    }
#### Parameters
Number of names to return:
<pre>http://localhost:8080/ranames/api<strong>?amount=10</strong></pre>

Limit results to the `male` or `female` gender:
<pre>http://localhost:8080/ranames/api<strong>?amount=10&gender=female</strong></pre>

Region-specific results:
<pre>http://localhost:8080/ranames/api<strong>?amount=10&region=france</strong></pre>

Region and gender specific results::
<pre>http://localhost:8080/ranames/api<strong>?amount=10&region=france&gender=male</strong></pre>


<img width="1042" alt="ranames-screenshot" src="#">



