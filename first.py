def greet(name):
    return f"Hello, {name}!"


name = input("Enter your name: ")
print(greet(name))  

# This code defines a function called `greet` that takes a name as an argument and returns a greeting message. It then prompts the user to enter their name and prints the greeting message using the `greet` function.

def add(a, b):
    return a + b    
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
result = add(num1, num2)
print(f"The sum of {num1} and {num2} is: {result}")
# This code defines a function called `add` that takes two numbers as arguments and returns their sum. It then prompts the user to enter two numbers, calls the `add` function with those numbers, and prints the result.

def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)
number = int(input("Enter a number to calculate its factorial: "))
if number < 0:
    print("Factorial is not defined for negative numbers.")
else:
    print(f"The factorial of {number} is: {factorial(number)}")
# This code defines a recursive function called `factorial` that calculates the factorial of a given number. It prompts the user to enter a number, checks if it's negative (since factorial is not defined for negative numbers), and if it's non-negative, it calls the `factorial` function and prints the result.
