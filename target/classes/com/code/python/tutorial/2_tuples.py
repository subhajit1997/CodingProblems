#Tuples:    collection data types that is ordered abd immutable , allows duplicate elemnts 
#           similaer to list but tuples cannot be changed once created

#can be created using () parenthesis or withouit parenthesis
mytuples = ("max",28,"buston")
print(mytuples)

mytuples = "max",28,"buston"
print(mytuples)


mytuples = tuple(["max",28,"boston",7])
print(mytuples)

#fetch value starts with 0, can also use negative like -1,-2 to get last values
item = mytuples[1]
print(item)

#mytuples[0] = "tim" not possible as cannot be reasigned 

#for loop
for i in mytuples:
    print(i)
    
#conditional
if "max" in mytuples:
    print("yes")
else:
    print("no")
    
#count number
my_tuples = ('a','b','c','a')
print(len(my_tuples))

print(my_tuples.count('a'))

#find index , be carefull as if not preent giuves ValueError: tuple.index(x): x not in tuple
print(my_tuples.index('b'))

#converting tuples to list and vice versa
my_list = list(my_tuples)
print(my_tuples)
my_tuples2 = tuple(my_list)
print(my_tuples2)

#slicing in tuples
i = (1,2,3,4,5,6,7,8)
j = i[2:5]
print(j)

#skipping index
k = i[::3]
print(k)


#reverse tupls
l = i[::-1]
print(l)

#unpack
un_pack = "max" ,28, "boston"
name,age,city = un_pack
print(name)
print(age)

unpack2= (0,2,3,4,6,7)
i1, *i2 , i3 = unpack2
print(i1)
print(i2)
print(i3)

#compare list and tuples size for same data
import sys
new_list  = [0,1,2,34,"hello",True]
new_tuple = 0,1,2,34,"hello",True
print(sys.getsizeof(new_list),"bytes")
print(sys.getsizeof(new_tuple),"bytes")

#104 bytes -new_list
#88 bytes -new_tuple

import timeit
print(timeit.timeit(stmt="[0,1,2,3,4,5]",number=100000))
print(timeit.timeit(stmt="(0,1,2,3,4,5)",number=100000))

#0.0021748750004917383 - list
# 0.0002681249752640724 - tuple

#tuples are efficient in size and time