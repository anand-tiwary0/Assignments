# Write a shell program to read total marks and marks obtained and display the percentage of marks.

read -p "obtained" obt
read -p "total" total

result=$(echo "scale=2; ($obt * 100) / $total" | bc)

echo "result : $result"

