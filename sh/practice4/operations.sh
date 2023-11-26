#Write a shell program to read two numbers, then show the result of their addition, subtraction, multiplication, division, and remainder.

read -p "enter first number : " first
read -p "enter second number : " second

echo "sum=$(echo "scale=2; $first + $second" | bc)"
echo "product=$(echo "scale=2; $first * $second" | bc)"
echo "division=$(echo "scale=2; $first / $second" | bc)"
echo "remainder=$(echo "scale=2; $first % $second" | bc)"
echo "subtraction=$(echo "scale=2; $first - $second" | bc)"


