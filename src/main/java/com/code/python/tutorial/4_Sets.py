#sets: Set is a collection data type that is unordered and mutable but 
# unlike list or tuples it does not allow dublicates, 
# It also starts with braces but we dont put key value pair just with coma(,)

#create
myset = {1,2,3,1,2}
print(myset)

myset1 = set([1,2,3,])
print(myset1)

myset2 = set("hello")
print(myset2)

myset_blank = set() #we cant use {} as it will identify as dict
print(type(myset_blank))

#add elemnets
myset.add(4)
myset.add(5)
print(myset)

#remeove elements
myset.remove(4) #if mentioned element not present it returns key error better .discard(6)
myset.discard(6) #no error even if 6 not present
print(myset)

#empty 
print(myset.pop())
myset.clear()
print(myset)

#iterate
myset = {1,2,3,1,2}
for i in myset:
    print(i)

#conditional
if 3 in myset:
    print("yes 1 present")

#union and intersection
odds = {1,3,5,7,9}
evens ={0,2,4,6,8}
primes = {2,3,5,7}

u = odds.union(evens)
print(u)

i = odds.intersection(primes)
print(i)

#difference 
setA = {1,2,3,4,5,6,7,8,9}
setB= {1,2,3,10,11,12}

diff = setA.difference(setB)
print(diff)

diff_symm = setA.symmetric_difference(setB)
print(diff_symm)

setA.update(setB)
print(setA)

setA.intersection_update(setB)
print(setA)

setA.difference_update(setB)
print(setB)

setA.clear()
setB.clear()


#subset ,superset,join
setA = {1,2,3,4,5,6}
setB= {1,2,3}

print(setA.issubset(setB)) #False
print(setB.issubset(setA)) #true

print(setA.issuperset(setB)) #True
print(setA.isdisjoint(setB))

#copying two sets
setA.clear()
setB.clear()
setA = {1,2,3,4,5,6}
setB = setA #original will also change with =
print(setA)
print(setB)

setB.add(7) 
print(setA)
print(setB)

setC = setA.copy() #This will not update original set
setA.add(11)
print(setA)
print(setC)

#frozenset which cant be changed or updated
a = frozenset([1,2,3,4])
#a.add(4) this will give AttributeError
print(a)

