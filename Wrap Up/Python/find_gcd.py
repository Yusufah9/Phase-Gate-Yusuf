def find_gcd(number1, number2):
    gcd = 1

    for count in range(1, min(number1, number2) + 1):
        if number1 % count == 0 and number2 % count == 0:
            gcd = count

    return gcd


first_number = int(input("Enter first number: "))
second_number = int(input("Enter second number: "))

answer = find_gcd(first_number, second_number)

print("The GCD of ", first_number, " and ", second_number, " is: ", answer)
