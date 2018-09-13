**finder service**
---

## Configuration

To build and start the project, follow next steps:

1. Run $mvn clean
2. Run $mvn install
3. Run $ mvn spring-boot:run 

---

## Test

You can send a request like this:
Method: POST
Resource: localhost:8080/api/v1/finder/
Request:
```
	{
		"expectedCelebrityId":1,
		"contentSize":4,
		"content":"0101000011010110"
	}
```
expectedCelebrityId is the celebrity id that will be returned in the final excecution.
contenSize establish the matrix rows and columns size.
content contains the boolean values of all people combinations, for example:

The string 0101000011010110 will be respresented in a matrix like this
```
		 [ 0(A) ] [ 1(B) ] [ 2(C) ]
	   [0(A)][   0  ] [   1  ] [   0  ]
	   [1(B)][   0  ] [   0  ] [   0  ]
	   [2(C)][   0  ] [   1  ] [   0  ]
```
It means that person A(with 0 id) and person C knows B.
