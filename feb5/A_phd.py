# Problem A: Help a PhD candidate out!

inp = input()
test_cases = int(inp)

s = []
i = 0
while i < test_cases:
    inp = input()
    s.append(inp)
    i += 1

i = 0
while i < test_cases:    
    if s[i] == "P=NP":
        print("skipped")
    else:
        res = [int(j) for j in s[i].split("+") if j.isdigit()]
        print(res[0]+res[1])
    i += 1