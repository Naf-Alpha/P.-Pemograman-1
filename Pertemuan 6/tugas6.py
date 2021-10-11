bil = input("Masukkan angka maksimal : ")
bil = int(bil)

i = 0
pangkat = 0
while i != bil :
    if (i == 5 ** pangkat) :
        print(i)
        pangkat += 1
    i += 1