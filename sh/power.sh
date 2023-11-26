#!/bin/bash

# Function to calculate power
calculate_power() {
    base=$1
    exponent=$2
    result=1

    for ((i = 1; i <= exponent; i++)); do
        result=$((result * base))
    done

    echo "Result: $result"
}

# Prompt the user to enter the base and exponent
read -p "Enter the base: " base
read -p "Enter the exponent: " exponent

# Call the function to calculate power
calculate_power "$base" "$exponent"
