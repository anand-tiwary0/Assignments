#!/bin/bash
calculate_year(){
  day=$1
  #calculate year
  year=$((day / 365))
  rem_day=$((day % 365))

  #calculate weeks
  weeks=$((rem_day / 7))
  rem_day=$((rem_day % 7))

  echo "year: $year"
  echo "weeks: $weeks"
  echo "days: $rem_day"
}


read -p "enter days" day

calculate_year "$day"