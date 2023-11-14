# 2) Write a shell program to read total marks and marks obtained and display the percentage of marks.
#!/bin/bash

#taking user input for total marks and obatained marks and storing them in variables
read -p "enter total marks :: " total
read -p "enter obtained marks :: " obtained

percentage=$(echo "scale=2; ($obtained/$total)*100" | bc)

#printing output in console
echo "percetange obtained = $percentage%"