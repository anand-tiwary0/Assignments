#Write a shell program to convert an entered temperature in centigrade to Fahrenheit.

#!/bin/bash

read -p "enter temp in centigrade : " cent

echo "temp in fah = $(echo "scale=2; (9 * $cent) / 5 + 32" | bc)"