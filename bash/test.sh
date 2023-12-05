#!/bin/bash

# Output file
output_file="output.txt"

# Loop to generate and append 50 lines to the file
for ((i = 1; i <= 50; i++)); do
    # Use bash -c to execute a command to echo the line into the file
    bash -c "echo Line $i >> $output_file"
done

echo "Lines have been written to $output_file."
