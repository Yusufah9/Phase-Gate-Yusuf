
sum_ = 0
count = 0
average = 0

while count < 10:
    number = int(input(f"Enter score {count + 1}: "))
    sum_ += number 
    count += 1
    average = count / sum_

print("The average of the 10 scores is:", average)
print("The som of 10 scores is:", sum_)

