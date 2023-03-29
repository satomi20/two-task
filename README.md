**Task 1 "IP addresses"**

An IPv4 address consists of 4 octets, which means it can be stored in an int32 type variable.
Implement a couple of functions that uniquely convert a string representation of an IPv4 address (of the form "127.0.0.1") to an int32 value and vice versa.
Examples:
2149583360 ==> "128.32.10.0"
255        ==> "0.0.0.255"

**Task 2 "Tends to zero or to infinity?"**
(n! denotes factorial(n))
Will there be an expression of the form:
un = (1 / n!) * (1! + 2! + 3! + ... + n!)
tends to 0 or to infinity?
Implement a function that calculates the value of un for integers n > 1 (with an accuracy of at least 6 decimal places).