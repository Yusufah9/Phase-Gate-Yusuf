def factorial_Of(number):
    result = 1
    for count in range(number, 0,-1):
        result *= count
    return result

number = int(input("Enter a number: "))
answer = factorial_Of(number)

print("The factorial of ", number, " is: ", answer)

