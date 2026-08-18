#Print numbers 1 to 100 with helloworld rules, but replace numbers withh hello/world/orion based on diviibility by 3, 5 and 7 respectively and for any number where none apply, print
#the number reversed digit-wise instead of the number itself.

for number in range(1, 100):
    if (number % 3 == 0 and number % 5 == 0):
        print(number)
    elif(number % 7 == 0):
        print("The number reversed digit-wise instead of the number itself")
