# List: collection data types ordered , mutable , and allows duplicate elements
"""
Docstring for main.java.com.code.python.tutorial.1_list
youtube :https://www.youtube.com/watch?v=QLTdOEn79Rc&list=PLqnslRFeH2UqLwzS0AwKDKLrpYBKzLBy2&index=2
Patrick Loeber: Lists in Python - Advanced Python 01 - Programming Tutorial

"""
mylist = ["banana","cherry","apple"]
print(mylist)

mylist2 = [5,True,"apple","apple"]
print(mylist2)

item = mylist[0]
print(item)

#for loop for list
for i in mylist:
    print(i)

#coditional
if "banana" in mylist:
    print("yes")
else:
    print("no")
    
print(len(mylist))

#append
mylist.append("lemon")
print(mylist)

mylist.insert(1,"bluberry")
mylist.pop()

print(mylist)

#reverse list
mylist.reverse()
print(mylist)

#sort
newList = [4,5,78,-1,4]
newList.sort()
print(newList)


newlist3 = [0]*5
print(newlist3)

new_list = mylist + newlist3
print(new_list)

slice_list = [1,2,3,4,5,6,7,8,9]
a = slice_list[1:5] #slice between 1 and 5 index
print(a)

b = slice_list[:5] #starts from first
print(b)

c = slice_list[::2] #every second index
print(c)

#copying list to another refer to same location changing new updates original 
list_org = ["banana","cherry","apple"]
list_cpy = list_org 
list_cpy.append("sky")
print(list_org)
print(list_cpy)

#use .copy() to not update original when copying list
list_copy = list_org.copy()
print(list_copy)

#list comphrension
a1 = [1,2,3,4,5,6]
b1 = [i*i for i in a1]
print(a1)
print(b1)