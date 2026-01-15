#list
foods  = ["apple","banana","mango"]
for food in foods:
    print(food)

foods.append("queue")
print(foods)

item = foods.pop()
print(item)
print(foods)

foods.reverse()
print(foods)

#tuples
cars  = "tata","vowkswagon","bmw"
for car in cars:
    print(car)

print(len(cars))
tuplesToList = list(cars)
print(cars)
print(tuplesToList)

#dictionaries
dresses = {"shirt","pants","jeans"}
if "shirt" in dresses:
    print("shirt is present") 
else:
    print("shirt absent")
    
dresses1 = {"tie","shoes"}
dresses.update(dresses1)
print(dresses)