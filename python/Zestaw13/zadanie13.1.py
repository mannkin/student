DELTAS = [
    (2, 1),
    (1, 2),
    (1, -2),
    (-2, 1),
    (-1, 2),
    (2, -1),
    (-1, -2),
    (-2, -1),
]

def printBoard(l):
    for i in l:
        print(i)
    print('\n')

def valid(l, i, j):
    return 0 <= i < N and 0 <= j < N and l[i][j] is 0

def createBoard(n):
    return [[0 for i in range(n)] for j in range(n)]

def search(l, count, i, j):
    check = False
    move = 0
    while (not check) and (move < MOVES):
        x, y = DELTAS[move]
        u, v = i+x, j+y
        if valid(l, u, v):
            l[u][v] = count
            if count < N * N:
                check = search(l, count+1, u, v)
                if not check:
                    l[u][v] = 0
            else:
                check = True
        move += 1
    return check

N = 6
MOVES = 8
L = createBoard(N)
M = createBoard(N)
K = createBoard(N)
O = createBoard(N)
L[2][2] = 1
M[0][2] = 1
K[2][1] = 1
O[1][0] = 1

if search(L, 2, 2, 2):
    printBoard(L)
else:
    print('Brak rozwiazania\n')

if search(M, 2, 0, 2):
    printBoard(M)
else:
    print('Brak rozwiazania\n')

if search(O, 2, 1, 0): # brak mocy zeby sprawdzic czy instnieje rozwiazanie
    printBoard(K)
else:
    print('Brak rozwiazania\n')

if search(K, 2, 1, 1): # brak mocy zeby sprawdzic czy instnieje rozwiazanie
    printBoard(K)
else:
    print('Brak rozwiazania\n')