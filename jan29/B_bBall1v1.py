p1 = 0
p2 = 0

s = input()
#print(len(s))
i = 0
while i < len(s):
    if s[i] == 'A':
        i += 1
        p1 += int(s[i])
    elif s[i] == 'B':
        i += 1
        p2 += int(s[i])
    
    i += 1

if p1 > p2:
    print('A')
else:
    print('B')