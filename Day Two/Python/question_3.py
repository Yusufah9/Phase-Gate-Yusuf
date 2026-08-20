#print numbers from 1 to 100, but instead of fixed skip rule, dynamically build the skip condition: skip a number if the sum of 
#its digits is divisible by 3, print "Skip" for those instead

for number in range(1, 100):
    if (number % 3 == 0):
        print(number)


