#j = 7
#i = 1
#while True:
#    i += 1
#    print(f"I={i} J={j}")
#    j -= 5
#    if j < 0:
#        break


## Sequence IJ 2 ##
#while True:
#    print(f"I={i} J={j}")
#    j -= 1
#    if j < 5:
#        i += 2
#        j = 7
#        if i > 9:
#            break

## Sequence IJ 3 ##

#i = 1
#j = 7
#rep = 0
#while True:
#    
#    print(f"I={i} J={j}")
#    j -= 1
#    rep += 1
#    
#    if rep == 3:
#        i += 2
#        j = 7 + i -1
#        rep = 0
#    if i > 9:
#        break

## Sequence IJ 4 ##

i = 0
j = 1
rep = 0
while True:
    if i == 0 or i == 1 or i > 1.8:
        print(f"I={i:.0f} J={j + i:.0f}")

        rep += 1
        j += 1
    
    else: 
        print(f"I={i:.1f} J={j + i:.1f}")

        rep += 1
        j += 1
    if rep == 3:
        i += 0.2
        j = 1
        rep = 0
    if i >= 2.0:
        break
    