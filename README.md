##  

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction

(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

To run this SpringBoot application

1)run: AssignmentApplication.java  
2)mvn clean package spring-boot:repackage
3)java -jar target/assignment-0.0.1-SNAPSHOT.jar

Sample Output:
```
[
{
"name":"Customer 1",
"spend":{
"monthName":"Month1",
"spending":[
51,
105,
88,
90,
200,
350,
1000
],
"monthlyPoint":2589
},
"totalPoint":2589
},
{
"name":"Customer 1",
"spend":{
"monthName":"Month2",
"spending":[
15,
55,
881,
90,
20,
100
],
"monthlyPoint":1657
},
"totalPoint":4246
},
{
"name":"Customer 1",
"spend":{
"monthName":"Month3",
"spending":[
22,
65,
77,
190,
400,
550,
40
],
"monthlyPoint":1722
},
"totalPoint":5968
},
{
"name":"Customer 2",
"spend":{
"monthName":"Month1",
"spending":[
23,
66,
78,
191,
405,
551,
41
],
"monthlyPoint":1738
},
"totalPoint":1738
},
{
"name":"Customer 2",
"spend":{
"monthName":"Month2",
"spending":[
24,
67,
79,
192,
406,
552,
42
],
"monthlyPoint":1746
},
"totalPoint":3484
},
{
"name":"Customer 2",
"spend":{
"monthName":"Month3",
"spending":[
25,
68,
80,
193,
407,
553,
43
],
"monthlyPoint":1754
},
"totalPoint":5238
}
]
```