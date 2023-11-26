# Write a Shell Program to swap two numbers without using third variable.

read -p "first" first
read -p "second" second

total=$(echo "scale=2; $first + $second" | bc)
first=$(echo "scale=2; $total - $first" | bc)
second=$(echo "scale=2; $total - $first" | bc)

echo "after swap"
echo "first : $first"
echo "second : $second"

