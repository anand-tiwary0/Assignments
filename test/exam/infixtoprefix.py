# two stacks to maintain operator and operand
output = []  # this will store the resulting operators
operator = []  # this will act as stack for the incoming opertors

# dictionary to define priotiry
priority = {'+': 1, '-': 1, '*': 2, '/': 2, '^': 3, '(': 0}  # as compared to ( all other operators precedence will be
# greater than this as all will be pushed after this occur
# take user input
# expr = input("enter the expression (don't use space in between) :: ")
expr = "a*b+(c*d)"
# iterate through the expression from start till end
for ch in expr:
    if (ch == '('):
        operator.append(ch)
    elif (ch == ')'):
        while (operator[-1] != '('):  # pop until top becomes (
            popped = operator.pop()
            output.append(popped)
        operator.pop()  # then pop (
    elif (ch == '+' or ch == '-' or ch == '*' or ch == '/' or ch == '^'):
        # we have to pop until we found any operator with greater or equal priority
        if (len(operator) > 0):
            while (priority[operator[-1]] >= priority[ch]):
                removed = operator.pop()
                output.append(removed)
                if (len(operator) == 0):
                    break
        operator.append(ch)
    else:
        output.append(ch)

# dump the stack in the output
while (len(operator) != 0):
    output.append(operator.pop())

print(f"infix notation is :: {expr}")
print("postfix notation is :: ", end='  ')

for ch in output:
    print(ch, end='')
