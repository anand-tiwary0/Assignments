#Write a Shell Program to check the largest number out of 3 given numbers.  

compare(){
  first=$1
  second=$2
  third=$3

  if [ $first -gt $second ]; then
      if [ $first -gt $third ]; then
        echo "$first is greatest"
      else
        echo "$third is greatest"
      fi
  elif [ $second -gt $third ]; then
      echo "$second is greatest"
  else 
      echo "$third is greatest"
  fi
}



read -p "enter first number" first
read -p "enter second number:" second
read -p "enter third number: " third

compare "$first" "$second" "$third"