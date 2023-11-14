#!/bin/bash

# Get today's date in the format YYYY-MM-DD
today=$(date +%F)

# Input employee information
read -p "Enter employee's name: " name
read -p "Enter employee's date of birth (YYYY-MM-DD): " dob
read -p "Enter employee's phone number: " phone
read -p "Enter employee's city: " city

# Check if the employee's date of birth matches today's date
if [ "$dob" == "$today" ];
then
    echo "Employee Details:"
    echo "Name: $name"
    echo "Date of Birth: $dob"
    echo "Phone Number: $phone"
    echo "City: $city"
else
    echo "Employee's date of birth does not match today's date."
fi
