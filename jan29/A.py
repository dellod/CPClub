inp = input()
test_cases = int(inp)

i = 0
s = []
while i < test_cases:
    inp = input()
    c = int(inp)
    l = []

    j = 0
    while j < c:
        inp = input()
        flag = True
        for n in l:
            if n == inp:
                flag = False
                break
        if flag:
            l.append(inp)
        j += 1

    s.append(len(l))
    i += 1

#output final result
for n in s:
    print(n)