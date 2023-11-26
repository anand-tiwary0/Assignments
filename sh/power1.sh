#!/bin/bash

calculate_power(){
  base=$1
  exponent=$2
  result=1

  for((i = 1; i <= exponent; i++)); do
      result=$((result * base))
  done

  echo "result : $result"
}

read -p "enter base: " base
read -p "enter exponent: " exponent

calculate_power "$base" "$exponent"