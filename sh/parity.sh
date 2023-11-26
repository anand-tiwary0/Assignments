#!/bin/bash

parity(){
  number=$1

  if [ $((number % 2)) -eq 0 ]; then
      echo "$number is even" 
  else
      echo "$number is odd"
  fi 
}

read -p "enter number" number

parity "$number"