#  Write a Shell Program to swap two numbers without using third variable.
#!/bin/bash

# Input two numbers
read -p "Enter the first number: " num1
read -p "Enter the second number: " num2

echo "Before swapping: num1=$num1, num2=$num2"

# Swap the numbers without a third variable
num1=$((num1 + num2))
num2=$((num1 - num2))
num1=$((num1 - num2))

echo "After swapping: num1=$num1, num2=$num2"
