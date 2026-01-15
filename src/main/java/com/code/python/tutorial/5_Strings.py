# Strings: A string is an ordered and immutable collection data types taht is used by text representation. 
# A string is created with single or double quotes

#creation
my_string = "hello world"
print(my_string)

my_string1 = 'hello world'
print(my_string1)

my_string2 = "I'm a programmer"
print(my_string2)

mystring_big = """Hello
big
"""
mystring_big1 = """Hello \
big
"""
print(mystring_big)
print(mystring_big1)

#get chars
char = my_string[0]
print(char)
print(my_string[-1])
#my_string[0] = 'h'  , error as string is immutable and cannot be changed

#slicing

print(my_string[1:5])
print(my_string[:5])
print(my_string[::-1])#reverse
print(my_string[::2])#skip 2nd char

