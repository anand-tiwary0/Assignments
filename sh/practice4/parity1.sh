#!/bin/bash

# Prompt the user to enter the obtained and total values
read -p "Enter obtained: " obt
read -p "Enter total: " total

# Use bc for floating-point arithmetic
result=$(echo "scale=2; ($obt * 100) / $total" | bc)

echo "Result: $result"
