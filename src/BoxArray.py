n = 9
for i in range (0, n * n):
    print('box[' + str(i % n) + '][' + str(int(i / n)) + '] = box' + str(i), end='; ')
    
    #box[0] = 