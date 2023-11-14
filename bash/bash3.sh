# #  Write a shell program to read two numbers, then show the result of their addition, subtraction, multiplication, division, and remainder. 

# #!/bin/bash
# read -p "enter first number" first
# read -p "enter second number" second

# sum=$((first + second))
# difference=$((first-second))
# product=$((first*second))
# if["$second" -ne 0];
# then
#     division=$(echo "scale=2; $first/$second" |bc)
#     remainder=$((first%second))
# else
#     division="Undefined (division by zero)"
#     remainder="Undefined (division by zero)"
# fi

# You can create a shell script to read two numbers and perform addition, subtraction, multiplication, division, and calculate the remainder like this:

# ```bash
# #!/bin/bash

# # Input two numbers
# read -p "Enter first number: " num1
# read -p "Enter second number: " num2

# # Perform arithmetic operations
# sum=$((num1 + num2))
# difference=$((num1 - num2))
# product=$((num1 * num2))

# # Check if num2 is not zero to avoid division by zero
# if [ "$num2" -ne 0 ]; then
#     division=$(echo "scale=2; $num1 / $num2" | bc)
#     remainder=$((num1 % num2))
# else
#     division="Undefined (division by zero)"
#     remainder="Undefined (division by zero)"
# fi

# # Display the results
# echo "Results:"
# echo "Addition: $sum"
# echo "Subtraction: $difference"
# echo "Multiplication: $product"
# echo "Division: $division"
# echo "Remainder: $remainder"


#!/bin/bash

# Input two numbers
read -p "Enter first number: " num1
read -p "Enter second number: " num2

# Perform arithmetic operations
sum=$(echo "scale=2; $num1+$num2" | bc)
difference=$((num1 - num2))
product=$((num1 * num2))

# Check if num2 is not zero to avoid division by zero
if [ "$num2" -ne 0 ]; then
    division=$(echo "scale=2; $num1 / $num2" | bc)
    remainder=$((num1 % num2))
else
    division="Undefined (division by zero)"
    remainder="Undefined (division by zero)"
fi

# Display the results
echo "Results:"
echo "Addition: $sum"
echo "Subtraction: $difference"
echo "Multiplication: $product"
echo "Division: $division"
echo "Remainder: $remainder"
