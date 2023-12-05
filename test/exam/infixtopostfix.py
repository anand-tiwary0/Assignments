output = []
operator = []
priority = {')': 0, '+': 1, '-': 1, '*': 2, '/': 2, '^': 3}

expr = input("enter expression :: ")
print(f"infix expression :: {expr}")
for ch in expr[::-1]:
    if(ch == ')'):
        operator.append(ch)
    elif(ch == '('):
        while(operator[-1] != ')'):
            element = operator.pop()
            output.append(element)
        operator.pop()
    elif(ch == '-' or ch == '+' or ch == '*' or ch == '/' or ch == '^'):
        if(len(operator)>0):
            while(priority[operator[-1]]>=priority[ch]):
                element = operator.pop()
                output.append(element)
                if(len(operator)==0):
                    break
        operator.append(ch)
    else:
        output.append(ch)

while(len(operator)!=0):
    output.append(operator.pop())

print("prefix of the given infix :: ", end="  ")
for ch in output[::-1]:
    print(ch,end='')