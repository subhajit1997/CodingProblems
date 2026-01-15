#Dictionary: Collection data type that is unordered and mutable, collection of key-value pairs

mydict = {"name":"max", "age":28,"city":"new york","hobby":"draw"}
print(mydict)

mydict2= dict(name="marry",age=27,city="boston")
print(mydict2)

#access data, if key not found KeyError
value = mydict["name"]
print(value)

#add key-value pair
mydict["email"] = "max@xyz.com"
print(mydict)

#if we insert same key then it oevrrides
mydict["email"] = "maxcool@xyz.com"
print(mydict)

#delete key
del mydict["name"]
print(mydict)

mydict.pop("age")
print(mydict)

mydict.popitem() #deletes last inserted item
print(mydict)

#conditional statement
if "city" in mydict:
    print(mydict["city"])

try:
    print(mydict["hobby"])
except:
    print("Error")
    
#loop
for key in mydict:
    print(key)
    
for value in mydict.values():
    print(value)
    
for key,value in mydict.items():
    print(key,value)

#copy
mydict_copy = mydict #both dictoinary points to same dict in memeory so updating new will update old
print(mydict_copy)

mydict_copy["email"]="max@.com"
print(mydict_copy)
print(mydict)

mydict_copy1 = mydict.copy() #does not update old dict
mydict_copy1["pin"] = 7511
print(mydict_copy1)
print(mydict)

mydict_copy2 = dict(mydict) #does not update old dict
mydict_copy2["home"] = "santa"
print(mydict_copy2)
print(mydict)

#merge two dict
my_dict = {"name":"max", "age":28,"email" : "max@axy"}
my_dict1 = {"name":"marry", "age":29,"city" : "boston"}
my_dict.update(my_dict1)
print(my_dict)

#key can be number /string
my_dict_test = {3:9,6:36,9:81}
print(my_dict_test)

#use tuple as key in dict 
my_tuple = (8,9)
my_dict_tuple = {my_tuple:15} 

print(my_dict_tuple)

#cannot use list as key in dict we get TypeError as list is mutable and can be changed afetr creation so not hasable
# my_list = [8,9]
# my_dict_list = {my_list:15} 

# print(my_dict_list)
