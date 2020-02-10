# Big O Notes

### Introduction
Describes the time growth of an algorithm, based on its inputs. Only depends on the algorithm itself and not the machine.

O(g(n)) <- bounded above by g(n)

T(n) is the time approximation polynomial

Only write the highest order "n" inside O

**Example**

```
for(int i=n -1; i>=0; i--) {
	for(int j =9; j>0; j--) {
		System.out.println(" hello ");
	}
}
```


**Find the T and O of the following:**
```
for(int i=0;i<n;i++) {
	for(int j=1;j<i;j=j*2) {
		print('Hello');
	}
}
```


T(n) = n*

i|0  |1   |2   |3   |   |n-1
|----|----|----|----|----|
|  0 | 0  |  log2(2) | log2(3)  |   |



**O(n log<sub>2</sub>n)**, since the inner loop has the j=j*2 increment;