#Write a shell program to read an employee’s name, date of birth, phone number, and city and display those with today’s date.

read -p "enter your name" name
read -p "enter your dob" dob
read -p "enter phone number" phone
read -p "enter your city" city

today=$(date)
echo "$today is date"
echo "$name"
echo "$dob"
echo "$phone"
echo "$city"

