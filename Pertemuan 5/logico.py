a = input("Masukkan Nilai A = ")
b = input("Masukkan Nilai B = ")

print("A == B = "+str(a==b))
print("A != B = "+str(a!=b))
print("A > B = "+str(a>b))
print("A < B = "+str(a<b))
print("A <= B = "+str(a<=b))
print("A >= B = "+str(a>=b))

x = int(a)<5 and int(b)>4
y = int(a)<5 or int(b)>4
print("A < 5 and B > 4 = "+str(x))
print("A < 5 or B > 4 = "+str(y))
print("A < 5 and(not) B > 4 = "+str(not(int(a<b))))