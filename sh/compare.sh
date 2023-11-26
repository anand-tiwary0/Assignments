#!/bin/bash

compare(){
  first=$1
  second=$2
  if [ $first -eq $second ]; then
    echo "$first is equal to $second"
  elif [ $first -lt $second ]; then
    echo "$second is greater then $first"
  else
    echo "$first is greater then $second"
  fi
}


read -p "enter first number" num1
read -p "enter second number" num2

compare "$num1" "$num2"