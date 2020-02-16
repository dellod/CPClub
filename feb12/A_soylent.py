# Problem A: Soylent

inp = input()
test_cases = int(inp)


c = []
i = 0
while i < test_cases:
    inp = input()
    c.append(int(inp))
    i += 1

i = 0
while i < test_cases:
    if (int(c[i])%400) == 0:
        print(int(c[i]/400))
    else:
        print(int(c[i]/400) + 1)
    i += 1