s = input()
p = input()
flag = False

if p == s:
    flag = True
else:
    print(p[len(p)-1])
    if p[0].isdigit():
        p2 = p[1:len(p)]
        if s == p2:
            flag = True
    if p[len(p)-1].isdigit():
        p2 = p[:len(p)-1]
        if s == p2:
            flag = True
        
    p2 = p.swapcase()
    if s == p2:
        flag = True

if flag:
    print("Yes")
else:
    print("No")
    