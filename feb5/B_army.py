# Problem B: Army Strength (Easy)

inp = input()
test_cases = int(inp)

i = 0
while i < test_cases:
    inp = input() #read empty line
    inp = input()
    res = [int(j) for j in inp.split() if j.isdigit()]
    g = res[0]
    m = res[1]

    inp = input()
    res = [int(j) for j in inp.split() if j.isdigit()]
    