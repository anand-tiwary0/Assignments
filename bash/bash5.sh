#!/bin/bash

# Input temperature in Celsius
read -p "Enter temperature in Celsius: " celsius

# Calculate temperature in Fahrenheit
fahrenheit=$(echo "scale=2; ($celsius * 9/5) + 32" | bc)

# Display the result
echo "$celsius°C is equal to $fahrenheit°F"
